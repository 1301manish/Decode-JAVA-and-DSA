package Week_8_Basic_Sorting;
/*
Bubble sort is a stable sorting algorithm
Before Sorting : 1,4,3,2,6,3*,5
After Sorting : 1,2,3,3*,4,5,6 --> Stable Sorting
After Sorting : 1,2,3*,3,4,5,6 --> Unstable Sorting

Maximum swaps in n size array in bubble sort = n(n+1)/2
 */
import java.util.Scanner;

public class Descending_Using_Bubble_Sort {
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
            boolean flag = true;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) break;
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
