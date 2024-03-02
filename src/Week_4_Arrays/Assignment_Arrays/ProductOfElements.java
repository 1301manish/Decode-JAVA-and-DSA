package Week_4_Arrays.Assignment_Arrays;

import java.util.Scanner;
/*
Calculate the product of all the elements in the given array
 */
public class ProductOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int product =1;
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size ; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size ; i++) {
            product *= arr[i];
        }
        System.out.print("product of the elements in the given array is : " + product);
    }
}
