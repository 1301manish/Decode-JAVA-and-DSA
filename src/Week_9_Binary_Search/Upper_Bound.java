// Given a sorted integer array and an integer 'x', find the upper bound of x.
/*
Linear approach

for(int i=0; i<n; i++){
    if(arr[i]>x) {
    System.out.println("Upper bond is : "+arr[i]);
    break;
    }
}
 */
package Week_9_Binary_Search;

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

        // Initialize start and end pointers for binary search
        int start = 0, end = arr.length - 1;
        boolean flag = false; // Flag to track if upper bound found

        // Binary search loop
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) { // If target found, move to the right for upper bound
                flag = true;
                System.out.println("Upper bound : " + arr[mid + 1]);
                break;
            } else if (arr[mid] < target) {
                start = mid + 1; // If target is greater, search in the right half
            } else {
                end = mid - 1; // If target is smaller, search in the left half
            }
        }

        // If upper bound not found within the array, print the last element
        if (!flag)
            System.out.println("Upper bound : " + arr[start]);
    }
}
