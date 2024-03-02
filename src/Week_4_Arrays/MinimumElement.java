package Week_4_Arrays;

import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size ; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        //int min = arr[0];

        for (int i = 0; i < size ; i++) {
            //min = Math.min(arr[i] , min); -->> (Replacement of if else Method 2)
            if(arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.print("The minimum element in the array is : " + min);
    }
}
