import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {
        // starter
        Graph<Integer, Integer> starter = new AdjacencyList<>(false);
        File starterFile = new File("starter.txt");
        Map<Integer, Vertex<Integer>> starterData = new HashMap<>();
        GraphBuilder.unweightedIntGraph(starter, starterFile, starterData);
        System.out.println(starter.toString());
        GraphAlgorithms.BFS(starter, starterData.get(1));
        System.out.println(starterData.get(10).getDistFromSource());
        GraphAlgorithms.predecessorSubgraphBFS(starterData.get(1), starterData.get(10));
        System.out.println();
        System.out.println(GraphAlgorithms.DFS(starter));
        GraphAlgorithms.startFinishTimesDFS(starter);
        System.out.println();

        // graphene
        Graph<Integer, Integer> hex = new AdjacencyList<>(false);
        File hexFile = new File("hex.txt");
        Map<Integer, Vertex<Integer>> hexData = new HashMap<>();
        GraphBuilder.unweightedIntGraph(hex, hexFile, hexData);
        System.out.println(hex.toString());
        System.out.println();

        // carbon cycle
        Graph<String, String> cc = new AdjacencyList<>(true);
        File ccFile = new File("carbon-cycle.txt");
        Map<String, Vertex<String>> ccData = new HashMap<>();
        GraphBuilder.unweightedStrGraph(cc, ccFile, ccData);
        System.out.println(cc.toString());
        System.out.println(GraphAlgorithms.DFS(cc));
        GraphAlgorithms.startFinishTimesDFS(cc);
        System.out.println();

        // salmon life cycle
        Graph<String, String> slc = new AdjacencyList<>(true);
        File slcFile = new File("salmon-life-cycle.txt");
        Map<String, Vertex<String>> slcData = new HashMap<>();
        GraphBuilder.unweightedStrGraph(slc, slcFile, slcData);
        System.out.println(slc.toString());
        System.out.println(GraphAlgorithms.DFS(slc));
        GraphAlgorithms.startFinishTimesDFS(slc);
        System.out.println();

        // kruskal's
        Graph<Integer, Integer> k = new AdjacencyList<>(false);
        File kFile = new File("k.txt");
        Map<Integer, Vertex<Integer>> kData = new HashMap<>();
        GraphBuilder.weightedIntGraph(k, kFile, kData);
        System.out.println(k.edges());
        System.out.println(GraphAlgorithms.kruskalMST(k));
        System.out.println();

        // directed
        Graph<Integer, Integer> d = new AdjacencyList<>(true);
        File dFile = new File("d.txt");
        Map<Integer, Vertex<Integer>> dData = new HashMap<>();
        GraphBuilder.unweightedIntGraph(d, dFile, dData);
        System.out.println(GraphAlgorithms.BFS(d, dData.get(1)));
        GraphAlgorithms.predecessorSubgraphBFS(dData.get(1), dData.get(5));
        System.out.println();

        // mst
        Graph<String, String> mst = new AdjacencyList<>(false);
        File mstFile = new File("mst.txt");
        Map<String, Vertex<String>> mstData = new HashMap<>();
        GraphBuilder.weightedStrGraph(mst, mstFile, mstData);
        //System.out.println(mst.edges());
        //System.out.println(GraphAlgorithms.kruskalMST(mst));
        //System.out.println(GraphAlgorithms.primMST(mst, mstData.get(1)));

        Graph<String, Integer> t = new AdjacencyList<>(false);
        Vertex<String> t1 = new Vertex<>("a");
        Vertex<String> t2 = new Vertex<>("b");
        Vertex<String> t3 = new Vertex<>("c");
        Vertex<String> t4 = new Vertex<>("d");
        Vertex<String> t5 = new Vertex<>("e");
        Vertex<String> t6 = new Vertex<>("f");
        Vertex<String> t7 = new Vertex<>("g");
        Vertex<String> t8 = new Vertex<>("h");
        Vertex<String> t9 = new Vertex<>("i");
        t.addEdge(t1, t2, null, 4.0);
        t.addEdge(t1, t8, null, 8.0);
        t.addEdge(t2, t3, null, 8.0);
        t.addEdge(t2, t8, null, 11.0);
        t.addEdge(t8, t9, null, 7.0);
        t.addEdge(t8, t7, null, 1.0);
        t.addEdge(t9, t7, null, 6.0);
        t.addEdge(t9, t3, null, 2.0);
        t.addEdge(t3, t4, null, 7.0);
        t.addEdge(t3, t6, null, 4.0);
        t.addEdge(t7, t6, null, 2.0);
        t.addEdge(t4, t6, null, 14.0);
        t.addEdge(t4, t5, null, 9.0);
        t.addEdge(t6, t5, null, 10.0);
        System.out.println(mst.edges());
        System.out.println(GraphAlgorithms.kruskalMST(mst));
        System.out.println(GraphAlgorithms.primMST(mst, mstData.get(1)));
    }
}



