/* import java.util.*;

public class DisjointSet {



    // Constructs an empty disjoint set
    public DisjointSet(int s) {

    }

    // Creates a new set whose only member and representative is the given x
    // This single node has an initial rank of zero
    public static <V> void makeSet(Vertex<V> x) {
        x.setP(x);
        x.setRank(0);
    }

    // Combines the sets that contain x and y into a new set that is the union of these two sets
    public static <V> void union(Vertex<V> x, Vertex<V> y) {
        link(findSet(x), findSet(y));
    }

    // For roots that have equal rank, one of the roots will be chosen as the parent
    // and its rank will be incremented
    // For roots that have unequal rank, the root with the higher rank
    // will become the parent of the root with the lower rank and all ranks remain the same
    public static <V> void link(Vertex<V> x, Vertex<V> y) {
        if (x.getRank() > y.getRank()) {
            y.setP(x);
        } else {
            x.setP(y);
            if (x.getRank() == y.getRank()) {
                y.setRank(y.getRank() + 1);
            }
        }
    }

    // Returns pointer to representative of the unique set containing x
    public static <V> Vertex<V> findSet(Vertex<V> x) {
        if (x.getP() != x) {
            x.setP(findSet(x.getP()));
        }
        return x.getP();
    }
}
*/
