import java.util.*;

// A graph class represents graphs with vertices and edges
public class Graph<T> {


    private Map<Vertex, List<Vertex>> adj; 
    private boolean undirected;

    // Constructs a new graph from the given set of vertices
    public Graph(Set<Vertex> vertices, boolean undirected) {
        adj = new HashMap<>();
        for (Vertex vertex : vertices) {
            adj.put(vertex, new LinkedList<Vertex>());
            //adj.put(vertex, new HashMap<Edge<T>, Set<W>>());
        }

        this.undirected = undirected;
    }

    // Adds given vertex to graph
    public void addVertex(Vertex vertex){
        if (!adj.keySet().contains(vertex)) {
            adj.put(vertex, new LinkedList<Vertex>());
        }
    }

    // Adds given edge to graph between two existing vertices
    public void addEdge(Vertex source, Vertex destination) {
        if (adj.get(source) == null) {
            adj.put(source, new LinkedList<Vertex>());
        }
        if (undirected == true) {
            if (!adj.containsKey(destination)) {
                adj.put(destination, null);
            } else {
                adj.get(destination).add(source);
            }
        }
        if (!adj.get(source).contains(destination)) {
            adj.get(source).add(destination);
        }
    }

    // Removes given vertex from graph
    public void removeVertex(Vertex vertex) {
        if (adj.containsKey(vertex)) {
            adj.remove(vertex);
        }
    }

    // Removes given edge from graph
    public void removeEdge(Vertex source, Vertex destination) {
        adj.get(source).remove(destination);
        if (undirected == true) {
            adj.get(destination).remove(source);
        }
    }

    // Checks if given vertex is in graph
    // Returns true if found and false otherwise
    public boolean containsVertex(Vertex vertex) {
        if (adj.containsKey(vertex)) {
            return true;
        }
        return false;
    }

    // Checks if given edge is in graph
    // Returns true if found and false otherwise
    public boolean containsEdge(Vertex source, Vertex destination) {
        if (adj.get(source).contains(destination)) {
            return true;   
        }
        return false;
    }

    // Returns a string representation of the graph/adjacency list
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Vertex u : adj.keySet()) {
            s.append(u.toString() + ": ");
            if (adj.get(u) != null) { 
                for (Vertex v : adj.get(u)) {
                    s.append(v.toString() + " ");
                }
            }
            s.append("\n");
        }
        return (s.toString());
    }

    // Search methods
}
