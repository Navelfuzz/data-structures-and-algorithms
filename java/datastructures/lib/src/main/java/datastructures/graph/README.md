# Code Challenge: Class 35 - Graph Implementation
Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:

1. add vertex
    * Arguments: value
    * Returns: The added vertex
    * Add a vertex to the graph
2. add edge
   * Arguments: 2 vertices to be connected by the edge, weight (optional)
   * Returns: nothing
   * Adds a new edge between two vertices in the graph
   * If specified, assign a weight to the edge
   * Both vertices should already be in the Graph
3. get vertices
   * Arguments: none
   * Returns all of the vertices in the graph as a collection (set, list, or similar)
   * Empty collection returned if there are no vertices
4. get neighbors
   * Arguments: vertex
   * Returns a collection of edges connected to the given vertex
   * Include the weight of the connection in the returned collection
   * Empty collection returned if there are no vertices
5. size
   * Arguments: none
   * Returns the total number of vertices in the graph
   * 0 if there are none

Write tests to prove the following functionality:

1. Vertex can be successfully added to the graph
2. An edge can be successfully added to the graph
3. A collection of all vertices can be properly retrieved from the graph
4. All appropriate neighbors can be retrieved from the graph
5. Neighbors are returned with the weight between vertices included
6. The proper size is returned, representing the number of vertices in the graph
7. graph with only one vertex and edge can be properly returned

## Whiteboard Process
<!-- Embedded whiteboard image -->

## Approach & Efficiency

1. Constructor (`Graph()`):
* Approach: Initializes an empty adjacency list, which will store the vertices and their corresponding edges.
* Efficiency: O(1) - Constant time complexity, as it involves a single operation to create an empty HashMap. Space Complexity: O(1) - Constant space to store the empty adjacency list.

2. Adding a Vertex (addVertex(T value)):
* Approach: Adds a new vertex to the graph by creating a new entry in the adjacency list with an empty list for edges.
* Efficiency: O(1) - Constant time complexity, as it involves adding a single entry to the HashMap.

3. Adding an Edge (addEdge(T from, T to, int weight)):
* Approach: Adds a new edge between two vertices in the graph. It first checks if both vertices are in the graph, and then 
adds the edge information to their respective lists in the adjacency list.
* Efficiency: O(1) - Constant time complexity for adding a single edge. However, if we consider iterating over all vertices, 
the overall time complexity for adding all edges would be O(V), where V is the number of vertices. Space Complexity: O(1) - Constant space to store the edge information in the adjacency list.

4. Getting All Vertices (getVertices()):
* Approach: Retrieves all the vertices in the graph by returning the keys of the adjacency list (HashMap).
* Efficiency: O(V) - Linear time complexity, where V is the number of vertices, as it involves iterating over all keys in the HashMap. Space Complexity: O(V) - Linear space to store the vertices in the result collection.

5. Getting Neighbors of a Vertex (getNeighbors(T vertex)):
* Approach: Retrieves all the neighbors (edges) of a given vertex by looking up its corresponding list of edges in the adjacency list.
* Efficiency: O(E) - Linear time complexity, where E is the number of edges connected to the given vertex. In the worst case, 
if a vertex is connected to many other vertices, this operation could be relatively slow. Space Complexity: O(E) - Linear space to store the neighbors in the result collection.

6. Getting the Size (size()):
* Approach: Returns the total number of vertices in the graph, which is equal to the size of the adjacency list (number of entries).
* Efficiency: O(1) - Constant time complexity, as it involves returning the size of the HashMap, which is a quick operation. Space Complexity: O(1) - Constant space to store the size value.


Overall, the efficiency of the Graph class methods depends on the specific operation being performed. Most operations have 
constant time complexity (O(1)), but getting neighbors can take linear time (O(E)) in the worst case. The efficiency also 
depends on the number of vertices and edges in the graph (V and E, respectively).

## Solution
```java
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
```