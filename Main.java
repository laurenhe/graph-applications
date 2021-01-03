import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {
        // starter
        Graph<Integer, Integer> starter = new AdjacencyList<>(false);
        File starterFile = new File("files/starter.txt");
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
        File hexFile = new File("files/hex.txt");
        Map<Integer, Vertex<Integer>> hexData = new HashMap<>();
        GraphBuilder.unweightedIntGraph(hex, hexFile, hexData);
        System.out.println(hex.toString());
        System.out.println();

        // carbon cycle
        Graph<String, String> cc = new AdjacencyList<>(true);
        File ccFile = new File("files/carbon-cycle.txt");
        Map<String, Vertex<String>> ccData = new HashMap<>();
        GraphBuilder.unweightedStrGraph(cc, ccFile, ccData);
        System.out.println(cc.toString());
        System.out.println(GraphAlgorithms.DFS(cc));
        GraphAlgorithms.startFinishTimesDFS(cc);
        System.out.println();

        // salmon life cycle
        Graph<String, String> slc = new AdjacencyList<>(true);
        File slcFile = new File("files/salmon-life-cycle.txt");
        Map<String, Vertex<String>> slcData = new HashMap<>();
        GraphBuilder.unweightedStrGraph(slc, slcFile, slcData);
        System.out.println(slc.toString());
        System.out.println(GraphAlgorithms.DFS(slc));
        GraphAlgorithms.startFinishTimesDFS(slc);
        System.out.println();

        // kruskal's
        Graph<Integer, Integer> k = new AdjacencyList<>(false);
        File kFile = new File("files/k.txt");
        Map<Integer, Vertex<Integer>> kData = new HashMap<>();
        GraphBuilder.weightedIntGraph(k, kFile, kData);
        System.out.println(k.edges());
        System.out.println(GraphAlgorithms.kruskalMST(k));
        System.out.println();

        // directed
        Graph<Integer, Integer> d = new AdjacencyList<>(true);
        File dFile = new File("files/d.txt");
        Map<Integer, Vertex<Integer>> dData = new HashMap<>();
        GraphBuilder.unweightedIntGraph(d, dFile, dData);
        System.out.println(GraphAlgorithms.BFS(d, dData.get(1)));
        GraphAlgorithms.predecessorSubgraphBFS(dData.get(1), dData.get(5));
        System.out.println();

        // mst
        Graph<String, String> mst = new AdjacencyList<>(false);
        File mstFile = new File("files/mst.txt");
        Map<String, Vertex<String>> mstData = new HashMap<>();
        GraphBuilder.weightedStrGraph(mst, mstFile, mstData);
        System.out.println(mst.edges());
        System.out.println(GraphAlgorithms.kruskalMST(mst));
        System.out.println(GraphAlgorithms.primMST(mst, mstData.get("a")));
        System.out.println();
    }
}



