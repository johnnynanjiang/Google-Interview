package io.github.johnnynanjiang.google_interview.algorithm.graph;

import io.github.johnnynanjiang.google_interview.datastructure.graph.Edge;
import io.github.johnnynanjiang.google_interview.datastructure.graph.Graph;
import io.github.johnnynanjiang.google_interview.datastructure.graph.Vertex;
import io.github.johnnynanjiang.google_interview.util.Print;

import java.util.*;

/**
 * Created by nanjiang on 23/12/17.
 * reference https://www.youtube.com/watch?v=0nVYi3o161A
 * */

public class Dijkstra {
    public static List<Vertex> getShortestPath(Graph graph, Vertex a, Vertex g) {

        Print.toConsole(getShortestDistances(graph, a, g).toString());

        List<Vertex> path = new ArrayList<>();
        return path;
    }

    public static Map<Vertex, Integer> getShortestDistances(Graph graph, Vertex a, Vertex g) {
        HashSet<Vertex> unhandledVertices = new HashSet<>();
        HashSet<Vertex> handledVertices = new HashSet<>();
        Map<Vertex, Integer> shortestDistances = getInitShortestDistances(graph.getVertices(), a);

        unhandledVertices.addAll(graph.getVertices());

        while (!unhandledVertices.isEmpty()) {
            Vertex vertexOfMinimumDistance = getVertexOfMinimumDistance(unhandledVertices, shortestDistances);

            List<Edge> neighbourEdges = graph.getNeighbourEdges(vertexOfMinimumDistance);

            for (Edge edge : neighbourEdges) {
                Vertex neighbourVertex = graph.getNeighbour(edge, vertexOfMinimumDistance);

                int currentDistance = shortestDistances.get(neighbourVertex);
                int newDistance = edge.getWeight() + shortestDistances.get(vertexOfMinimumDistance);

                if (currentDistance > newDistance) {
                    shortestDistances.put(neighbourVertex, newDistance);
                }
            }

            unhandledVertices.remove(vertexOfMinimumDistance);
            handledVertices.add(vertexOfMinimumDistance);
        }

        return shortestDistances;
    }

    private static Vertex getVertexOfMinimumDistance(HashSet<Vertex> unhandledVertices, Map<Vertex, Integer> shortestDistances) {
        Vertex vertexOfMinimumDistance = null;

        for (Vertex v : unhandledVertices) {
            if ((vertexOfMinimumDistance == null) || (shortestDistances.get(v) < shortestDistances.get(vertexOfMinimumDistance))) {
                vertexOfMinimumDistance = v;
            }
        }

        return vertexOfMinimumDistance;
    }

    private static Map<Vertex, Integer> getInitShortestDistances(List<Vertex> vertices, Vertex vertex) {
        HashMap<Vertex, Integer> shortestDistances = new HashMap<>();

        for(Vertex v : vertices) {
            if (v.equals(vertex)) {
                shortestDistances.put(v, 0);
            } else {
                shortestDistances.put(v, Integer.MAX_VALUE);
            }
        }

        return shortestDistances;
    }
}
