package Week_8_Basic_Sorting;

import java.util.Scanner;

public class Bubble_Sort_1 {
    public static void print(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array : ");
        print(arr);

        for (int i = 0; i < n-1 ; i++) {
            for (int j = 0; j < n-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
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
