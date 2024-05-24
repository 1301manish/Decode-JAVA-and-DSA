package Week_10_Recursion.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Construct_Triangle {
    public static void printTriangle(int [] arr){
        if (arr.length<1) return;

        System.out.println("Construct level : " + Arrays.toString(arr));

        int [] temp = new int[arr.length-1];

        for (int i = 0; i < arr.length-1; i++) {
            temp[i] = arr[i] + arr[i+1];
        }

        printTriangle(temp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        printTriangle(arr);
    }
}
