package Week_6_Strings;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter a sentence
        System.out.print("Enter the sentence : ");
        String str = sc.nextLine();

        // Initializing a counter for vowels
        int count = 0;

        // Iterating through each character in the input string
        for (int i = 0; i < str.length(); i++) {
            // Checking if the current character is a vowel (both lowercase and uppercase)
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'
                    || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                // Incrementing the vowel count
                count++;
            }
        }

        // Printing the total number of vowels in the input sentence
        System.out.println("Number of vowels are : " + count);
    }
}
