import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class GraphBuilder {

    public static void unweightedIntGraph(Graph<Integer, Integer> g, File file, Map<Integer, Vertex<Integer>> data) throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        String firstLine = scan.nextLine();
        String[] vs = firstLine.split(" ");
        for (int i = 0; i < vs.length; i++) {
            Integer vertexLabel = Integer.parseInt(vs[i]);
            if (!data.containsKey(vertexLabel)) {
                data.put(vertexLabel, new Vertex<>(vertexLabel));
            }
        }
        while (scan.hasNextLine()) {
            String edges = scan.nextLine();
            String[] es = edges.split(", ");
            Integer u = Integer.parseInt(es[0]);
            Integer v = Integer.parseInt(es[1]);
            g.addEdge(data.get(u), data.get(v), null, null);
        }
    }

    public static void unweightedStrGraph(Graph<String, String> g, File file, Map<String, Vertex<String>> data) throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        String firstLine = scan.nextLine();
        String[] vs = firstLine.split(", ");
        for (String v : vs) {
            if (!data.containsKey(v)) {
                data.put(v, new Vertex<>(v));
            }
        }
        while (scan.hasNextLine()) {
            String edges = scan.nextLine();
            String[] es = edges.split(", ");
            g.addEdge(data.get(es[0]), data.get(es[1]), null, null);
        }
    }
}
