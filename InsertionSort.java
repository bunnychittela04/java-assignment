public class InsertionSort {

               public static void insertionSort(int[] array) {
                   int n = array.length;
           
                   // Loop through the array starting from the second element
                   for (int i = 1; i < n; ++i) {
                       int key = array[i];
                       int j = i - 1;
           
                       // Move elements of array[0..i-1], that are greater than key, to one position ahead of their current position
                       while (j >= 0 && array[j] > key) {
                           array[j + 1] = array[j];
                           j = j - 1;
                       }
                       array[j + 1] = key;
                   }
               }
           
               public static void printArray(int[] array) {
                   // Print the array
                   for (int element : array) {
                       System.out.print(element + " ");
                   }
                   System.out.println();
               }
           
               public static void main(String[] args) {
                   // Example array to test the insertion sort function
                   int[] array = {12, 11, 13, 5, 6};
           
                   // Print the original array
                   System.out.println("Original array:");
                   printArray(array);
           
                   // Sort the array using insertion sort
                   insertionSort(array);
           
                   // Print the sorted array
                   System.out.println("Sorted array:");
                   printArray(array);
               }
           }
           
