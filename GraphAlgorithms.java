import java.util.*;

public class GraphAlgorithms {

    // Performs breadth-first search
    public static <V, E> void BFS(Graph<V, E> g, Vertex<V> s) {
        Queue<Vertex<V>> level = new LinkedList<>();
        Set<Vertex<V>> visited = new HashSet<>();
        level.add(s);
        visited.add(s);
        while (!level.isEmpty()) {
            Vertex<V> u = level.remove();
            for (Edge<E, V> e : g.getAdj().get(u)) {
                Vertex<V> v = e.getV();
                if (!visited.contains(v)) {
                    level.add(v);
                    visited.add(v);
                }
            }
        }
    }

    public static <V, E> void shortestPath(Graph<V, E> g, Vertex<V> s) {
        s.setPredecessor(null);
        s.setDistFromSource((double) 0);
        Queue<Vertex<V>> level = new LinkedList<>();
        Set<Vertex<V>> visited = new HashSet<>();
        level.add(s);
        visited.add(s);
        while (!level.isEmpty()) {
            Vertex<V> u = level.remove();
            for (Edge<E, V> e : g.getAdj().get(u)) {
                Vertex<V> v = e.getV();
                if (!visited.contains(v)) {
                    v.setPredecessor(u);
                    v.setDistFromSource(u.getDistFromSource() + 1);
                    level.add(v);
                    visited.add(v);
                }
            }
        }
    }

    public static <V, E> void DFS(Graph<V, E> g) {
        throw new UnsupportedOperationException("not implemented yet");
    }
}
