import java.util.*;

public class Main {
    public static void main(String[] args) {
        Graph<Integer> graph = new Graph<Integer>(new HashSet<Vertex>(), true);
        graph.addEdge(new Vertex(1), new Vertex(2));
        graph.addEdge(new Vertex(1), new Vertex(3));
        graph.addEdge(new Vertex(2), new Vertex(6));
        graph.addEdge(new Vertex(3), new Vertex(4));
        graph.addEdge(new Vertex(3), new Vertex(6));
        graph.addEdge(new Vertex(5), new Vertex(6));
        graph.addEdge(new Vertex(6), new Vertex(7));
        graph.addEdge(new Vertex(7), new Vertex(8));
        graph.addEdge(new Vertex(7), new Vertex(9));
        graph.addEdge(new Vertex(9), new Vertex(10));
        
        System.out.println(graph.toString());
    }
}


 
