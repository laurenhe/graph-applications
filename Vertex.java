public class Vertex<T> {
    
    private T label;
    private T weight;   // How to <T extends Number>

    public Vertex(T label) {
        this(label, null);
    }

    public Vertex(T label, T weight) {
        this.label = label;
        this.weight = weight;
    }

    // equals
    // hashCode
}

//public class weightedVertex<T> extends Vertex<T> {
//}
