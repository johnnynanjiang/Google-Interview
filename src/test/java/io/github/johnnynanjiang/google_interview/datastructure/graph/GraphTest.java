package io.github.johnnynanjiang.google_interview.datastructure.graph;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by nanjiang on 24/12/17.
 */

public class GraphTest {
    public static Graph graph;

    static {
        List<Vertex> vertices = new ArrayList<>();

        vertices.add(new Vertex("a", "a"));
        vertices.add(new Vertex("b", "b"));
        vertices.add(new Vertex("c", "c"));
        vertices.add(new Vertex("d", "d"));
        vertices.add(new Vertex("e", "e"));
        vertices.add(new Vertex("f", "f"));
        vertices.add(new Vertex("g", "g"));

        List<Edge> edges = new ArrayList<>();

        edges.add(new Edge("a-b(3)", new Vertex("a", "a"), new Vertex("b", "b"), 3));
        edges.add(new Edge("a-c(5)", new Vertex("a", "a"), new Vertex("c", "c"), 5));
        edges.add(new Edge("a-d(6)", new Vertex("a", "a"), new Vertex("d", "d"), 6));
        edges.add(new Edge("b-d(2)", new Vertex("b", "b"), new Vertex("d", "d"), 2));
        edges.add(new Edge("d-c(2)", new Vertex("d", "d"), new Vertex("c", "c"), 2));
        edges.add(new Edge("d-f(9)", new Vertex("d", "d"), new Vertex("f", "f"), 9));
        edges.add(new Edge("c-e(6)", new Vertex("c", "c"), new Vertex("e", "e"), 6));
        edges.add(new Edge("c-f(3)", new Vertex("c", "c"), new Vertex("f", "f"), 3));
        edges.add(new Edge("c-g(7)", new Vertex("c", "c"), new Vertex("g", "g"), 7));
        edges.add(new Edge("e-f(5)", new Vertex("e", "e"), new Vertex("f", "f"), 5));
        edges.add(new Edge("e-g(2)", new Vertex("e", "e"), new Vertex("g", "g"), 2));
        edges.add(new Edge("f-g(1)", new Vertex("f", "f"), new Vertex("g", "g"), 1));

        graph = new Graph(vertices, edges);
    }

    @Test
    public void testGetVertex() {
        assertEquals("a", graph.getVertex("a").getId());
        assertEquals("g", graph.getVertex("g").getId());
        assertEquals(null, graph.getVertex("NonExistentId"));
    }
}