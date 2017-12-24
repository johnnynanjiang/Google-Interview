package io.github.johnnynanjiang.google_interview.algorithm.graph;

import java.util.List;

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

        assertEquals("{a=0, b=3, c=5, d=5, e=11, f=8, g=9}", Dijkstra.getShortestDistances(graph, graph.getVertex("a"), graph.getVertex("g")).toString());
    }

    @Test
    public void testGetShortestPath() {
        Graph graph = GraphTest.graph;

        List<Vertex> path = Dijkstra.getShortestPath(graph, graph.getVertex("a"), graph.getVertex("g"));

        assertEquals(4, path.size());
        assertEquals("a", path.get(0).getId());
        assertEquals("c", path.get(1).getId());
        assertEquals("f", path.get(2).getId());
        assertEquals("g", path.get(3).getId());
    }
}