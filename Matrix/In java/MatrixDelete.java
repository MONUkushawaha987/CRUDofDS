public class MatrixDelete {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        // Delete a row
        matrix = deleteRow(matrix, 1);
        System.out.println("\nAfter deleting row 1:");
        printMatrix(matrix);
        
        // Delete a column
        matrix = deleteColumn(matrix, 2);
        System.out.println("\nAfter deleting column 2:");
        printMatrix(matrix);
        
       
    }
    
    public static int[][] deleteRow(int[][] matrix, int rowToDelete) {
        if (matrix == null || rowToDelete < 0 || rowToDelete >= matrix.length) {
            return matrix;
        }
        
        int[][] newMatrix = new int[matrix.length - 1][matrix[0].length];
        
        for (int i = 0, k = 0; i < matrix.length; i++) {
            if (i == rowToDelete) {
                continue;
            }
            newMatrix[k++] = matrix[i].clone();
        }
        
        return newMatrix;
    }
    
    public static int[][] deleteColumn(int[][] matrix, int colToDelete) {
        if (matrix == null || colToDelete < 0 || colToDelete >= matrix[0].length) {
            return matrix;
        }
        
        int[][] newMatrix = new int[matrix.length][matrix[0].length - 1];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0, k = 0; j < matrix[i].length; j++) {
                if (j == colToDelete) {
                    continue;
                }
                newMatrix[i][k++] = matrix[i][j];
            }
        }
        
        return newMatrix;
    }
    
    public static int[][] clearMatrix(int[][] matrix) {
        return null; // Or return new int[0][0] for empty matrix
    }
    
    public static void printMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            System.out.println("Matrix is empty");
            return;
        }
        
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}