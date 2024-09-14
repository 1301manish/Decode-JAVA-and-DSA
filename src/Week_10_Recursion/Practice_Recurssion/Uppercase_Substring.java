package Week_10_Recursion.Practice_Recurssion;

import java.util.Scanner;
/*
Given a string, find its first uppercase letter and return the remaining substring, starting from the
uppercase letter.
 */
public class Uppercase_Substring {

    // Recursive function to find the substring starting from the first uppercase letter
    public static String findUppercaseSubstring(String str, int index) {
        // Base case: If we have reached the end of the string without finding an uppercase letter
        if (index == str.length()) {
            return "No uppercase letter found";
        }

        // Check if the current character is uppercase
        if (Character.isUpperCase(str.charAt(index))) {
            // Return the substring starting from the first uppercase letter
            return str.substring(index);
        }

        // Recursive call, checking the next character
        return findUppercaseSubstring(str, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the string
        System.out.println("Enter the string: ");
        String inputString = scanner.next();

        // Find and print the substring starting with the first uppercase letter
        System.out.println("Resultant String: " + findUppercaseSubstring(inputString, 0));
    }
}
