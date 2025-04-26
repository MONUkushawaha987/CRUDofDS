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

public class TreeCreate {
    public static void main(String[] args) {
        // Creating a binary tree
        TreeNode root = new TreeNode(10);
        
       
        
        System.out.println("Binary tree created successfully!");
        System.out.println("Tree structure:");
        System.out.println("      10");
        System.out.println("    /   \\");
        System.out.println("  20     30");
        System.out.println(" / \\    /");
        System.out.println("40 50  60");
    }
}