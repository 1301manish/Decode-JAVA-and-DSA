package Week_9_Binary_Search.Assignment;

import java.util.Scanner;

public class Occurrence_Of_Element {
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

        int firstOccur = -1;
        int lastOccur = -1;

        //Find lower bond
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                if (mid > 0 && arr[mid]==arr[mid-1]) end = mid - 1;
                else {
                    firstOccur = mid;
                    break;
                }
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        //Find upper bond
        start = 0;
        end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                if (mid+1<n && arr[mid]==arr[mid+1])start = mid+1;
                else {
                    lastOccur = mid;
                    break;
                }
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }


        if (firstOccur==-1) System.out.println("Element not found in the array");
        else System.out.println(target + " occurs " + (lastOccur-firstOccur+1) + " times in the array");
    }
}
