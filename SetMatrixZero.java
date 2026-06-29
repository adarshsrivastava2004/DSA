// import java.util.*;

public class SetMatrixZero {
    // Function to set entire row and column to 0 if an element in the matrix is 0
    public static void setZeroes(int[][] matrix) {
        // Get number of rows
        int m = matrix.length;
        // Get number of columns
        int n = matrix[0].length;

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];


        // First pass: mark rows and columns
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If the cell is zero
                if (matrix[i][j] == 0) {
                    // Mark entire row as -1 (except zeros)
                    // for (int col = 0; col < n; col++) {
                    //     if (matrix[i][col] != 0)
                    //         matrix[i][col] = -1;
                    // }
                    // // Mark entire column as -1 (except zeros)
                    // for (int row = 0; row < m; row++) {
                    //     if (matrix[row][j] != 0)
                    //         matrix[row][j] = -1;
                    // }
                    row[i]=true;
                    col[j]=true;
                }
            }
        }

        // Second pass: replace -1 with 0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j])
                    matrix[i][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        
        // Modify matrix
        setZeroes(matrix);
        
        // Print result
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}