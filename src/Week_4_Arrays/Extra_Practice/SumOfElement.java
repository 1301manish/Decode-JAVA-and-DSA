package Week_4_Arrays.Extra_Practice;

import java.util.Scanner;

public class SumOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size ; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size ; i++) {
            sum += arr[i];
        }
        System.out.print("Sum of the elements in the given array is : " + sum);
    }
}
