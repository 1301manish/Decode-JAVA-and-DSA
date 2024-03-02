package Week_4_Arrays.Practice;

import java.util.Scanner;
/*
Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the
 missing number from the first N integers. There are no duplicates in the list.
 */
public class MissingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        int sum1 = ((n+1)*(n+2))/2;
        int sum2 = 0;
        for(int i = 0; i<n; i++){
            sum2+=arr[i];
        }
        int ans = sum1 - sum2;
        System.out.println("Missing number is : " + ans);
    }
}
