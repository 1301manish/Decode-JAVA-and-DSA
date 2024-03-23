package Week_8_Basic_Sorting;

import java.util.Scanner;

public class Bubble_Sort_2 {
    // Method to print the elements of the array
    public static void print(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Getting the size of the array from the user
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        // Creating an array of given size
        int[] arr = new int[n];

        // Getting elements of the array from the user
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array : ");
        print(arr);

        // Bubble Sort Algorithm
        // Outer loop runs from 0 to n-2, as after n-1 iterations, the largest element will already be at its correct position.
        for (int i = 0; i < n - 1; i++) {
            // Inner loop runs from 0 to n-2-i, as after each iteration of the outer loop, the largest 'i' elements are already sorted at the end.
            for (int j = 0; j < n - 1 - i; j++) {
                // Comparing adjacent elements and swapping them if they are in the wrong order (ascending order).
                if (arr[j] > arr[j + 1]) {
                    // Swapping the elements using a temporary variable 'temp'.
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


        System.out.println("Sorted Array : ");
        print(arr);
    }
}

/*
Time Complexity:
Worst : O(n^2)
Average : O(n^2)
Best: O(n)
Space Complexity: O(1)
 */
