import java.util.*;

// An AdjacencyList class can implement a graph 
public class AdjacencyList<V, E> implements Graph<V, E> {
     private boolean isDirected;
     private Map<Vertex<V>, List<Edge<E, V>>> adj;

    // Returns adjacency list
    public Map<Vertex<V>, List<Edge<E, V>>> getAdj() {
        return adj;
    }

    // Constructs an empty adjacency list
    public AdjacencyList(boolean directed) {
        isDirected = directed;
        adj = new HashMap<>();
    }

    // Adds given vertex to graph
    public void addVertex(Vertex<V> vertex){
        if (!adj.containsKey(vertex)) {
            adj.put(vertex, new LinkedList<>());
        }
    }

    // Adds given edge to graph between two existing vertices
    public void addEdge(Vertex<V> source, Vertex<V> destination) {
        if (!adj.containsKey(source)) {
            addVertex(source);
        }
        adj.get(source).add(new Edge<E, V>(source, destination, null));
        if (!adj.containsKey(destination)) {
            addVertex(destination);
        }
        if (isDirected == false) {
            adj.get(destination).add(new Edge<E, V>(destination, source, null));
        }
    }

    // Removes given vertex from graph
    public void removeVertex(Vertex<V> vertex) {
        adj.remove(vertex);
    }

    // Removes given edge from graph
    public void removeEdge(Vertex<V> source, Vertex<V> destination) {
        adj.get(source).remove(destination);
        if (isDirected == false) {
            adj.get(destination).remove(source);
        }
    }

    // Checks if given vertex is in graph
    // Returns true if found and false otherwise
    public boolean containsVertex(Vertex<V> vertex) {
        if (adj.containsKey(vertex)) {
            return true;
        }
        return false;
    }

    // Checks if given edge is in graph
    // Returns true if found and false otherwise
    public boolean containsEdge(Vertex<V> source, Vertex<V> destination) {
        if (adj.get(source).contains(destination)) {
            return true;   
        }
        return false;
    }

    // Returns a string representation of the graph/adjacency list
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Vertex<V> key : adj.keySet()) {
            s.append(key.toString() + ": " + adj.get(key).toString());
            s.append("\n");
        }
        return (s.toString());
    }
}
