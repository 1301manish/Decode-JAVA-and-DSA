package Week_9_Binary_Search.Assignment;

import java.util.Scanner;

public class Last_Occurrence {
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

        int ans = -1;
        int start = 0, end = arr.length - 1;
        boolean flag = false;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) { // If target found, move to the left for lower bound
                ans = mid;
                start = mid + 1;
            }
            else if (arr[mid] < target){
                start = mid + 1;
            }
            else {
                end = mid - 1; // If target is smaller, search in the left half
            }
        }

        // If lower bound not found within the array, print the last element
        if (ans==-1)
            System.out.println("Element does not exist");
        else System.out.println("The last occurrence of " + target + " is : " + ans);
    }
}
