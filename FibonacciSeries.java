public class FibonacciSeries {

               public static void printFibonacciSeries(int terms) {
                   int firstTerm = 0;
                   int secondTerm = 1;
           
                   // Print the first and second terms
                   System.out.print("Fibonacci Series: " + firstTerm + ", " + secondTerm);
           
                   // Generate and print the remaining terms
                   for (int i = 3; i <= terms; i++) {
                       int nextTerm = firstTerm + secondTerm;
                       System.out.print(", " + nextTerm);
           
                       // Update the terms for the next iteration
                       firstTerm = secondTerm;
                       secondTerm = nextTerm;
                   }
                   System.out.println(); // Print a newline for better readability
               }
           
               public static void main(String[] args) {
                   // Example: Print the first 10 terms of the Fibonacci series
                   int terms = 10;
                   printFibonacciSeries(terms);
               }
           }
           
