package Week_4_Arrays.Practice;

import java.util.Arrays;
import java.util.Scanner;
/*Given an array arr[] and an integer K where K is smaller than size of array, the task is to
 find the Kth smallest element in the given array. It is given that all array elements are
 distinct.*/
public class KthElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        System.out.print("Enter the elements of array : ");
        int[] arr = new int[size];
        for (int i = 0; i <size ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Enter the value of k : ");
        int k = sc.nextInt();
        int element = arr[k-1];
        System.out.print("The " + k + "th smallest is " + element);
    }
}
