import java.util.*;

// An AdjacencyList class can implement a graph 
public class AdjacencyList<V, E> implements GraphInterface<V, E> {
     private boolean undirected;
     private Map<Vertex<V>, List<Vertex<V>>> adj;
     //private Map<> adjWeighted;

    // Constructs an empty adjacency list
    public AdjacencyList(boolean undirected) {
        //isDirected = undirected;
        adj = new HashMap<>();
        //adjWeighted = new HashMap<>();
    }

    // Adds given edge to graph between two existing vertices
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

    private class Vertex<V> {
        private V label;
        private V weight;   

        public Vertex(V label) {
            this(label, null);
        }

        public Vertex(V label, V weight) {
            this.label = label;
            this.weight = weight;
        }

        // Returns the label of this vertex
        public V getLabel() {
            return this.label;
        }

        // equals
        // hashCode
    }

    private class Edge<E> {
        private E label;
        private E weight;
        private Vertex<V> u;
        private Vertex<V> v;

        public Edge(E label) {
            this(label, null, null, null);
        }

        public Edge(E label, E weight, Vertex<V> u, Vertex<V> v) {
            this.label = label;
            this.weight = weight;
            this.u = u;
            this.v = v;
        }

        // Returns the label of this edge
        public E getLabel() {
            return this.label;
        }
    }

    // equals
    // hashCode
}
