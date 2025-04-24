public class MatrixCreate {
    public static void main(String[] args) {
        // Create a 3x3 matrix
        int rows = 3;
        int cols = 3;
        int[][] matrix = new int[rows][cols];
        
       
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