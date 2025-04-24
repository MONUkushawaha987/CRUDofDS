public class MatrixCreate {
    public static void main(String[] args) {
        // Create a 3x3 matrix
        int rows = 3;
        int cols = 3;
        int[][] matrix = new int[rows][cols];
        
        // Initialize with values
        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = value++;
            }
        }
        
        // Print the created matrix
        System.out.println("Created Matrix:");
        printMatrix(matrix);
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}