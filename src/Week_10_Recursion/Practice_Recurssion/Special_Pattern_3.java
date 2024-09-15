package Week_10_Recursion.Practice_Recurssion;

import java.util.Scanner;
/*
A string is called special if it consists of only stars(‘*’) and dashes(‘-’), and there are no
consecutive stars in the string. Given a positive integer k, print all the special strings of size k.
 */
public class Special_Pattern_3 {

    // Recursive function to generate all possible combinations of patterns using '-' and '*'
    public static void generatePattern(int length, String currentPattern) {
        // Base case: when length reaches 0, print the current combination of the pattern
        if (length == 0) {
            System.out.println(currentPattern);
            return;
        }

        // Recursive case 1: Add '-' to the current pattern and reduce length by 1
        generatePattern(length - 1, currentPattern + "-");

        // Recursive case 2: Add '*' to the current pattern, but only if the previous character is not '*'
        if (currentPattern.isEmpty() || currentPattern.charAt(currentPattern.length() - 1) != '*') {
            generatePattern(length - 1, currentPattern + "*");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: the length of the pattern to be generated
        System.out.println("Enter the value of n (length of pattern): ");
        int n = sc.nextInt();

        // Generate and print all possible combinations of patterns with '-' and '*'
        generatePattern(n, "");
    }
}
