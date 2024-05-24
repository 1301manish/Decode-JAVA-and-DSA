package Week_10_Recursion.Assignment;

import java.util.Scanner;

public class Find_Minimum {
    public static int findMinimum(int [] arr, int i){
        if (i==arr.length-1) return arr[i];
        return Math.min(findMinimum(arr,i+1),arr[i]);
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
        int min = findMinimum(arr, 0);
        System.out.println("Minimum element in the array is : " + min);
    }
}
