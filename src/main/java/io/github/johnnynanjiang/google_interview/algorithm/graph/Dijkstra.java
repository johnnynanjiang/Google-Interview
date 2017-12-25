package io.github.johnnynanjiang.google_interview.algorithm.graph;

import com.sun.tools.javac.util.Pair;
import io.github.johnnynanjiang.google_interview.datastructure.graph.Edge;
import io.github.johnnynanjiang.google_interview.datastructure.graph.Graph;
import io.github.johnnynanjiang.google_interview.datastructure.graph.Vertex;

import java.util.*;

/**
 * Created by nanjiang on 23/12/17.
 * reference https://www.youtube.com/watch?v=0nVYi3o161A
 * */

public class Dijkstra {
    public static Vertex[] getShortestPath(Graph graph, Vertex from, Vertex to) {
        Map<Vertex, Pair<Vertex, Integer>> shortestDistances = getShortestDistances(graph, from, to);

        Deque<Vertex> path = new LinkedList<>();

        path.push(to);

        Vertex next = to;
        while (true) {
            Pair<Vertex, Integer> p = shortestDistances.get(next);
            next = p.fst;

            path.push(next);

            if (next.equals(from)) {
                break;
            }
        }

        Vertex[] result = new Vertex[path.size()];
        path.toArray(result);

        return result;
    }

    public static Map<Vertex, Pair<Vertex, Integer>> getShortestDistances(Graph graph, Vertex from, Vertex to) {
        HashSet<Vertex> unhandledVertices = new HashSet<>();
        HashSet<Vertex> handledVertices = new HashSet<>();
        Map<Vertex, Pair<Vertex, Integer>> shortestDistances =
                getInitShortestDistances(graph.getVertices(), from);

        unhandledVertices.addAll(graph.getVertices());

        while (!unhandledVertices.isEmpty()) {
            Vertex vertexOfMinimumDistance = getVertexOfMinimumDistance(unhandledVertices, shortestDistances);

            List<Edge> neighbourEdges = graph.getNeighbourEdges(vertexOfMinimumDistance);

            for (Edge edge : neighbourEdges) {
                Vertex neighbourVertex = graph.getNeighbour(edge, vertexOfMinimumDistance);

                Pair<Vertex, Integer> distance = shortestDistances.get(neighbourVertex);
                int currentDistance = distance.snd;
                int newDistance = edge.getWeight() + shortestDistances.get(vertexOfMinimumDistance).snd;

                if (currentDistance > newDistance) {
                    shortestDistances.put(neighbourVertex, new Pair(vertexOfMinimumDistance, newDistance));
                }
            }

            unhandledVertices.remove(vertexOfMinimumDistance);
            handledVertices.add(vertexOfMinimumDistance);
        }

        return shortestDistances;
    }

    private static Vertex getVertexOfMinimumDistance(HashSet<Vertex> unhandledVertices, Map<Vertex, Pair<Vertex, Integer>> shortestDistances) {
        Vertex vertexOfMinimumDistance = null;

        for (Vertex v : unhandledVertices) {
            if ((vertexOfMinimumDistance == null) || (shortestDistances.get(v).snd < shortestDistances.get(vertexOfMinimumDistance).snd)) {
                vertexOfMinimumDistance = v;
            }
        }

        return vertexOfMinimumDistance;
    }

    private static Map<Vertex, Pair<Vertex, Integer>> getInitShortestDistances(List<Vertex> vertices, Vertex vertex) {
        HashMap<Vertex, Pair<Vertex, Integer>> shortestDistances = new HashMap<>();

        for(Vertex v : vertices) {
            if (v.equals(vertex)) {
                shortestDistances.put(v, new Pair(vertex, 0));
            } else {
                shortestDistances.put(v, new Pair(vertex, Integer.MAX_VALUE));
            }
        }

        return shortestDistances;
    }
}
