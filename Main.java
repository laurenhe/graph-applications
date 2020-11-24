import java.util.*;

public class Main {
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Graph<Integer, String> g = new AdjacencyList<>(false);
        g.addEdge(new Vertex(1), new Vertex(2));
        g.addEdge(new Vertex(1), new Vertex(3));
        g.addEdge(new Vertex(2), new Vertex(6));
        g.addEdge(new Vertex(3), new Vertex(4));
        g.addEdge(new Vertex(3), new Vertex(6));
        g.addEdge(new Vertex(5), new Vertex(6));
        g.addEdge(new Vertex(6), new Vertex(7));
        g.addEdge(new Vertex(7), new Vertex(8));
        g.addEdge(new Vertex(7), new Vertex(9));
        g.addEdge(new Vertex(9), new Vertex(10));
        System.out.println(g.toString());
    }
}


 
