package Week_8_Basic_Sorting;
/*
Time complexity :
    Worst Case Time Complexity is: O(N^2)
    Average Case Time Complexity is: O(N^2)
    Best Case Time Complexity is: O(N^2)

Space Complexity : O(1)

Stability? : Unstable
*/
import java.util.Scanner;

public class Selection_Sort_With_Maximum_Element {
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

        for (int i = n-1; i > 0; i--) {
            int max = Integer.MIN_VALUE;
            int maxIdx = -1;
            for (int j = i; j >= 0; j--) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
        }

        System.out.println("Sorted Array : ");
        print(arr);
    }
}