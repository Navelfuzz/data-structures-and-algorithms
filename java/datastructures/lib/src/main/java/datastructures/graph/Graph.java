package datastructures.graph;
import java.util.*;

class Graph<T> {
    private Map<T, List<Edge<T>>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    public class Edge<T> {
        private T vertex;
        private int weight;

        public Edge(T vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        public T getVertex() {
            return vertex;
        }

        public int getWeight() {
            return weight;
        }
    }

    public T addVertex(T value) {
        adjacencyList.put(value, new ArrayList<>());
        return value;
    }

    public void addEdge(T from, T to, int weight) {
        if (!adjacencyList.containsKey(from) || !adjacencyList.containsKey(to)) {
            throw new IllegalArgumentException("Both vertices should already be in the graph.");
        }

        // Add an edge from 'from' to 'to'
        adjacencyList.get(from).add(new Edge<>(to, weight));

        // Check if it's a self-loop
        if (!from.equals(to)) {
            // Add an edge from 'to' to 'from' (assuming an undirected graph)
            adjacencyList.get(to).add(new Edge<>(from, weight));
        }
    }

    public Collection<T> getVertices() {
        return adjacencyList.keySet();
    }

    public Collection<Edge<T>> getNeighbors(T vertex) {
        if (!adjacencyList.containsKey(vertex)) {
            throw new IllegalArgumentException("Vertex not found in the graph.");
        }
        return adjacencyList.get(vertex);
    }

    public int size() {
        return adjacencyList.size();
    }
}