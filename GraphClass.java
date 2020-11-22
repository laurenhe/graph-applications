import java.util.*;

// A graph class represents graphs with vertices and edges
public class GraphClass<T> {
    
    private boolean undirected;
    private Map<Vertex<T>, List<Vertex<T>>> adj; 

    // Constructs an empty graph
    public GraphClass(boolean undirected) {
        this.undirected = undirected;
        adj = new HashMap<>();
    }

    // Adds given vertex to graph
    public void addVertex(Vertex<T> vertex){
        if (!adj.keySet().contains(vertex)) {
            adj.put(vertex, new LinkedList<Vertex<T>>());
        }
    }

    // Adds given edge to graph between two vertices
    public void addEdge(Vertex<T> source, Vertex<T> destination) {
        if (!adj.containsKey(source)) {
            addVertex(source);
        }
        adj.get(source).add(destination);
        if (undirected == true) {
            if (!adj.containsKey(destination)) {
                addVertex(destination);
            }
            adj.get(destination).add(source);
        }
    }

    // Removes given vertex from graph
    public void removeVertex(Vertex<T> vertex) {
        if (adj.containsKey(vertex)) {
            adj.remove(vertex);
        }
    }

    // Removes given edge from graph
    public void removeEdge(Vertex<T> source, Vertex<T> destination) {
        adj.get(source).remove(destination);
        if (undirected == true) {
            adj.get(destination).remove(source);
        }
    }

    // Checks if given vertex is in graph
    // Returns true if found and false otherwise
    public boolean containsVertex(Vertex<T> vertex) {
        if (adj.containsKey(vertex)) {
            return true;
        }
        return false;
    }

    // Checks if given edge is in graph
    // Returns true if found and false otherwise
    public boolean containsEdge(Vertex<T> source, Vertex<T> destination) {
        if (adj.get(source).contains(destination)) {
            return true;   
        }
        return false;
    }

    // Returns a string representation of the graph/adjacency list
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Vertex<T> u : adj.keySet()) {
            s.append(u.getLabel().toString() + ": ");
            for (Vertex<T> v : adj.get(u)) {
                s.append(v.getLabel().toString() + " ");
            }
            s.append("\n");
        }
        return (s.toString());
    }

    // Temporary for debugging
    public void getKeySet() {
        for (Vertex<T> v : adj.keySet()) {
            System.out.println(v.getLabel());
        }
    }
}
