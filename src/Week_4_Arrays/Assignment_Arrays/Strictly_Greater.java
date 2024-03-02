package Week_4_Arrays.Assignment_Arrays;

import java.util.Scanner;

/*
Count the number of elements strictly greater than x.
 */
public class Strictly_Greater {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target : ");
        int x = sc.nextInt();

        for (int i = 0; i < size ; i++) {
            if(arr[i]<x) {
                count++;
            }
        }
        System.out.println(x + " is greater than " + count + " elements");
    }
}
