// An edge of an adjacency list representation of a graph
public class Edge<E, V> {
    private E labelOrWeight;    
    private Vertex<V> u;
    private Vertex<V> v;

    // post : Constructs an edge with given label or weight
    public Edge(E labelOrWeight) {
        this(labelOrWeight, null, null);
    }

    // post : Constructs an edge with given source and destination nodes
    public Edge(Vertex<V> u, Vertex<V> v) {
        this(null, u, v);
    }

    // post : Constructs an edge with given label or weight and given source and destination nodes
    public Edge(E labelOrWeight, Vertex<V> u, Vertex<V> v) {
        this.labelOrWeight = labelOrWeight;
        this.u = u;
        this.v = v;
    }

    // Returns the label of this edge
    public E getLabelOrWeight() {
        return this.labelOrWeight;
    }

    // Returns a string representation of an edge
    public String toString() {
        if (this.labelOrWeight == null) {
            return "{source: " + this.u + ", dest: " + this.v + "}";
        } else {
            return "{source: " + this.u + ", dest: " + this.v + ", label/weight: " + this.labelOrWeight + "}";
        }
    }
}
