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

public class TreeDelete {
    TreeNode root;
    
    public TreeDelete() {
        // Create a sample tree
        root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);
    }
    
    // Find the minimum value node
    private TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
    
    // Delete a node from BST
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        
        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            
            // Node with two children
            TreeNode temp = findMin(root.right);
            root.data = temp.data;
            root.right = deleteNode(root.right, temp.data);
        }
        return root;
    }
    
    // Print tree (in-order)
    public void printTree(TreeNode node) {
        if (node == null) return;
        printTree(node.left);
        System.out.print(node.data + " ");
        printTree(node.right);
    }
    
    public static void main(String[] args) {
        TreeDelete tree = new TreeDelete();
        
        System.out.println("Original tree (in-order):");
        tree.printTree(tree.root);
        
        // Delete leaf node (20)
        tree.root = tree.deleteNode(tree.root, 20);
        System.out.println("\n\nAfter deleting 20:");
        tree.printTree(tree.root);
        
        // Delete node with one child (30)
        tree.root = tree.deleteNode(tree.root, 30);
        System.out.println("\n\nAfter deleting 30:");
        tree.printTree(tree.root);
        
        // Delete node with two children (50)
        tree.root = tree.deleteNode(tree.root, 50);
        System.out.println("\n\nAfter deleting 50:");
        tree.printTree(tree.root);
    }
}