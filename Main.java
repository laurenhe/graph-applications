public class Main {
    
    public static void main(String[] args) {
        Graph<Integer, String> g = new AdjacencyList<>(false);
        Vertex<Integer> start = new Vertex<>(1);
        Vertex<Integer> two = new Vertex<>(2);
        Vertex<Integer> three = new Vertex<>(3);
        Vertex<Integer> four = new Vertex<>(4);
        Vertex<Integer> five = new Vertex<>(5);
        Vertex<Integer> six = new Vertex<>(6);
        Vertex<Integer> seven = new Vertex<>(7);
        Vertex<Integer> eight = new Vertex<>(8);
        Vertex<Integer> nine = new Vertex<>(9);
        Vertex<Integer> ten = new Vertex<>(10);
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

        Graph<String, String> cc = new AdjacencyList<>(true);
        Vertex<String> c1 = new Vertex<>("atmosphericCO2");
        Vertex<String> c2 = new Vertex<>("fossilFuels");
        Vertex<String> c3 = new Vertex<>("landPlants");
        Vertex<String> c4 = new Vertex<>("animalsAndMicroorganisms");
        Vertex<String> c5 = new Vertex<>("dissolvedCO2");
        Vertex<String> c6 = new Vertex<>("humus");
        Vertex<String> c7 = new Vertex<>("aquaticPlantsAndAlgae");
        Vertex<String> c8 = new Vertex<>("aquaticAnimals");
        Vertex<String> c9 = new Vertex<>("earthCrust");
        Vertex<String> c10 = new Vertex<>("sedimentMineralization");
        cc.addEdge(c2, c1);
        cc.addEdge(c3, c1);
        cc.addEdge(c4, c1);
        cc.addEdge(c1, c3);
        cc.addEdge(c1, c5);
        cc.addEdge(c3, c4);
        cc.addEdge(c3, c6);
        cc.addEdge(c6, c4);
        cc.addEdge(c6, c2);
        cc.addEdge(c5, c7);
        cc.addEdge(c7, c8);
        cc.addEdge(c8, c5);
        cc.addEdge(c7, c10);
        cc.addEdge(c8, c10);
        cc.addEdge(c10, c9);
        cc.addEdge(c9, c6);
        System.out.println(cc.toString());
        System.out.println(GraphAlgorithms.DFS(cc));
        GraphAlgorithms.startFinishTimesDFS(cc);

        /*
        Graph<Integer, String> hex = new AdjacencyList<>(false);
        Vertex<Integer> h1 = new Vertex<>(1);
        Vertex<Integer> h2 = new Vertex<>(2);
        Vertex<Integer> h3 = new Vertex<>(3);
        Vertex<Integer> h4 = new Vertex<>(4);
        Vertex<Integer> h5 = new Vertex<>(5);
        Vertex<Integer> h6 = new Vertex<>(6);
        Vertex<Integer> h7 = new Vertex<>(7);
        Vertex<Integer> h8 = new Vertex<>(8);
        Vertex<Integer> h9 = new Vertex<>(9);
        Vertex<Integer> h10 = new Vertex<>(10);
        Vertex<Integer> h11 = new Vertex<>(11);
        Vertex<Integer> h12 = new Vertex<>(12);
        Vertex<Integer> h13 = new Vertex<>(13);
        Vertex<Integer> h14 = new Vertex<>(14);
        Vertex<Integer> h15 = new Vertex<>(15);
        Vertex<Integer> h16 = new Vertex<>(16);
        Vertex<Integer> h17 = new Vertex<>(17);
        Vertex<Integer> h18 = new Vertex<>(18;
        Vertex<Integer> h19 = new Vertex<>(19);
        Vertex<Integer> h20 = new Vertex<>(20);
        hex.addEdge(h1, h3);
        hex.addEdge(h1, h4);
        hex.addEdge(h2, h4);
        hex.addEdge(h2, h5);
        hex.addEdge(h3, h6);
        hex.addEdge(h4, h2);
        hex.addEdge(h5, h8);
        hex.addEdge(h6, h9);
        hex.addEdge(h6, h10);
        hex.addEdge(h7, h10);
        hex.addEdge(h7, h11);
        hex.addEdge(h8, h11);
        hex.addEdge(h8, h12);
        hex.addEdge(h9, h13);
        hex.addEdge(h10, h14);
        hex.addEdge(h11, h15);
        hex.addEdge(h12, h16);
        hex.addEdge(h13, h17);
        hex.addEdge(h14, h17);
        hex.addEdge(h14, h18);
        hex.addEdge(h15, h18);
        hex.addEdge(h15, h19);
        hex.addEdge(h16, h19);
        hex.addEdge(h17, h20);
        hex.addEdge(h18, h21);
        hex.addEdge(h19, h22);
        hex.addEdge(h20, h23);
        hex.addEdge(h21, h23);
        hex.addEdge(h21, h24);
        hex.addEdge(h22, h24);
        System.out.println(hex.toString());
        Graph<Integer, Integer> andromeda = new AdjacencyList<>(false);
        Graph<Integer, Integer> cass = new AdjacencyList<>(false);
        Graph<Integer, Integer> ursaMajor = new AdjacencyList<>(false);
        Graph<Integer, Integer> ursaMinor = new AdjacencyList<>(false);
        Graph<Integer, Integer> libra = new AdjacencyList<>(false);
        */
    }
}


 
