import java.util.Scanner;

public class MatrixCreator {

    public static int[][] createMatrix() {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of rows
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Prompt user to enter the number of columns
        System.out.println("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[rows][columns];

        // Prompt user to enter the matrix values
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
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
        // Create the matrix
        int[][] matrix = createMatrix();

        // Print the matrix
        printMatrix(matrix);
    }
}

