package io.github.johnnynanjiang.google_interview.algorithm.graph;

import io.github.johnnynanjiang.google_interview.datastructure.graph.Graph;
import io.github.johnnynanjiang.google_interview.datastructure.graph.Vertex;

import java.util.*;

/**
 * Created by nanjiang on 23/12/17.
 * reference https://www.youtube.com/watch?v=0nVYi3o161A
 * */

public class Dijkstra {
    public static List<Vertex> getShortestPath(Graph graph, Vertex a, Vertex g) {
        HashSet<Vertex> unhandledVertices = new HashSet<>();
        HashSet<Vertex> handledVertices = new HashSet<>();
        Map<Vertex, Integer> shortestDistances = getInitShortestDistances(graph.getVertices(), a);

        unhandledVertices.addAll(graph.getVertices());

        List<Vertex> path = new ArrayList<>();
        return path;
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
