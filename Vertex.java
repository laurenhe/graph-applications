import java.util.*;

// A vertex of an adjacency list representation of a graph
public class Vertex<V> implements Comparable<Vertex<V>>{

    private final V label;
    private Vertex<V> predecessor;
    private Double distFromSource;
    private int discoveredTimestamp;
    private int finishedTimestamp;
    private Double minWeight;       // Stores minimum weight of any edge connecting vertex to vertex in tree

    // post : Constructs a vertex with given label
    public Vertex(V label) {
        this.label = label;
        this.distFromSource = Double.POSITIVE_INFINITY;
        this.minWeight = Double.POSITIVE_INFINITY;
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

    public Double getMinWeight() {
        return minWeight;
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

    public void setMinWeight(Double minWeight) {
        this.minWeight = minWeight;
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
        }
        Vertex<?> other = (Vertex<?>) o;    // Compares the state of given object and the state of this object
        return this.label == other.label;
    }

    // Returns a hash code for this vertex
    public int hashCode() {
        return Objects.hash(label);
    }

    public int compareTo(Vertex<V> v) {
        int cmp = Double.compare(this.minWeight, v.minWeight);
        if (cmp == 0) {
            cmp = this.toString().compareTo(v.toString());
        }
        return cmp;
    }
}
