package Week_6_Strings_And_StringBuilders;

import java.util.Scanner;

public class MaximumOccurringCharacterInString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word : ");
        String str = sc.next(); // Taking input from the user

        // Array to store the frequency of each character (a-z)
        int[] frequency = new int[26];

        // Counting the frequency of each character in the input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the character at index i
            int idx = (int)(ch) - 97; // Calculate the index of the character in the frequency array
            frequency[idx]++; // Increment the frequency count
        }

        // Finding the maximum frequency of any character in the string
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > max) max = frequency[i]; // Update max if a higher frequency is found
        }

        // Printing the character(s) with maximum frequency
        System.out.print("The character(s) that occurred most number of times : ");
        for (int i = 0; i < frequency.length; i++) {
            char ch = (char)(i + 97); // Get the character corresponding to the index
            if (frequency[i] == max) System.out.print(ch + " "); // Print if frequency matches max
        }
    }
}
