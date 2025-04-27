import java.util.*;

public class GraphUpdate {
    private Map<Integer, List<Integer>> adjacencyList;

    public GraphUpdate() {
        adjacencyList = new HashMap<>();
        // Initialize with some data
        adjacencyList.put(1, new ArrayList<>(Arrays.asList(2, 3)));
        adjacencyList.put(2, new ArrayList<>(Arrays.asList(3)));
        adjacencyList.put(3, new ArrayList<>(Arrays.asList(1)));
    }

    public void updateVertex(int oldVertex, int newVertex) {
        if (!adjacencyList.containsKey(oldVertex)) {
            System.out.println("Vertex " + oldVertex + " doesn't exist.");
            return;
        }
        
        if (adjacencyList.containsKey(newVertex)) {
            System.out.println("Vertex " + newVertex + " already exists.");
            return;
        }
        
        // Get neighbors and remove old vertex
        List<Integer> neighbors = adjacencyList.get(oldVertex);
        adjacencyList.remove(oldVertex);
        
        // Add new vertex with same neighbors
        adjacencyList.put(newVertex, neighbors);
        
        // Update all references to old vertex
        for (List<Integer> edges : adjacencyList.values()) {
            Collections.replaceAll(edges, oldVertex, newVertex);
        }
        
        System.out.println("Updated vertex " + oldVertex + " to " + newVertex);
    }

    public void printGraph() {
        System.out.println("\nCurrent Graph:");
        for (int vertex : adjacencyList.keySet()) {
            System.out.print(vertex + " -> ");
            for (int neighbor : adjacencyList.get(vertex)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphUpdate graph = new GraphUpdate();
        
        // Display initial graph
        System.out.println("Initial Graph:");
        graph.printGraph();
        
        // Update vertex
        graph.updateVertex(2, 5);
        
        // Display updated graph
        System.out.println("\nAfter Update:");
        graph.printGraph();
        
        // Try invalid updates
        graph.updateVertex(10, 20); // Non-existent vertex
        graph.updateVertex(1, 3);   // Existing new vertex
    }
}