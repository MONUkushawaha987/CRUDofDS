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

public class TreeRead {
    TreeNode root;
    
    public TreeRead() {
        // Create a sample tree
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
    }
    
    // Pre-order traversal
    public void preOrder(TreeNode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    
    // In-order traversal
    public void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
    
    // Post-order traversal
    public void postOrder(TreeNode node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }
    
    // Level-order traversal
    public void levelOrder() {
        if (root == null) return;
        
        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.data + " ");
            
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }
    
    public static void main(String[] args) {
        TreeRead tree = new TreeRead();
        
        System.out.println("Pre-order traversal:");
        tree.preOrder(tree.root);
        
        System.out.println("\n\nIn-order traversal:");
        tree.inOrder(tree.root);
        
        System.out.println("\n\nPost-order traversal:");
        tree.postOrder(tree.root);
        
        System.out.println("\n\nLevel-order traversal:");
        tree.levelOrder();
    }
}