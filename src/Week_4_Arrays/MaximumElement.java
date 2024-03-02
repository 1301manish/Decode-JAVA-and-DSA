package Week_4_Arrays;

import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size ; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        //int max = arr[0];

        for (int i = 0; i < size ; i++) {
            //max = Math.max(arr[i] , max);   -->> (Replacement of if else Method 2)
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.print("The maximum element in the array is : " + max);
    }
}
