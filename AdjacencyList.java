import java.util.*;

// An AdjacencyList class can implement a graph 
public class AdjacencyList<V, E> implements Graph<V, E> {

    private Map<Vertex<V>, List<Edge<V, E>>> adj;
    private final boolean isDirected;

    // Constructs an empty adjacency list
    public AdjacencyList(boolean directed) {
        isDirected = directed;
        adj = new HashMap<>();
    }

    // Returns an iterable collection containing all the vertices of the given graph
    public Iterable<Vertex<V>> vertices() {
        return new HashSet<>(adj.keySet());
    }

    // Returns a set containing all the edges of the given graph sorted in ascending order by weight
    public Set<Edge<V, E>> edges() {
        Set<Edge<V, E>> e = new TreeSet<>();
        for (List<Edge<V, E>> value : adj.values()) {
            e.addAll(value);
        }
        return e;
    }

    // Returns an iterable collection containing all the edges of a vertex
    public Iterable<Edge<V, E>> neighbors(Vertex<V> v) {
        return new HashSet<>(adj.get(v));
    }

    // Adds given edge to graph between two existing vertices
    public void addEdge(Vertex<V> source, Vertex<V> destination, E label, Double weight) {
        if (!adj.containsKey(source)) {
            addVertex(source);
        }
        adj.get(source).add(new Edge<>(source, destination, null, null));
        if (!adj.containsKey(destination)) {
            addVertex(destination);
        }
        if (!isDirected) {
            adj.get(destination).add(new Edge<>(destination, source, null, null));
        }
    }

    // Adds given vertex to graph
    public void addVertex(Vertex<V> vertex){
        if (!adj.containsKey(vertex)) {
            adj.put(vertex, new LinkedList<>());
        }
    }

    // Removes given vertex from graph
    public void removeVertex(Vertex<V> vertex) {
        adj.remove(vertex);
    }

    // Removes given edge from graph
    public void removeEdge(Vertex<V> source, Vertex<V> destination) {
        adj.get(source).remove(destination);
        if (!isDirected) {
            adj.get(destination).remove(source);
        }
    }

    // Checks if given vertex is in graph
    // Returns true if found and false otherwise
    public boolean containsVertex(Vertex<V> vertex) {
        return adj.containsKey(vertex);
    }

    // Checks if given edge is in graph
    // Returns true if found and false otherwise
    public boolean containsEdge(Vertex<V> source, Vertex<V> destination) {
        return adj.get(source).contains(destination);
    }

    // Returns a string representation of the graph/adjacency list
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Vertex<V> key : adj.keySet()) {
            s.append(key.toString()).append(": ").append(adj.get(key).toString());
            s.append("\n");
        }
        return (s.toString());
    }
}
