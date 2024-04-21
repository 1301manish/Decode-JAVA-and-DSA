package Week_10_Recursion;

import java.util.Scanner;

public class Print_Array {

    public static void print(int i, int [] arr){
        if (i==arr.length) return;
        System.out.print(arr[i] + " ");
        print(i+1, arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array : ");
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        print(0,arr);
    }
}
