public class StringReverser {

               public static String reverseString(String input) {
                   // Create a new StringBuilder with the input string
                   StringBuilder reversed = new StringBuilder(input);
           
                   // Reverse the string using StringBuilder's reverse method
                   reversed.reverse();
           
                   // Convert the StringBuilder back to a String and return it
                   return reversed.toString();
               }
           
               public static void main(String[] args) {
                   // Test the reverseString function with some strings
                   String[] testStrings = {"hello", "world", "Java", "programming", "OpenAI"};
           
                   for (String str : testStrings) {
                       System.out.println("Original: " + str);
                       System.out.println("Reversed: " + reverseString(str));
                       System.out.println(); // Print a newline for better readability
                   }
               }
           }
           
