/*
Q. What is upper bond ?
upper bond is the smallest index where arr[i]>target

Linear approach

for(int i=0; i<n; i++){
    if(arr[i]>x) {
    System.out.println("Lower bond is : "+arr[i]);
    break;
    }
}
*/
package Week_9_Binary_Search.Assignment;

import java.util.Scanner;

public class Upper_Bound {
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

        // Get the target element from the user
        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        // Initialize lower bound
        int upper = arr.length;

        // Binary search to find the lower bound
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) { // If target found, move to the left for lower bound
                upper = mid;
                end = mid - 1;
            } else {
                start = mid + 1; // If target is smaller, search in the left half
            }
        }

        // Print the index of the lower bound
        System.out.println("Lower bound is at index : " + upper);
    }
}
