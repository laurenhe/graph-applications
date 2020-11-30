import java.util.List;
import java.util.Map;

public interface Graph<V, E> {

    Map<Vertex<V>, List<Edge<E, V>>> getAdj();

    void addEdge(Vertex<V> source, Vertex<V> destination);

    void removeVertex(Vertex<V> vertex);

    void removeEdge(Vertex<V> source, Vertex<V> destination);

    boolean containsVertex(Vertex<V> vertex);

    boolean containsEdge(Vertex<V> source, Vertex<V> destination);
}
