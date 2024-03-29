package Week_9_Binary_Search;

import java.util.Scanner;

public class Lower_Bond {
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

        int lo = n; // Initializing lo with n, it will be updated with the lowest index where target can be inserted

        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                // If mid-element is greater than or equal to target, update upperBond and move towards lower indices
                lo = Math.min(lo, mid);
                end = mid - 1;
            } else {
                // If mid-element is less than target, move towards higher indices
                start = mid + 1;
            }
        }
        // Output the lowest index where target can be inserted
        System.out.println(lo);
    }
}

