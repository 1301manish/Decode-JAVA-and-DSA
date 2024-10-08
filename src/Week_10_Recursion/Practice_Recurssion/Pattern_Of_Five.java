package Week_10_Recursion.Practice_Recurssion;

import java.util.Scanner;
/*
Given a number n, print the following pattern without using any loop.
 n, n-5, n-10, …, 0, 5, 10, …, n-5, n
 */
public class Pattern_Of_Five {
    public static void printPattern(int n){
        if (n<=0){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printPattern(n-5);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        printPattern(n);
    }
}
