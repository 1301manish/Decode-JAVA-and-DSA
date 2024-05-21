package Week_10_Recursion;
import java.util.*;

public class Subarrays {

    // Recursive function to print all subsets of an array
    public static void printSubArray_Recursion(ArrayList<Integer> list, int[] arr, int idx) {
        // Base case: if index exceeds array length, print the current subset and return
        if (idx == arr.length) {
            System.out.println(list);
            return;
        }

        /*
        // For printing the subset:

        // Recursive call to skip the current element at index 'idx'
        printSubArray_Recursion(list, arr, idx+1);
        // Include the current element at index 'idx' in the subset
        list.add(arr[idx]);
        // Recursive call to include the current element and explore subsets starting from the next index
        printSubArray_Recursion(list, arr, idx+1);
        // Backtrack: remove the last element to revert to the previous state
        list.remove(list.size()-1);
        */

        // For printing the sub array:

        // Recursive call to skip the current element at index 'idx'
        printSubArray_Recursion(list, arr, idx + 1);

        // Check conditions to include the current element in the subset
        if (list.isEmpty() || list.get(list.size() - 1) == arr[idx - 1]) {
            // If list is empty or the last element in the list is equal to the previous element in the array,
            // include the current element at index 'idx' to start or continue the sub array
            list.add(arr[idx]);
            // Recursively call to explore sub arrays starting from the next index
            printSubArray_Recursion(list, arr, idx + 1);
            // Backtrack: remove the last element to revert to the previous state
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        // Input array
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;

        // Program to print all sub arrays
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    // Print each element of the sub array from index 'i' to 'j'
                    System.out.print(arr[k] + " ");
                }
                // Print a new line after printing all elements of a sub array
                System.out.println();
            }
        }

        // Call the recursive function to print all subsets of the array
        printSubArray_Recursion(new ArrayList<>(), arr, 0);
    }
}
