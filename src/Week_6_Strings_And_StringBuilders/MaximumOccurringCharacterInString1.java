package Week_6_Strings_And_StringBuilders;

import java.util.Scanner;

public class MaximumOccurringCharacterInString1 {
    public static void main(String[] args) {
        // Initialize Scanner to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter the word : ");

        // Read the input word
        String str = sc.nextLine();

        // Initialize a variable to store the maximum occurrence count
        int max = 0;

        // Iterate through each character in the word to find the maximum occurrence count
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == ch) count++;
            }
            if (count > max) max = count;
        }

        // Iterate through each character in the word again to print characters with maximum occurrence count
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == ch) count++;
            }
            if (count == max) System.out.println(ch + " : " + max);
        }
    }
}
