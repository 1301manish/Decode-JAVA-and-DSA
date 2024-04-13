package Week_9_Binary_Search.Assignment;

import java.util.Scanner;

public class Number_Of_Ones_In_Binary_Arrays {
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

        int start = 0, end = arr.length - 1;
        int first = 0, last = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == 1) { // If target found, move to the left for lower bound
                if (mid > 0 && arr[mid] == arr[mid - 1]) end = mid - 1;
                else {
                    first = mid;
                    break;
                }
            } else if (arr[mid] == 0) {
                start = mid + 1; // If target is greater, search in the right half
            }
        }
        int count = last - first;
        System.out.println("Number of 1's in this array is : " + (count+1));
    }
}
