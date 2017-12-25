package io.github.johnnynanjiang.google_interview.algorithm.graph;

import java.util.Deque;
import java.util.List;

import io.github.johnnynanjiang.google_interview.util.ArrayHelper;
import org.junit.Test;

import io.github.johnnynanjiang.google_interview.datastructure.graph.Graph;
import io.github.johnnynanjiang.google_interview.datastructure.graph.GraphTest;
import io.github.johnnynanjiang.google_interview.datastructure.graph.Vertex;

import static org.junit.Assert.*;

/**
 * Created by nanjiang on 23/12/17.
 */

public class DijkstraTest {
    @Test
    public void testGetShortestDistances() {
        Graph graph = GraphTest.graph;

        assertEquals(
                "{a=Pair[a,0], b=Pair[a,3], c=Pair[a,5], d=Pair[b,5], e=Pair[c,11], f=Pair[c,8], g=Pair[f,9]}",
                Dijkstra.getShortestDistances(graph, graph.getVertex("a"), graph.getVertex("g")).toString()
        );
    }

    @Test
    public void testGetShortestPath() {
        Graph graph = GraphTest.graph;

        Vertex[] path = Dijkstra.getShortestPath(graph, graph.getVertex("a"), graph.getVertex("g"));

        assertEquals("[a, c, f, g]", new ArrayHelper().print(path));
    }
}