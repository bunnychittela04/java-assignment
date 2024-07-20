public class MatrixMinMax {

               public static int findSmallestValue(int[][] matrix) {
                   int minValue = Integer.MAX_VALUE;
           
                   // Loop through each element to find the smallest value
                   for (int[] row : matrix) {
                       for (int element : row) {
                           if (element < minValue) {
                               minValue = element;
                           }
                       }
                   }
           
                   return minValue;
               }
           
               public static int findLargestValue(int[][] matrix) {
                   int maxValue = Integer.MIN_VALUE;
           
                   // Loop through each element to find the largest value
                   for (int[] row : matrix) {
                       for (int element : row) {
                           if (element > maxValue) {
                               maxValue = element;
                           }
                       }
                   }
           
                   return maxValue;
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
                   // Example matrix to test the functions
                   int[][] matrix = {
                       {1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}
                   };
           
                   // Print the original matrix
                   System.out.println("Original Matrix:");
                   printMatrix(matrix);
           
                   // Find and print the smallest value in the matrix
                   int smallestValue = findSmallestValue(matrix);
                   System.out.println("Smallest value in the matrix: " + smallestValue);
           
                   // Find and print the largest value in the matrix
                   int largestValue = findLargestValue(matrix);
                   System.out.println("Largest value in the matrix: " + largestValue);
               }
           }
           