package Week_10_Recursion.Practice_Recurssion;

import java.util.Scanner;
/*
Given a string, return the number of lowercase characters in it using recursion.
 */
public class Count_Lowercase {

    // Recursive function to count lowercase letters in a string
    public static int countLowercase(String str, int index, int lowercaseCount) {
        // Base case: If we have reached the end of the string
        if (index == str.length()) {
            return lowercaseCount;
        }

        // Get the current character
        char currentChar = str.charAt(index);

        // Check if the character is a lowercase letter
        if (Character.isLowerCase(currentChar)) {
            lowercaseCount += 1; // Increment the lowercase count
        }

        // Recursive call to process the next character
        return countLowercase(str, index + 1, lowercaseCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the string
        System.out.println("Enter the string: ");
        String inputString = scanner.nextLine();

        // Count and print the number of lowercase letters in the string
        System.out.println("Number of lowercase letters in the string: " + countLowercase(inputString, 0, 0));
    }
}
