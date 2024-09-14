package Week_10_Recursion.Practice_Recurssion;

import java.util.Scanner;

public class Count_Consonants {

    // Recursive function to count consonants in a string
    public static int countConsonants(String str, int index, int consonantCount) {
        // Base case: If we have reached the end of the string
        if (index == str.length()) {
            return consonantCount;
        }

        // Get the current character and convert to lowercase for easy comparison
        char currentChar = Character.toLowerCase(str.charAt(index));

        // Check if the character is a letter and is not a vowel (i.e., it's a consonant)
        if (Character.isLetter(currentChar) && !(currentChar == 'a' || currentChar == 'e' ||
                currentChar == 'i' || currentChar == 'o' ||
                currentChar == 'u')) {
            consonantCount += 1; // Increment the consonant count
        }

        // Recursive call to process the next character
        return countConsonants(str, index + 1, consonantCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the string
        System.out.println("Enter the string: ");
        String inputString = scanner.nextLine();

        // Count and print the number of consonants in the string
        System.out.println("Number of consonants in the string: " + countConsonants(inputString, 0, 0));
    }
}
