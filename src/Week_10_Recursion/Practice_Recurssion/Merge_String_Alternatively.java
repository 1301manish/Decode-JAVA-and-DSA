package Week_10_Recursion.Practice_Recurssion;

import java.util.Scanner;
/*
Write a program to merge 2 strings alternately using recursion starting from the first input string.
 */
public class Merge_String_Alternatively {

    // Recursive function to merge two strings alternatively
    public static String mergeStrings(String firstString, String secondString, String mergedResult) {
        // Base case: if the first string is empty, append the second string to the result
        if (firstString.isEmpty()) {
            mergedResult += secondString;
            return mergedResult;
        }

        // Base case: if the second string is empty, append the first string to the result
        if (secondString.isEmpty()) {
            mergedResult += firstString;
            return mergedResult;
        }

        // Add the first character of both strings to the merged result
        mergedResult += firstString.charAt(0);
        mergedResult += secondString.charAt(0);

        // Recursively call the function with the remaining parts of both strings
        return mergeStrings(firstString.substring(1), secondString.substring(1), mergedResult);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first string
        System.out.println("Enter the 1st string: ");
        String firstString = scanner.next();

        // Input for the second string
        System.out.println("Enter the 2nd string: ");
        String secondString = scanner.next();

        // Merging the two strings alternatively and printing the result
        System.out.println("Merged String: " + mergeStrings(firstString, secondString, ""));
    }
}
