package Week_10_Recursion;

import java.util.Scanner;

public class Maximum_Element_In_Array {
    public static void max1(int [] arr, int n, int idx, int max){
        if (idx==n){
            System.out.println("Maximum element in the array is (max1) : " + max);
            return;
        }
        if (arr[idx]>max) max=arr[idx];
        max1(arr,n,idx+1,max);

    }

    public static int max2(int [] arr, int n, int idx){
        if (idx==n) return Integer.MIN_VALUE;
        return Math.max(arr[idx],max2(arr,n,idx+1) );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        max1(arr,n,0,Integer.MIN_VALUE);
        System.out.println("Maximum element in the array is (max2) : " + max2(arr, n, 0));
    }
}
