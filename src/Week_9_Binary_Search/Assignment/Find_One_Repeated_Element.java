package Week_9_Binary_Search.Assignment;

import java.util.Scanner;
/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n]
inclusive in sorted order.
There is only one repeated number in nums, return this repeated number
 */
public class Find_One_Repeated_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Get the elements of the array from the user (assuming the array is sorted)
        System.out.print("Enter the elements of Array (sorted): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize start and end pointers for binary search
        int start = 0, end = arr.length - 1;

        // Perform binary search
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if the current element is equal to its index + 1
            if (arr[mid] == mid + 1)
                start = mid + 1; // If yes, move to the right half of the array
            else if (arr[mid] == mid) {
                // If the current element is equal to its index and it's not the first occurrence
                if (arr[mid] == arr[mid - 1]) {
                    System.out.println("Duplicate element is " + arr[mid]); // Found the repeated element
                    break;
                } else
                    end = mid - 1; // Move to the left half of the array
            }
        }
        if (start>end) System.out.println("No repeating elements found");
    }
}
