package Week_4_Arrays.Assignment_Arrays;

import java.util.Scanner;
/*
Q10. Given an array of integers, change the value of all odd indexed elements to its second multiple and
increment all even indexed values by 10.
 */
public class ModifyOddAndEvenIndeces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size ; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <size; i=i+2) {
            arr[i]+=10;
        }
        for (int i = 1; i <size; i=i+2) {
            arr[i]*=2;
        }
        for (int i = 0; i <size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
