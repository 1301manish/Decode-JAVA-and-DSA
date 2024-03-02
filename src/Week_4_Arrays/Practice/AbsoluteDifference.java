package Week_4_Arrays.Practice;

import java.util.Scanner;
/*
Given an array sorted in increasing order of size n and an integer x, find if there exists a
 pair in the array whose absolute difference is exactly x.(n>1)
 */
public class AbsoluteDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        System.out.println("Enter the target : ");
        int x = sc.nextInt();
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arr[i]-arr[j]==x || arr[j]-arr[i]==x){
                    flag=true;
                    break;
                }
            }
        }
        if(flag) System.out.println("Yes");
        else System.out.println("No");
    }
}
