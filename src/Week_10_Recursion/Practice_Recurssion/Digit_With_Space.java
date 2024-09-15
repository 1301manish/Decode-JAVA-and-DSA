package Week_10_Recursion.Practice_Recurssion;

import java.util.Scanner;
/*
Given an input string of digits, find all combinations of numbers that can be formed using
digits in the same order.
 */
public class Digit_With_Space {

    // Recursive function to generate all possible combinations of the digits in the string with or without spaces
    public static void printDigit(String str, String ans, int idx) {
        // Base case: if we've reached the end of the string, print the current combination
        if (idx == str.length()) {
            System.out.println(ans);
            return;
        }

        // Recursive case 1: add the current character without a space
        printDigit(str, ans + str.charAt(idx), idx + 1);

        // Recursive case 2: add the current character followed by a space, but only if it's not the last character
        if (idx != str.length() - 1) {
            printDigit(str, ans + str.charAt(idx) + " ", idx + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: the string consisting of digits
        System.out.println("Enter the string : ");
        String str = sc.next();

        // Generate and print all possible combinations with and without spaces
        printDigit(str, "", 0);

    }
}
