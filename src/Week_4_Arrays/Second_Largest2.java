package Week_4_Arrays;

import java.util.Scanner;

public class Second_Largest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int index_Max = 0;
        for (int i = 0; i < size; i++) {
            if(arr[i]>max){
                max = arr[i];
                index_Max=i;
            }
        }
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if(arr[i]>smax && index_Max !=i){
                smax = arr[i];
            }
        }
        System.out.print("The second largest element in the given array is : " + smax);
    }
}