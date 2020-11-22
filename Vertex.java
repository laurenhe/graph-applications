public class Vertex<T> {
    
    private T label;
    private T weight;   

    public Vertex(T label) {
        this(label, null);
    }

    public Vertex(T label, T weight) {
        this.label = label;
        this.weight = weight;
    }

    // Returns the label of this vertex
    public T getLabel() {
        return this.label;
    }

    // equals
    // hashCode
}

//public class weightedVertex<T> extends Vertex<T> {
//}
