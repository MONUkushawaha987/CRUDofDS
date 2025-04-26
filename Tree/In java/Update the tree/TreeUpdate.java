class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class TreeUpdate {
    TreeNode root;
    
    public TreeUpdate() {
        // Create a sample tree
        root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        root.right.left = new TreeNode(60);
    }
    
    // Update a node's value
    public boolean updateNode(TreeNode root, int oldValue, int newValue) {
        if (root == null) return false;
        
        if (root.data == oldValue) {
            root.data = newValue;
            return true;
        }
        
        boolean leftUpdated = updateNode(root.left, oldValue, newValue);
        if (leftUpdated) return true;
        
        return updateNode(root.right, oldValue, newValue);
    }
    
    // Print tree (in-order)
    public void printTree(TreeNode node) {
        if (node == null) return;
        printTree(node.left);
        System.out.print(node.data + " ");
        printTree(node.right);
    }
    
    public static void main(String[] args) {
        TreeUpdate tree = new TreeUpdate();
        
        System.out.println("Original tree (in-order):");
        tree.printTree(tree.root);
        
        // Update node with value 20 to 25
        boolean updated = tree.updateNode(tree.root, 20, 25);
        System.out.println("\n\nAfter updating 20 to 25:");
        tree.printTree(tree.root);
        
        // Update node with value 60 to 65
        updated = tree.updateNode(tree.root, 60, 65);
        System.out.println("\n\nAfter updating 60 to 65:");
        tree.printTree(tree.root);
        
        // Try to update non-existent node
        updated = tree.updateNode(tree.root, 100, 200);
        System.out.println("\n\nAttempt to update 100 to 200: " + 
                          (updated ? "Success" : "Failed - Node not found"));
    }
}