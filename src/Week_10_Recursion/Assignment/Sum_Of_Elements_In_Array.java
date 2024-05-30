package Week_10_Recursion.Assignment;

import java.util.Scanner;

public class Sum_Of_Elements_In_Array {
    public static int findSum(int [] arr, int i) {
        if (i==arr.length-1) return arr[i];
        return arr[i] + findSum(arr, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The sum of the elements of the array is : " + findSum(arr,0));
    }
}
 