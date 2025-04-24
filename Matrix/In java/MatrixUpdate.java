public class MatrixUpdate {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        // Update single element
        updateElement(matrix, 1, 1, 50);
        System.out.println("\nAfter updating element at [1][1]:");
        printMatrix(matrix);
        
    }
    
    public static void updateElement(int[][] matrix, int row, int col, int newValue) {
        if (row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length) {
            matrix[row][col] = newValue;
        } else {
            System.out.println("Invalid index for update");
        }
    }
    
    public static void updateRow(int[][] matrix, int row, int[] newRow) {
        if (row >= 0 && row < matrix.length && newRow.length == matrix[0].length) {
            matrix[row] = newRow.clone();
        } else {
            System.out.println("Invalid row update");
        }
    }
    
    public static void updateColumn(int[][] matrix, int col, int[] newColumn) {
        if (col >= 0 && col < matrix[0].length && newColumn.length == matrix.length) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][col] = newColumn[i];
            }
        } else {
            System.out.println("Invalid column update");
        }
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