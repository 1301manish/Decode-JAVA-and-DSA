package Week_8_Basic_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Builtin_Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array : ");
        for (int i = 0; i < size ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("Sorted Array : ");
        for (int i = 0; i < size ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
