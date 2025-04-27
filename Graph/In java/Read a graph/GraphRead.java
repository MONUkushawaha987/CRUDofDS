import java.util.*;

public class GraphRead {
    private Map<Integer, List<Integer>> adjacencyList;

    public GraphRead() {
        adjacencyList = new HashMap<>();
        // Initialize with some data
        adjacencyList.put(1, Arrays.asList(2, 3));
        adjacencyList.put(2, Arrays.asList(3));
        adjacencyList.put(3, Arrays.asList(1));
        adjacencyList.put(4, new ArrayList<>());
    }

    public void displayGraph() {
        System.out.println("Current Graph:");
        for (int vertex : adjacencyList.keySet()) {
            System.out.print(vertex + " -> ");
            for (int neighbor : adjacencyList.get(vertex)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public boolean hasVertex(int vertex) {
        boolean exists = adjacencyList.containsKey(vertex);
        System.out.println("Vertex " + vertex + " exists: " + exists);
        return exists;
    }

    public boolean hasEdge(int source, int destination) {
        boolean exists = adjacencyList.containsKey(source) && 
                        adjacencyList.get(source).contains(destination);
        System.out.println("Edge from " + source + " to " + destination + 
                          " exists: " + exists);
        return exists;
    }

    public void getNeighbors(int vertex) {
        if (adjacencyList.containsKey(vertex)) {
            System.out.print("Neighbors of " + vertex + ": ");
            for (int neighbor : adjacencyList.get(vertex)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        } else {
            System.out.println("Vertex " + vertex + " doesn't exist.");
        }
    }

    public static void main(String[] args) {
        GraphRead graph = new GraphRead();
        
        // Display the graph
        graph.displayGraph();
        
        // Check vertex existence
        graph.hasVertex(2);
        graph.hasVertex(5);
        
        
    }
}