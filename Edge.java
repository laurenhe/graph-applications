import java.util.*;

// An edge of an adjacency list representation of a graph
public class Edge<V, E> implements Comparable<Edge<V, E>>{

    private Vertex<V> u;
    private Vertex<V> v;
    private E label;
    private Double weight;

    // post : Constructs an edge with given label or weight and given source and destination nodes
    public Edge(Vertex<V> u, Vertex<V> v, E label, Double weight) {
        this.u = u;
        this.v = v;
        this.label = label;
        this.weight = weight;
    }

    // Returns destination vertex
    public Vertex<V> getU() {
        return u;
    }

    // Returns destination vertex
    public Vertex<V> getV() {
        return v;
    }

    public Double getWeight() {
        return weight;
    }

    // Returns a string representation of an edge
    public String toString() {
        if (this.weight == null) {
            return "{source: " + this.u + ", dest: " + this.v + "}";
        } else {
            return "{source: " + this.u + ", dest: " + this.v + ", weight: " + this.weight + "}";
        }
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (this.getClass() != o.getClass()) {
            return false;
        } else if (!(o instanceof Edge<?, ?>)) {
            return false;
        }
        Edge<?, ?> other = (Edge<?, ?>) o;
        return this.u == other.u && this.v == other.v && this.label == other.label && this.weight.equals(other.weight);
    }

    public int hashCode() {
        return Objects.hash(u, v, label, weight);
    }

    public int compareTo(Edge<V, E> e) {
        int cmp = Double.compare(this.weight, e.weight);
        if (cmp == 0) {
            cmp = this.u.toString().compareTo(e.u.toString());
                if (cmp == 0) {
                    cmp = this.v.toString().compareTo(e.v.toString());
                }
        }
        return cmp;
    }
}
