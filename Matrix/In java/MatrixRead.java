public class MatrixRead {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Read entire matrix
        System.out.println("Full Matrix:");
        printMatrix(matrix);
        
        // Read specific element
        int row = 1, col = 2;
        System.out.printf("\nElement at [%d][%d]: %d\n", row, col, matrix[row][col]);
        
        // Read a specific row
        int rowToRead = 0;
        System.out.printf("\nRow %d: ", rowToRead);
        printRow(matrix, rowToRead);
        
        // Read a specific column
        int colToRead = 1;
        System.out.printf("\nColumn %d: ", colToRead);
        printColumn(matrix, colToRead);
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t"); 
            }
            System.out.println();
        }
    }
    
    public static void printRow(int[][] matrix, int row) {
        for (int element : matrix[row]) {
            System.out.print(element + " ");
        }
    }
    
    public static void printColumn(int[][] matrix, int col) {
        for (int[] row : matrix) {
            System.out.print(row[col] + " ");
        }
    }
} 