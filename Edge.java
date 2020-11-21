public class Edge<T> {

    private T label;
    private T weight;
    private Vertex<T> source;
    private Vertex<T> destination;

    public Edge(T label) {
        this(label, null, null, null);
    }

    public Edge(T label, T weight, Vertex<T> source, Vertex<T> destination) {
        this.label = label;
        this.weight = weight;
        this.source = source;
        this.destination = destination;
    }

}
