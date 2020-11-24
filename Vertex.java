// A vertex of an adjacency list representation of a graph
public class Vertex<V> {
    private V label;

    // post : Constructs a vertex with given label
    public Vertex (V label) {
        this.label = label;
    }

    // Returns the label of this vertex
    public V getLabel() {
        return this.label;
    }
}
