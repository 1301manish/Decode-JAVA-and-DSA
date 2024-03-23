package Week_8_Basic_Sorting;

import java.util.Scanner;

/*
Check if the given array is sorted or not
 */
public class If_Array_Is_Sorted_Or_Not {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size ; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size-1 ; i++) {
            if(arr[i]>arr[i+1]) {
                flag = false ;
                break;
            }
        }
        if(flag) System.out.println("Array is sorted");
        else System.out.println("Array is not sorted");
    }
}
