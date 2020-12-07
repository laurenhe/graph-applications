import java.util.*;

// A vertex of an adjacency list representation of a graph
public class Vertex<V> {

    private final V label;
    private Vertex<V> predecessor;
    private Double distFromSource;
    private int discoveredTimestamp;
    private int finishedTimestamp;

    // post : Constructs a vertex with given label
    public Vertex (V label) {
        this(label, null, null);
    }

    // post : Constructs a vertex with given label
    public Vertex (V label, Vertex<V> predecessor, Double distFromSource) {
        this.label = label;
        this.predecessor = null;
        this.distFromSource = Double.POSITIVE_INFINITY;
    }

    public Vertex<V> getPredecessor() {
        return predecessor;
    }

    public Double getDistFromSource() {
        return distFromSource;
    }

    public int getDiscoveredTimestamp() {
        return discoveredTimestamp;
    }

    public int getFinishedTimestamp() {
        return finishedTimestamp;
    }

    public void setPredecessor(Vertex<V> predecessor) {
        this.predecessor = predecessor;
    }

    public void setDistFromSource(Double distFromSource) {
        this.distFromSource = distFromSource;
    }

    public void setDiscoveredTimestamp(int discoveredTimestamp) {
        this.discoveredTimestamp = discoveredTimestamp;
    }

    public void setFinishedTimestamp(int finishedTimestamp) {
        this.finishedTimestamp = finishedTimestamp;
    }

    // Returns the string representation of this vertex
    public String toString() {
        return this.label.toString();
    }

    // post: Returns true if o is a Vertex with the same label
    public boolean equals(Object o) {
        if (this == o) {    // Checks if object references refer to same object
            return true;
        } else if (this.getClass() != o.getClass()) {   // Compares the class of given object and the class of this object
            return false;
        } else if (!(o instanceof Vertex<?>)) {
            return false;
        }
        Vertex<?> other = (Vertex<?>) o;    // Compares the state of given object and the state of this object
        return this.label == other.label;
    }

    // Returns a hash code for this vertex
    public int hashCode() {
        return Objects.hash(label);
    }
}
