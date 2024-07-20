public class MatrixTranspose {

               public static int[][] transposeMatrix(int[][] matrix) {
                   int rows = matrix.length;
                   int columns = matrix[0].length;
           
                   // Initialize the transposed matrix with dimensions swapped
                   int[][] transposedMatrix = new int[columns][rows];
           
                   // Transpose the matrix
                   for (int i = 0; i < rows; i++) {
                       for (int j = 0; j < columns; j++) {
                           transposedMatrix[j][i] = matrix[i][j];
                       }
                   }
           
                   return transposedMatrix;
               }
           
               public static void printMatrix(int[][] matrix) {
                   // Print the matrix
                   System.out.println("The matrix is: ");
                   for (int[] row : matrix) {
                       for (int element : row) {
                           System.out.print(element + " ");
                       }
                       System.out.println();
                   }
               }
           
               public static void main(String[] args) {
                   // Example matrix to test the transpose function
                   int[][] matrix = {
                       {1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}
                   };
           
                   // Print the original matrix
                   System.out.println("Original Matrix:");
                   printMatrix(matrix);
           
                   // Transpose the matrix
                   int[][] transposedMatrix = transposeMatrix(matrix);
           
                   // Print the transposed matrix
                   System.out.println("Transposed Matrix:");
                   printMatrix(transposedMatrix);
               }
           }
           
