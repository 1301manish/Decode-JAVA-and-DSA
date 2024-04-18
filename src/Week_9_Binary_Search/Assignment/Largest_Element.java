package Week_9_Binary_Search.Assignment;

import java.util.Scanner;

public class Largest_Element {
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

        // Initialize lower bound
        int largest = arr.length-1;

        // Binary search to find the lower bound
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) { // You are in left sorted array
                largest = mid;
                start = mid+1;
            } else {
                end = mid-1; // You are in right sorted array
            }
        }

        // Print the index of the lower bound
        System.out.println("Largest element is : " + arr[largest] + " which is at index " + largest);
    }
}
