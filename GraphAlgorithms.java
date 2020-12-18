import java.util.*;

public class GraphAlgorithms {

    private static int time;

    /*
    public static <V, E> Set<Vertex<V>> BFS(Graph<V, E> g, Vertex<V> s) {
        Queue<Vertex<V>> frontier = new LinkedList<>();
        Set<Vertex<V>> discovered = new HashSet<>();
        frontier.add(s);
        discovered.add(s);
        while (!frontier.isEmpty()) {
            Vertex<V> u = frontier.remove();
            for (Edge<V, E> e : g.neighbors(u)) {
                Vertex<V> v = e.getV();
                if (!discovered.contains(v)) {
                    frontier.add(v);
                    discovered.add(v);
                }
            }
        }
        return discovered;
    } */

    // Performs breadth-first search
    public static <V, E> Set<Vertex<V>> BFS(Graph<V, E> g, Vertex<V> s) {
        s.setPredecessor(null);
        s.setDistFromSource(0.0);
        Queue<Vertex<V>> frontier = new LinkedList<>();
        Set<Vertex<V>> discovered = new HashSet<>();
        frontier.add(s);
        discovered.add(s);
        while (!frontier.isEmpty()) {
            Vertex<V> u = frontier.remove();
            for (Edge<V, E> e : g.neighbors(u)) {
                Vertex<V> v = e.getV();
                if (!discovered.contains(v)) {
                    v.setPredecessor(u);
                    v.setDistFromSource(u.getDistFromSource() + 1);
                    frontier.add(v);
                    discovered.add(v);
                }
            }
        }
        return discovered;
    }

    // Prints breadth-first tree
    public static <V> void predecessorSubgraphBFS(Vertex<V> s, Vertex<V> v) {
        if (s == v) {
            System.out.print(s);
        } else if (v.getPredecessor() == null) {
            System.out.println("There is no path from s to v.");
        } else {
            predecessorSubgraphBFS(s, v.getPredecessor());
            System.out.print(" -> " + v);
        }
    }

    // Performs top-level depth-first search iterating over the choices of vertex u
    public static <V,E> Map<Vertex<V>,Edge<V, E>> DFS(Graph<V, E> g) {
        Set<Vertex<V>> discovered = new HashSet<>();
        Map<Vertex<V>, Edge<V, E>> forest = new HashMap<>();
        time = 0;
        for (Vertex<V> u : g.vertices()) {
            if (!discovered.contains(u)) {
                DFS(g, u, discovered, forest);
            }
        }
        return forest;
    }

    // Performs depth-first search iterating over outgoing edges from vertex u
    private static <V, E> void DFS(Graph<V, E> g, Vertex<V> u, Set<Vertex<V>> discovered, Map<Vertex<V>,Edge<V, E>> forest) {
        discovered.add(u);
        time += 1;
        u.setDiscoveredTimestamp(time);
        for (Edge<V, E> e : g.neighbors(u)) {
            Vertex<V> v = e.getV();
            if (!discovered.contains(v)) {
               forest.put(v, e);
               DFS(g, v, discovered, forest);
            }
        }
        time += 1;
        u.setFinishedTimestamp(time);
    }

    // Prints discovered and finished timestamps from depth-first search for each vertex in graph
    public static <V, E> void startFinishTimesDFS(Graph<V, E> g) {
        for (Vertex<V> u : g.vertices()) {
            System.out.println(u + ": " + u.getDiscoveredTimestamp() + ", " + u.getFinishedTimestamp());
        }
    }

    /* strongly connected components
    // Call DFS(G)
    // Compute G transpose
    // call DFS(GT) consider vertices in order of decreasing u.f
    // output vertices in each tree as separate strongly connected component
    public static<V, E> void stronglyConnectedComponents(Graph<V, E> g) {
        DFS(g);
        Graph<V, E> gt = graphTranspose(g);
    } */

    // Computes the transpose of given graph
    public static<V, E> void graphTranspose(Graph<V, E> g) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    // Performs Kruskal's algorithm on given graph
    // Returns a set of least-weight edges that form the minimum spanning tree
    public static <V, E> Set<Edge<V, E>> kruskalMST(Graph<V, E> g) {
        Set<Edge<V, E>> A = new HashSet<>();
        DisjointSet<V> s = new DisjointSet<>();
        for (Vertex<V> v : g.vertices()) {
            s.makeSet(v);
        }
        for (Edge<V, E> edge : g.edges()) {
            if (s.findSet(edge.getU()) != s.findSet(edge.getV())) {
                // Safe edge added to A is least-weight edge connecting two distinct components
                A.add(edge);
                s.union(edge.getU(), edge.getV());
            }
        }
        return A;
    }

    // Performs Prim's algorithm on given graph and takes as an additional parameter a start vertex
    // Returns a set of least-weight edges that form the minimum spanning tree
    public static <V, E> Set<Edge<V, E>> primMST(Graph<V, E> g, Vertex<V> r) {
        Set<Edge<V, E>> B = new HashSet<>();
        r.setMinWeight(0.0);
        g.vertices().remove(r);
        PriorityQueue<Vertex<V>> Q = new PriorityQueue<>(g.vertices());
        while (!Q.isEmpty()) {
            Vertex<V> u = Q.remove();
            for (Edge<V, E> e : g.neighbors(u)) {                                       // for each v in G.Adj[u]
                if (Q.contains(e.getV()) && e.getWeight() < e.getV().getMinWeight()) {  // if v in Q and w(u,v) < v.key
                    e.getV().setPredecessor(u);                                         // v.pi = u
                    e.getV().setMinWeight(e.getWeight());                               // v.key = w(u,v)
                    System.out.println(e);
                }
            }
        }
        for (Edge<V, E> e : g.edges()) {
            if (e.getWeight().equals(e.getV().getMinWeight())) {
                B.add(e);
            }
        }
        return B;
    }
}
