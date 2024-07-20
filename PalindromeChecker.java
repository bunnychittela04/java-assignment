public class PalindromeChecker {

               public static boolean isPalindrome(String input) {
                   // Remove non-alphanumeric characters and convert to lowercase
                   String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
                   
                   // Initialize pointers to the start and end of the string
                   int left = 0;
                   int right = cleanedInput.length() - 1;
           
                   // Check characters from both ends towards the center
                   while (left < right) {
                       if (cleanedInput.charAt(left) != cleanedInput.charAt(right)) {
                           return false; // Characters don't match, not a palindrome
                       }
                       left++;
                       right--;
                   }
           
                   return true; // All characters match, it's a palindrome
               }
           
               public static void main(String[] args) {
                   // Example strings to test the palindrome function
                   String[] testStrings = {"A man, a plan, a canal, Panama", "racecar", "hello", "Was it a car or a cat I saw", "No 'x' in Nixon"};
           
                   for (String str : testStrings) {
                       System.out.println("\"" + str + "\" is a palindrome: " + isPalindrome(str));
                   }
               }
           }
           
