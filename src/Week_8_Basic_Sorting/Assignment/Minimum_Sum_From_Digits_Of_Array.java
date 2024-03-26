package Week_8_Basic_Sorting.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Sum_From_Digits_Of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int a = 0;
        int b = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a = a * 10 + arr[i];
            } else {
                b = b * 10 + arr[i];
            }
        }
        int sum = a+b;
        System.out.println("Required sum : " + sum);
    }
}
