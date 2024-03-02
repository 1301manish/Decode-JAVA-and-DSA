package Week_4_Arrays;

import java.util.Scanner;

public class Rotate_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i <size; i++) {
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        System.out.print("Enter the number of digits to be rotated : ");
        int k = sc.nextInt();
        k = k%n;
        int a = 0;
        int[] brr = new int[n];
        for (int i = n-k; i <n ; i++) {
            brr[a++] = arr[i];
        }
        for (int i = 0; i <n-k ; i++) {
            brr[a++] = arr[i];
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(brr[i] + " ");
        }
    }
}
