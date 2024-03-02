package Week_4_Arrays.Practice;
/*
Given an integer m, n, and n integers, return true if the number of unique integers among the n integers is
 greater than or equal to m, else return false.(Integers appearing multiple times are all considered as 1 unique
 integer)
 */
import java.util.Arrays;
import java.util.Scanner;

public class NumberOfUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of m : ");
        int m  = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 1;
        int i = 0;
        while(i<n-1){
            if(arr[i]!=arr[i+1]){
                count++;
            }
            i++;
        }
        if(count>=m) System.out.println("True");
        else System.out.println("False");
    }
}