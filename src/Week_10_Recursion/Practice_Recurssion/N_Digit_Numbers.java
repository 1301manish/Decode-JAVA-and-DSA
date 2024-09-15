package Week_10_Recursion.Practice_Recurssion;

import java.util.Scanner;
/*
Given the number of digits n in a number, print all n-digit numbers whose digits are strictly
increasing from left to right.
 */
public class N_Digit_Numbers {

    // Recursive function to generate all n-digit numbers where digits are in increasing order
    public static void printDigit(int start, String out, int n) {
        // Base case: if no more digits to add, print the current number
        if (n == 0) {
            System.out.println(out);
            return;
        }

        // Recursive case: for each digit from 'start' to 9, generate the next number
        for (int i = start; i <= 9; i++) {
            // Append current digit 'i' and recursively generate the remaining digits
            printDigit(i + 1, out + i, n - 1);
        }
    }

    public static void main(String[] args) {
        // Scanner to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();

        // Start generating n-digit numbers, starting with 0
        printDigit(0, "", n);
    }
}
