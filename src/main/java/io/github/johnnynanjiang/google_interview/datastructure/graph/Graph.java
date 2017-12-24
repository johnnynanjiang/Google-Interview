package io.github.johnnynanjiang.google_interview.datastructure.graph;

/**
 * Created by nanjiang on 22/12/17.
 */

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Graph {
    private final List<Vertex> vertices;
    private final List<Edge> edges;

    public Graph(List<Vertex> vertexes, List<Edge> edges) {
        this.vertices = vertexes;
        this.edges = edges;
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public Vertex getVertex(String id) {
        return vertices.stream().filter(v -> id.equals(v.getId())).findFirst().orElse(null);
    }

    public List<Vertex> getNeighbours(Vertex vertex) {
        return edges.stream().
                filter(e -> e.getSource().equals(vertex) || e.getDestination().equals(vertex)).
                map(e -> e.getSource().equals(vertex) ? e.getDestination() : e.getSource()).
                collect(Collectors.toList());
    }
}