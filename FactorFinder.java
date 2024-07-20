public class FactorFinder {

               public static void findFactors(int number) {
                   // Print a message indicating the factors of the number
                   System.out.println("Factors of " + number + " are:");
           
                   // Loop from 1 to the number (inclusive) to find factors
                   for (int i = 1; i <= number; i++) {
                       if (number % i == 0) {
                           System.out.println(i);
                       }
                   }
               }
           
               public static void main(String[] args) {
                   // Test the findFactors function with some numbers
                   int[] testNumbers = {1, 2, 3, 10, 16, 18, 25, 50, 100};
           
                   for (int number : testNumbers) {
                       findFactors(number);
                       System.out.println(); // Print a newline for better readability
                   }
               }
           }
           
