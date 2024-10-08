package Week_10_Recursion.Assignment;

import java.util.Arrays;
import java.util.Scanner;
/*
Given an array of integers, print a sum triangle using recursion from it such that the first level has all array elements.
After that, at each level the number of elements is one less than the previous level
and elements at the level will be the sum of consecutive two elements in the previous level.
So, if sample input is [5, 4, 3, 2, 1], sample output will be:
[5, 4, 3, 2, 1]
[9, 7, 5, 3]
[16, 12, 8]
[28, 20]
[48]
*/
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
