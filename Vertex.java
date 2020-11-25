import java.util.*;

// A vertex of an adjacency list representation of a graph
public class Vertex<V> {
    private V label;

    // post : Constructs a vertex with given label
    public Vertex (V label) {
        this.label = label;
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
        /*} else if (!(o instanceOf Vertex<?>)) {
            return false; */
        }
        Vertex<?> other = (Vertex<?>) o;    // Compares the state of given object and the state of this object
        return this.label == other.label;
    }

    // Returns a hash code for this vertex
    public int hashCode() {
        return Objects.hash(label);
    }
}
