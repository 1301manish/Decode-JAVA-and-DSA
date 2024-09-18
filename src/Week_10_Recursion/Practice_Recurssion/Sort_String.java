package Week_10_Recursion.Practice_Recurssion;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_String {

    // Recursive function to generate and print all unique sorted substrings
    public static void generateSubstrings(String sortedStr, String currentSubstring, int index) {
        // Base case: When the index reaches the end of the sorted string
        if (index == sortedStr.length()) {
            // Print the non-empty substrings
            if (!currentSubstring.isEmpty()) {
                System.out.println(currentSubstring);
            }
            return;
        }

        // Recursive case 1: Include the current character in the substring
        generateSubstrings(sortedStr, currentSubstring + sortedStr.charAt(index), index + 1);

        // Recursive case 2: Exclude the current character from the substring
        generateSubstrings(sortedStr, currentSubstring, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string from the user
        String inputStr = sc.next();

        // Convert the input string to a character array and sort it
        char[] charArray = inputStr.toCharArray();
        Arrays.sort(charArray);

        // Create a sorted string from the sorted character array
        String sortedStr = new String(charArray);

        // Call the recursive function to generate all sorted unique substrings
        generateSubstrings(sortedStr, "", 0);
    }
}
