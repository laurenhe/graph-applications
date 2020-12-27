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

        // carbon cycle
        Graph<String, String> cc = new AdjacencyList<>(true);
        File ccFile = new File("carbon-cycle.txt");
        Map<String, Vertex<String>> ccData = new HashMap<>();
        GraphBuilder.unweightedStrGraph(cc, ccFile, ccData);
        System.out.println(cc.toString());
        System.out.println(GraphAlgorithms.DFS(cc));
        GraphAlgorithms.startFinishTimesDFS(cc);

        // salmon life cycle
        Graph<String, String> s = new AdjacencyList<>(true);
        Vertex<String> s1 = new Vertex<>("fertilized eggs");
        Vertex<String> s2 = new Vertex<>("alevins");
        Vertex<String> s3 = new Vertex<>("fry");
        Vertex<String> s4 = new Vertex<>("rainbow, resident masu");
        Vertex<String> s5 = new Vertex<>("most sockeye");
        Vertex<String> s6= new Vertex<>("pink chum, some chinook");
        Vertex<String> s7 = new Vertex<>("coho, some masu, steelhead, chinook, sockeye");
        Vertex<String> s8 = new Vertex<>("resident subadults");
        Vertex<String> s9 = new Vertex<>("lake juveniles");
        Vertex<String> s10 = new Vertex<>("estuarine juveniles");
        Vertex<String> s11 = new Vertex<>("stream parr");
        Vertex<String> s12 = new Vertex<>("coastal juveniles");
        Vertex<String> s13 = new Vertex<>("marine subadults");
        Vertex<String> s14 = new Vertex<>("adults");
        Vertex<String> s15 = new Vertex<>("spawned-out carcasses");
        s.addEdge(s1, s2, null, null);
        s.addEdge(s2, s3, null, null);
        s.addEdge(s3, s4, null, null);
        s.addEdge(s3, s5, null, null);
        s.addEdge(s3, s6, null, null);
        s.addEdge(s3, s7, null, null);
        s.addEdge(s4, s8, null, null);
        s.addEdge(s5, s9, null, null);
        s.addEdge(s6, s10, null, null);
        s.addEdge(s7, s11, null, null);
        s.addEdge(s8, s14, null, null);
        s.addEdge(s14, s8, null, null);
        s.addEdge(s9, s12, null, null);
        s.addEdge(s10, s12, null, null);
        s.addEdge(s11, s12, null, null);
        s.addEdge(s12, s13, null, null);
        s.addEdge(s13, s14, null, null);
        s.addEdge(s14, s13, null, null);
        s.addEdge(s14, s15, null, null);
        s.addEdge(s14, s1, null, null);
        s.addEdge(s15, s3, null, null);
        System.out.println(s.toString());
        System.out.println(GraphAlgorithms.DFS(s));
        GraphAlgorithms.startFinishTimesDFS(s);

        // closest stars
        Graph<String, String> stars = new AdjacencyList<>(false);
        Vertex<String> star0 = new Vertex<>("Sol");
        Vertex<String> star1 = new Vertex<>("Alpha Centauri B");
        Vertex<String> star2 = new Vertex<>("Tau Ceti");
        Vertex<String> star3 = new Vertex<>("Kapteyn");
        Vertex<String> star4 = new Vertex<>("Wolf 1061");
        Vertex<String> star5 = new Vertex<>("Gliese 687");
        Vertex<String> star6 = new Vertex<>("Gliese 876");
        Vertex<String> star7 = new Vertex<>("Gliese 832");
        Vertex<String> star8 = new Vertex<>("GJ 682");
        Vertex<String> star9 = new Vertex<>("HD 20794");
        stars.addEdge(star0, star1, null, 4.2);
        stars.addEdge(star0, star2, null, 11.9);
        stars.addEdge(star0, star3, null, 12.8);
        stars.addEdge(star0, star4, null, 14.0);
        stars.addEdge(star0, star5, null, 14.7);
        stars.addEdge(star0, star6, null, 15.3);
        stars.addEdge(star0, star7, null, 16.1);
        stars.addEdge(star0, star8, null, 16.6);
        stars.addEdge(star0, star9, null, 19.8);
        stars.addEdge(star1, star2, null, 12.6);
        stars.addEdge(star1, star3, null, 13.5);
        stars.addEdge(star1, star4, null, 14.6);
        stars.addEdge(star1, star5, null, 15.3);
        stars.addEdge(star1, star6, null, 15.9);
        stars.addEdge(star1, star7, null, 16.6);
        stars.addEdge(star1, star8, null, 17.1);
        stars.addEdge(star1, star9, null, 20.2);
        stars.addEdge(star2, star3, null, 17.5);
        stars.addEdge(star2, star4, null, 18.4);
        stars.addEdge(star2, star5, null, 18.9);
        stars.addEdge(star2, star6, null, 19.4);
        stars.addEdge(star2, star7, null, 20.0);
        stars.addEdge(star2, star8, null, 20.4);
        stars.addEdge(star2, star9, null, 23.1);
        stars.addEdge(star3, star4, null, 18.9);
        stars.addEdge(star3, star5, null, 19.5);
        stars.addEdge(star3, star6, null, 19.9);
        stars.addEdge(star3, star7, null, 20.6);
        stars.addEdge(star3, star8, null, 20.9);
        stars.addEdge(star3, star9, null, 23.6);
        stars.addEdge(star4, star5, null, 20.3);
        stars.addEdge(star4, star6, null, 20.7);
        stars.addEdge(star4, star7, null, 21.3);
        stars.addEdge(star4, star8, null, 21.7);
        stars.addEdge(star4, star9, null, 24.2);
        stars.addEdge(star5, star6, null, 21.2);
        stars.addEdge(star5, star7, null, 21.8);
        stars.addEdge(star5, star8, null, 22.2);
        stars.addEdge(star5, star9, null, 24.7);
        stars.addEdge(star6, star7, null, 22.2);
        stars.addEdge(star6, star8, null, 22.6);
        stars.addEdge(star6, star9, null, 25.0);
        stars.addEdge(star7, star8, null, 23.1);
        stars.addEdge(star7, star9, null, 25.5);
        stars.addEdge(star8, star9, null, 25.8);
        System.out.println(stars.toString());
        System.out.println(GraphAlgorithms.DFS(stars));
        GraphAlgorithms.startFinishTimesDFS(stars);
        System.out.println(GraphAlgorithms.kruskalMST(stars));

        Graph<Integer, Integer> k = new AdjacencyList<>(false);
        Vertex<Integer> k1 = new Vertex<>(1);
        Vertex<Integer> k2 = new Vertex<>(2);
        Vertex<Integer> k3 = new Vertex<>(3);
        Vertex<Integer> k4 = new Vertex<>(4);
        Vertex<Integer> k5 = new Vertex<>(5);
        k.addEdge(k1, k2, null, 1.0);
        k.addEdge(k1, k3, null, 7.0);
        k.addEdge(k2, k3, null, 5.0);
        k.addEdge(k2, k4, null, 4.0);
        k.addEdge(k3, k5, null, 6.0);
        k.addEdge(k2, k5, null, 3.0);
        k.addEdge(k4, k5, null, 2.0);
        System.out.println(k.edges());
        System.out.println(GraphAlgorithms.kruskalMST(k));

        Graph<Integer, String> d = new AdjacencyList<>(true);
        Vertex<Integer> d1 = new Vertex<>(1);
        Vertex<Integer> d2 = new Vertex<>(2);
        Vertex<Integer> d3 = new Vertex<>(3);
        Vertex<Integer> d4 = new Vertex<>(4);
        Vertex<Integer> d5 = new Vertex<>(5);
        Vertex<Integer> d6 = new Vertex<>(6);
        Vertex<Integer> d7 = new Vertex<>(7);
        Vertex<Integer> d8 = new Vertex<>(8);
        Vertex<Integer> d9 = new Vertex<>(9);
        Vertex<Integer> d10 = new Vertex<>(10);
        d.addEdge(d1, d2, null, null);
        d.addEdge(d1, d3, null, null);
        d.addEdge(d2, d6, null, null);
        d.addEdge(d3, d4, null, null);
        d.addEdge(d3, d6, null, null);
        d.addEdge(d5, d6, null, null);
        d.addEdge(d6, d7, null, null);
        d.addEdge(d7, d8, null, null);
        d.addEdge(d7, d9, null, null);
        d.addEdge(d9, d10, null, null);
        //System.out.println(GraphAlgorithms.BFS(d, d1));
        //GraphAlgorithms.predecessorSubgraphBFS(d1, d5);

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
        //System.out.println(t.edges());
        System.out.println(GraphAlgorithms.kruskalMST(t));
        System.out.println(GraphAlgorithms.primMST(t, t1));
    }
}


 
