package Week_8_Basic_Sorting;

import java.util.Scanner;

public class Insertion_Sort {

    public static void print(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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
        //Method 1
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j>=1 && arr[j]<arr[j-1]){
                swap(arr,j,j-1);
                j--;
            }
        }
          //Method 2
//        for (int i = 1; i < n; i++) {
//            for (int j = i; j >= 1; j--) {
//                if (arr[j]<arr[j-1]) swap(arr,j,j-1);
//                else break;
//            }
//        }

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

Maximum swaps in n size array in bubble sort = n(n+1)/2

Insertion sort is a stable sorting algorithm
Before Sorting : 1,4,3,2,6,3*,5
After Sorting : 1,2,3,3*,4,5,6 --> Stable Sorting
After Sorting : 1,2,3*,3,4,5,6 --> Unstable Sorting
 */