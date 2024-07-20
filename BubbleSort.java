public class BubbleSort {

               public static void bubbleSort(int[] array) {
                   int n = array.length;
                   boolean swapped;
           
                   // Loop through the array
                   for (int i = 0; i < n - 1; i++) {
                       swapped = false;
           
                       // Compare adjacent elements and swap if needed
                       for (int j = 0; j < n - 1 - i; j++) {
                           if (array[j] > array[j + 1]) {
                               // Swap array[j] and array[j + 1]
                               int temp = array[j];
                               array[j] = array[j + 1];
                               array[j + 1] = temp;
           
                               swapped = true;
                           }
                       }
           
                       // If no elements were swapped, the array is already sorted
                       if (!swapped) {
                           break;
                       }
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
                   // Example array to test the bubble sort function
                   int[] array = {64, 34, 25, 12, 22, 11, 90};
           
                   // Print the original array
                   System.out.println("Original array:");
                   printArray(array);
           
                   // Sort the array using bubble sort
                   bubbleSort(array);
           
                   // Print the sorted array
                   System.out.println("Sorted array:");
                   printArray(array);
               }
           }
           
