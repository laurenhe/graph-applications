// An edge of an adjacency list representation of a graph
public class Edge<V, E> {
    private Vertex<V> u;
    private Vertex<V> v;
    private E labelOrWeight;

    /*
    // post : Constructs an edge with given source and destination nodes
    public Edge(Vertex<V> u, Vertex<V> v) {
        this(null, u, v);
    } */

    // post : Constructs an edge with given label or weight and given source and destination nodes
    public Edge(Vertex<V> u, Vertex<V> v, E labelOrWeight) {
        this.u = u;
        this.v = v;
        this.labelOrWeight = labelOrWeight;
    }

    // Returns destination vertex
    public Vertex<V> getV() {
        return v;
    }

    // Returns a string representation of an edge
    public String toString() {
        if (this.labelOrWeight == null) {
            return "{source: " + this.u + ", dest: " + this.v + "}";
        } else {
            return "{source: " + this.u + ", dest: " + this.v + ", label/weight: " + this.labelOrWeight + "}";
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
