package Week_4_Arrays.Assignment_Arrays;

import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size ; i++) {
            arr[i] = sc.nextInt();
        }
        int sumOdd = 0;
        int sumeven = 0;
        for (int i = 0; i <size; i=i+2) {
            sumeven+=arr[i];
        }
        for (int i = 1; i <size; i=i+2) {
            sumOdd+=arr[i];
        }
        int difference = 0;
        if(sumeven>sumOdd) difference=sumeven-sumOdd;
        else difference=sumOdd-sumeven;
        System.out.println("The difference in sum if odd and even indeces is : " + difference);
    }
}
