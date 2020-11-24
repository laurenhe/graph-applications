import java.util.*;

public interface Graph<V, E> {

    void addEdge(Vertex<V> source, Vertex<V> destination);

    void removeVertex(Vertex<V> vertex);

    void removeEdge(Vertex<V> source, Vertex<V> destination);

    boolean containsVertex(Vertex<V> vertex);

    boolean containsEdge(Vertex<V> source, Vertex<V> destination);
}
