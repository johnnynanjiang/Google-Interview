package io.github.johnnynanjiang.google_interview.algorithm.graph;

import io.github.johnnynanjiang.google_interview.datastructure.graph.Edge;
import io.github.johnnynanjiang.google_interview.datastructure.graph.Graph;
import io.github.johnnynanjiang.google_interview.datastructure.graph.Vertex;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by nanjiang on 23/12/17.
 */

public class DijkstraTest {
    @Test
    public void test() {
        List<Vertex> vertices = new ArrayList<>();

        Vertex a = new Vertex("a", "a");
        vertices.add(a);

        Vertex b = new Vertex("b", "b");
        vertices.add(b);

        Vertex c = new Vertex("c", "c");
        vertices.add(c);

        Vertex d = new Vertex("d", "d");
        vertices.add(d);

        Vertex e = new Vertex("e", "e");
        vertices.add(e);

        Vertex f = new Vertex("f", "f");
        vertices.add(f);

        Vertex g = new Vertex("g", "g");
        vertices.add(g);

        List<Edge> edges = new ArrayList<>();

        edges.add(new Edge("a-b(3)", a, b, 3));
        edges.add(new Edge("a-c(5)", a, c, 5));
        edges.add(new Edge("a-d(6)", a, d, 6));
        edges.add(new Edge("b-d(2)", b, d, 2));
        edges.add(new Edge("d-c(2)", d, c, 2));
        edges.add(new Edge("d-f(9)", d, f, 9));
        edges.add(new Edge("c-e(6)", c, e, 6));
        edges.add(new Edge("c-f(3)", c, f, 3));
        edges.add(new Edge("c-g(7)", c, g, 7));
        edges.add(new Edge("e-f(5)", e, f, 5));
        edges.add(new Edge("e-g(2)", e, g, 2));
        edges.add(new Edge("f-g(1)", f, g, 1));

        Graph graph = new Graph(vertices, edges);
    }

}