public class Edge<T> {

    private T label;
    private T weight;
    private Vertex<V> u;
    private Vertex<V> v;

    public Edge(T label) {
        this(label, null, null, null);
    }

    public Edge(T label, T weight, Vertex<T> u, Vertex<T> v) {
        this.label = label;
        this.weight = weight;
        this.u = u;
        this.v = v;
    }

    // Returns the label of this edge
    public T getLabel() {
        return this.label;
    }

    // equals
    // hashCode
}
