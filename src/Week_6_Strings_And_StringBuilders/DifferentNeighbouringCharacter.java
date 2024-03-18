package Week_6_Strings_And_StringBuilders;

import java.util.Scanner;

public class DifferentNeighbouringCharacter {
    public static void main(String[] args) {
        // Initialize Scanner to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a String: ");

        // Read the input string
        String str = sc.nextLine();

        // Initialize a variable to count the number of different neighboring characters
        int count = 0;

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // If the length of the string is 1, no further processing is required, so break the loop
            if (str.length() == 1)
                break;

                // If the length of the string is 2, and the two characters are different, increment count and break the loop
            else if (str.length() == 2 && str.charAt(i) != str.charAt(i + 1)) {
                count++;
                break;
            }

            // If we are at the beginning of the string
            else if (i == 0) {
                // If the current character is different from the next character, increment count
                if (str.charAt(i) != str.charAt(i + 1))
                    count++;
            }

            // If we are at the end of the string
            else if (i == str.length() - 1) {
                // If the current character is different from the previous character, increment count
                if (str.charAt(i) != str.charAt(i - 1))
                    count++;
            }

            // For characters in the middle of the string
            else {
                // If the current character is different from both the next and previous characters, increment count
                if (str.charAt(i) != str.charAt(i + 1) && str.charAt(i) != str.charAt(i - 1))
                    count++;
            }
        }

        // Print the count of different neighboring characters
        System.out.println(count);
    }
}
