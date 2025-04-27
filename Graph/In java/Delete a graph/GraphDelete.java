import java.util.*;

public class GraphDelete {
    private Map<Integer, List<Integer>> adjacencyList;

    public GraphDelete() {
        adjacencyList = new HashMap<>();
        // Initialize with some data
        adjacencyList.put(1, new ArrayList<>(Arrays.asList(2, 3)));
        adjacencyList.put(2, new ArrayList<>(Arrays.asList(3)));
        adjacencyList.put(3, new ArrayList<>(Arrays.asList(1, 4)));
        adjacencyList.put(4, new ArrayList<>());
    }

    public void removeEdge(int source, int destination) {
        if (!adjacencyList.containsKey(source)) {
            System.out.println("Source vertex " + source + " doesn't exist.");
            return;
        }
        
        if (adjacencyList.get(source).remove(Integer.valueOf(destination))) {
            System.out.println("Removed edge from " + source + " to " + destination);
        } else {
            System.out.println("Edge from " + source + " to " + destination + " doesn't exist.");
        }
    }

    public void removeVertex(int vertex) {
        if (!adjacencyList.containsKey(vertex)) {
            System.out.println("Vertex " + vertex + " doesn't exist.");
            return;
        }
        
        // Remove all edges pointing to this vertex
        for (List<Integer> edges : adjacencyList.values()) {
            edges.remove(Integer.valueOf(vertex));
        }
        
        // Remove the vertex itself
        adjacencyList.remove(vertex);
        System.out.println("Removed vertex " + vertex);
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
        GraphDelete graph = new GraphDelete();
        
        // Display initial graph
        System.out.println("Initial Graph:");
        graph.printGraph();
        
        // Remove edges
        graph.removeEdge(1, 2);
        graph.removeEdge(1, 5); // Non-existent edge
        
        // Display after edge removal
        System.out.println("\nAfter Edge Removal:");
        graph.printGraph();
        
        // Remove vertex
        graph.removeVertex(3);
        
        // Display after vertex removal
        System.out.println("\nAfter Vertex Removal:");
        graph.printGraph();
    }
}