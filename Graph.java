import java.util.Set;

public interface Graph<V, E> {

    Iterable<Vertex<V>> vertices();

    Set<Edge<V, E>> edges();

    Iterable<Edge<V, E>> neighbors(Vertex<V> v);

    void addEdge(Vertex<V> source, Vertex<V> destination, E label, Double weight);

    void addVertex(Vertex<V> vertex);

    void removeVertex(Vertex<V> vertex);

    void removeEdge(Vertex<V> source, Vertex<V> destination);

    boolean containsVertex(Vertex<V> vertex);

    boolean containsEdge(Vertex<V> source, Vertex<V> destination);
}
