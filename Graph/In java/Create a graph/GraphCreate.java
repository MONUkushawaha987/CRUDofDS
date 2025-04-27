import java.util.*;

public class GraphCreate {
    private Map<Integer, List<Integer>> adjacencyList;

    public GraphCreate() {
        adjacencyList = new HashMap<>();
    }

    public void addVertex(int vertex) {
        adjacencyList.putIfAbsent(vertex, new ArrayList<>());
        System.out.println("Added vertex: " + vertex);
    }

    public void addEdge(int source, int destination) {
        if (!adjacencyList.containsKey(source)) {
            addVertex(source);
        }
        if (!adjacencyList.containsKey(destination)) {
            addVertex(destination);
        }
        
        adjacencyList.get(source).add(destination);
        System.out.println("Added edge from " + source + " to " + destination);
    }

    public void printGraph() {
        System.out.println("\nGraph Structure:");
        for (int vertex : adjacencyList.keySet()) {
            System.out.print(vertex + " -> ");
            for (int neighbor : adjacencyList.get(vertex)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphCreate graph = new GraphCreate();
        
        // Adding vertices
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        
        // Adding edges
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);
        
        // Display graph
        graph.printGraph();
    }
}