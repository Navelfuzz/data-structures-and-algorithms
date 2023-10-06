# Code Challenge 36 - Breadth First Graph
Implement a breadth-first traversal on a graph.

## Whiteboard Process
![whiteboard](cc36.png)

## Approach & Efficiency
The Time complexity is O(V + E) and space complexity is O(V).
## Solution
```java
    List<Vertex<T>> visited = new ArrayList<>();
    Queue<Vertex<T>> queue = new LinkedList<>();

    queue.add(start);
    visited.add(start);

    while (!queue.isEmpty()) {
      Vertex<T> currVertex = queue.poll();

      for (Edge<T> edge : adjacencyLists.get(currVertex)) {

        Vertex<T> neighbor = edge.destination;

        if (!visited.contains(neighbor)) {
          queue.add(neighbor);
          visited.add(neighbor);
        }
      }
    }

    return visited;
}
```