package Week_10_Recursion.Assignment;

import java.util.Scanner;

public class Print_Array_In_Reverse {
    public static void printReverse(int [] arr, int i){
        if (i<0) return;

        System.out.print(arr[i] + " ");
        printReverse(arr,i-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Printing the array in reverse : ");
        printReverse(arr,n-1);
    }
}
