package datastructures.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

public class GraphTest {
    private Graph<Integer> graph;

    @BeforeEach
    void setUp() {
        graph = new Graph<>();
    }

    @Test
    void testAddVertex() {
        assertEquals(1, graph.addVertex(1));
        assertEquals(2, graph.addVertex(2));
        assertEquals(2, graph.size());
    }

    @Test
    void testAddEdge() {
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addEdge(1, 2, 5);

        Collection<Graph<Integer>.Edge<Integer>> neighbors = graph.getNeighbors(1);
        assertEquals(1, neighbors.size());
        Graph<Integer>.Edge<Integer> edge = neighbors.iterator().next();
        assertEquals(2, edge.getVertex());
        assertEquals(5, edge.getWeight());
    }

    @Test
    void testGetVertices() {
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);

        Collection<Integer> vertices = graph.getVertices();
        assertEquals(3, vertices.size());
        assertTrue(vertices.contains(1));
        assertTrue(vertices.contains(2));
        assertTrue(vertices.contains(3));
    }

    @Test
    void testGetNeighbors() {
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addEdge(1, 2, 5);

        Collection<Graph<Integer>.Edge<Integer>> neighbors = graph.getNeighbors(1);
        assertEquals(1, neighbors.size());
        Graph<Integer>.Edge<Integer> edge = neighbors.iterator().next();
        assertEquals(2, edge.getVertex());
        assertEquals(5, edge.getWeight());
    }

    @Test
    void testGraphWithOneVertexAndEdge() {
        Graph<Integer> graph = new Graph<>();

        // Add a single vertex
        int vertex = graph.addVertex(1);
        assertEquals(1, graph.size());
        assertTrue(graph.getVertices().contains(vertex));

        // Verify that the graph has no edges initially
        Collection<Graph<Integer>.Edge<Integer>> neighbors = graph.getNeighbors(1);
        assertTrue(neighbors.isEmpty());

        // Add an edge to itself
        graph.addEdge(1, 1, 0); // Adding an edge from vertex 1 to itself with weight 0

        // Verify that the edge is properly added
        neighbors = graph.getNeighbors(1);
        assertEquals(1, neighbors.size());
        Graph<Integer>.Edge<Integer> edge = neighbors.iterator().next();
        assertEquals(1, edge.getVertex());
        assertEquals(0, edge.getWeight());
    }

    @Test
    void testSize() {
        assertEquals(0, graph.size());
        graph.addVertex(1);
        graph.addVertex(2);
        assertEquals(2, graph.size());
    }
}
