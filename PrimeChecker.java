public class PrimeChecker {

               public static boolean isPrime(int number) {
                   // Check if number is less than 2 (not prime)
                   if (number < 2) {
                       return false;
                   }
           
                   // Check if number is 2 or 3 (prime)
                   if (number == 2 || number == 3) {
                       return true;
                   }
           
                   // Check if number is even (not prime)
                   if (number % 2 == 0) {
                       return false;
                   }
           
                   // Check for factors from 3 to sqrt(number)
                   for (int i = 3; i <= Math.sqrt(number); i += 2) {
                       if (number % i == 0) {
                           return false;
                       }
                   }
           
                   // If no factors found, number is prime
                   return true;
               }
           
               public static void main(String[] args) {
                   // Test the isPrime function with some numbers
                   int[] testNumbers = {2, 3, 4, 5, 16, 17, 18, 19, 20, 97, 100};
           
                   for (int number : testNumbers) {
                       System.out.println("Is " + number + " a prime number? " + isPrime(number));
                   }
               }
           }
           
