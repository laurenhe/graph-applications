import java.util.*;

public class DisjointSet<V> {

    private Map<Vertex<V>, Vertex<V>> p;
    private Map<Vertex<V>, Integer> rank;

    // Constructs a new set
    public DisjointSet() {
        this.p = new HashMap<>();
        this.rank = new HashMap<>();
    }

    // Creates a new set whose only member and representative is the given x
    // This single node has an initial rank of zero
    public void makeSet(Vertex<V> x) {
        p.put(x, x);
        rank.put(x, 0);
    }

    // Combines the sets that contain x and y into a new set that is the union of these two sets
    public void union(Vertex<V> x, Vertex<V> y) {
        link(findSet(x), findSet(y));
    }

    // For roots that have equal rank, one of the roots will be chosen as the parent
    // and its rank will be incremented
    // For roots that have unequal rank, the root with the higher rank
    // will become the parent of the root with the lower rank and all ranks remain the same
    public void link(Vertex<V> x, Vertex<V> y) {
        if (rank.get(x) > rank.get(y)) {
            p.put(y, x);
        } else {
            p.put(x, y);
            if (rank.get(x).equals(rank.get(y))) {
                rank.put(y, rank.get(y) + 1);   // y.rank += 1;
            }
        }
    }

    // Returns pointer to representative of the unique set containing x
    public Vertex<V> findSet(Vertex<V> x) {
        if (p.get(x) != x) {
            p.put(x, findSet(p.get(x)));        // x.p = findSet(x.p);
        }
        return p.get(x);
    }
}
