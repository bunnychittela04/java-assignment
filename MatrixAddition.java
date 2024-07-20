public class MatrixAddition {

               public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
                   int rows = matrix1.length;
                   int columns = matrix1[0].length;
           
                   // Initialize the result matrix with the same dimensions
                   int[][] resultMatrix = new int[rows][columns];
           
                   // Loop through each element and add corresponding elements of both matrices
                   for (int i = 0; i < rows; i++) {
                       for (int j = 0; j < columns; j++) {
                           resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                       }
                   }
           
                   return resultMatrix;
               }
           
               public static void printMatrix(int[][] matrix) {
                   // Print the matrix
                   for (int[] row : matrix) {
                       for (int element : row) {
                           System.out.print(element + " ");
                       }
                       System.out.println();
                   }
               }
           
               public static void main(String[] args) {
                   // Example matrices to test the addition function
                   int[][] matrix1 = {
                       {1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}
                   };
           
                   int[][] matrix2 = {
                       {9, 8, 7},
                       {6, 5, 4},
                       {3, 2, 1}
                   };
           
                   // Print the original matrices
                   System.out.println("Matrix 1:");
                   printMatrix(matrix1);
           
                   System.out.println("Matrix 2:");
                   printMatrix(matrix2);
           
                   // Add the matrices
                   int[][] resultMatrix = addMatrices(matrix1, matrix2);
           
                   // Print the result matrix
                   System.out.println("Resultant Matrix after Addition:");
                   printMatrix(resultMatrix);
               }
           }
           
