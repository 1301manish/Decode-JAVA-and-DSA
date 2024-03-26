package Week_8_Basic_Sorting.Assignment;

import java.util.Arrays;
import java.util.Scanner;

/*Given an integer array and an integer k where k<=size of array, We need to return the kth smallest
element of the array.*/
public class Kth_Smallest_Element {
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
