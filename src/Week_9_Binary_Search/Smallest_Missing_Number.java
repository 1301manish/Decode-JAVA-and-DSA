package Week_9_Binary_Search;

import java.util.Scanner;
/*
    Linear Approach:

    for (int i = 0; i < arr.length; i++){
        if (i != arr[i]){
            System.out.println(i);
            break;
        }
*/
public class Smallest_Missing_Number {
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

        int ans = -1;

        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == mid) start = mid+1;
            else {
                ans = mid;
                end = mid - 1; // If target is smaller, search in the left half
            }
        }

        if (ans == -1) System.out.println("No element is missing");
        else System.out.println("Missing element is : " + ans);
    }
}
