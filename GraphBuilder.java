import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class GraphBuilder {

    public static Graph<Integer, Integer> unweightedIntGraph(Graph<Integer, Integer> g, File file) throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        String firstLine = scan.nextLine();
        String[] vs = firstLine.split(" ");
        Map<Integer, Vertex<Integer>> data = new HashMap<>();
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
        return g;
    }
}
