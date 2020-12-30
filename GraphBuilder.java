import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class GraphBuilder {

    public static void unweightedIntGraph(Graph<Integer, Integer> g, File file, Map<Integer, Vertex<Integer>> data) throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        String firstLine = scan.nextLine();
        String[] vs = firstLine.split(" ");
        for (String v : vs) {
            Integer vertexLabel = Integer.parseInt(v);
            if (!data.containsKey(vertexLabel)) {
                data.put(vertexLabel, new Vertex<>(vertexLabel));
            }
        }
        while (scan.hasNextLine()) {
            String edge = scan.nextLine();
            String[] e = edge.split(", ");
            Integer u = Integer.parseInt(e[0]);
            Integer v = Integer.parseInt(e[1]);
            g.addEdge(data.get(u), data.get(v), null, null);
        }
    }

    public static void weightedIntGraph(Graph<Integer, Integer> g, File file, Map<Integer, Vertex<Integer>> data) throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        String firstLine = scan.nextLine();
        String[] vs = firstLine.split(" ");
        for (String v : vs) {
            Integer vertexLabel = Integer.parseInt(v);
            if (!data.containsKey(vertexLabel)) {
                data.put(vertexLabel, new Vertex<>(vertexLabel));
            }
        }
        while (scan.hasNextLine()) {
            String edge = scan.nextLine();
            String[] e = edge.split(", ");
            Integer u = Integer.parseInt(e[0]);
            Integer v = Integer.parseInt(e[1]);
            Double w = Double.parseDouble(e[2]);
            g.addEdge(data.get(u), data.get(v), null, w);
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
            String edge = scan.nextLine();
            String[] e = edge.split(", ");
            g.addEdge(data.get(e[0]), data.get(e[1]), null, null);
        }
    }

    public static void weightedStrGraph(Graph<String, String> g, File file, Map<String, Vertex<String>> data) throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        String firstLine = scan.nextLine();
        String[] vs = firstLine.split(", ");
        for (String v : vs) {
            if (!data.containsKey(v)) {
                data.put(v, new Vertex<>(v));
            }
        }

        while (scan.hasNextLine()) {
            String edge = scan.nextLine();
            String[] e = edge.split(", ");
            String u = e[0];
            String v = e[1];
            Double w = Double.parseDouble(e[2]);
            g.addEdge(data.get(u), data.get(v), null, w);
        }
    }
}
