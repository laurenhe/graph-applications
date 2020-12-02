public class Main {
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Graph<Integer, String> g = new AdjacencyList<>(false);
        Vertex start = new Vertex(1);
        Vertex two = new Vertex(2);
        Vertex three = new Vertex(3);
        Vertex four = new Vertex(4);
        Vertex five = new Vertex(5);
        Vertex six = new Vertex(6);
        Vertex seven = new Vertex(7);
        Vertex eight = new Vertex(8);
        Vertex nine = new Vertex(9);
        Vertex ten = new Vertex(10);
        g.addEdge(start, two);
        g.addEdge(start, three);
        g.addEdge(two, six);
        g.addEdge(three, four);
        g.addEdge(three, six);
        g.addEdge(five, six);
        g.addEdge(six, seven);
        g.addEdge(seven, eight);
        g.addEdge(seven, nine);
        g.addEdge(nine, ten);
        System.out.println(g.toString());
        GraphAlgorithms.BFS(g, start);
        GraphAlgorithms.shortestPath(g, start);
        System.out.println(ten.getDistFromSource());
        GraphAlgorithms.predecessorSubgraphBFS(g, start, ten);
        System.out.println();
        System.out.println(GraphAlgorithms.DFS(g));
        GraphAlgorithms.startFinishTimesDFS(g);

        /*
        Graph<Integer, String> hex = new AdjacencyList<>(false);
        hex.addEdge(new Vertex(1), new Vertex(3));
        hex.addEdge(new Vertex(1), new Vertex(4));
        hex.addEdge(new Vertex(2), new Vertex(4));
        hex.addEdge(new Vertex(2), new Vertex(5));
        hex.addEdge(new Vertex(3), new Vertex(6));
        hex.addEdge(new Vertex(4), new Vertex(2));
        hex.addEdge(new Vertex(5), new Vertex(8));
        hex.addEdge(new Vertex(6), new Vertex(9));
        hex.addEdge(new Vertex(6), new Vertex(10));
        hex.addEdge(new Vertex(7), new Vertex(10));
        hex.addEdge(new Vertex(7), new Vertex(11));
        hex.addEdge(new Vertex(8), new Vertex(11));
        hex.addEdge(new Vertex(8), new Vertex(12));
        hex.addEdge(new Vertex(9), new Vertex(13));
        hex.addEdge(new Vertex(10), new Vertex(14));
        hex.addEdge(new Vertex(11), new Vertex(15));
        hex.addEdge(new Vertex(12), new Vertex(16));
        hex.addEdge(new Vertex(13), new Vertex(17));
        hex.addEdge(new Vertex(14), new Vertex(17));
        hex.addEdge(new Vertex(14), new Vertex(18));
        hex.addEdge(new Vertex(15), new Vertex(18));
        hex.addEdge(new Vertex(15), new Vertex(19));
        hex.addEdge(new Vertex(16), new Vertex(19));
        hex.addEdge(new Vertex(17), new Vertex(20));
        hex.addEdge(new Vertex(18), new Vertex(21));
        hex.addEdge(new Vertex(19), new Vertex(22));
        hex.addEdge(new Vertex(20), new Vertex(23));
        hex.addEdge(new Vertex(21), new Vertex(23));
        hex.addEdge(new Vertex(21), new Vertex(24));
        hex.addEdge(new Vertex(22), new Vertex(24));
        System.out.println(hex.toString());
        Graph<Integer, Integer> andromeda = new AdjacencyList<>(false);
        Graph<Integer, Integer> cass = new AdjacencyList<>(false);
        Graph<Integer, Integer> ursaMajor = new AdjacencyList<>(false);
        Graph<Integer, Integer> ursaMinor = new AdjacencyList<>(false);
        Graph<Integer, Integer> libra = new AdjacencyList<>(false);
        */
    }
}


 
