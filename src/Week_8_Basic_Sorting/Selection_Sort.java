package Week_8_Basic_Sorting;
/*
Time complexity :
    Worst Case Time Complexity is: O(N2)
    Average Case Time Complexity is: O(N2)
    Best Case Time Complexity is: O(N2)

Space Complexity : O(1)

Stability? : Unstable
*/
import java.util.Scanner;

public class Selection_Sort {
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

        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }

        System.out.println("Sorted Array : ");
        print(arr);
    }
}
