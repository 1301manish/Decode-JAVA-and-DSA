package Week_10_Recursion.Practice_Recurssion;

import java.util.Scanner;
/*
A string is called beautiful if is an even length string consisting of only stars(‘*’) and dashes(‘-’). Further
the number of stars in the first half of the string should be equal to the number of stars in the second half of
the string. Given a number n, print all the beautiful strings of length 2 * n.
 */
public class Beautiful_Strings_1 {

    // Helper function to recursively generate beautiful strings
    public static void generateBeautifulStrings(int n, String current, int firstHalfStars, int secondHalfStars, int index) {
        // Base case: when the string length reaches 2 * n
        if (current.length() == 2 * n) {
            if (firstHalfStars == secondHalfStars) {
                System.out.println(current);
            }
            return;
        }

        // First half (index < n)
        if (index < n) {
            // Add a star to the first half
            generateBeautifulStrings(n, current + "*", firstHalfStars + 1, secondHalfStars, index + 1);

            // Add a dash to the first half
            generateBeautifulStrings(n, current + "-", firstHalfStars, secondHalfStars, index + 1);
        }
        // Second half (index >= n)
        else {
            // Add a star to the second half if it balances the first half
            if (secondHalfStars < firstHalfStars) {
                generateBeautifulStrings(n, current + "*", firstHalfStars, secondHalfStars + 1, index + 1);
            }

            // Add a dash to the second half
            generateBeautifulStrings(n, current + "-", firstHalfStars, secondHalfStars, index + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Start the recursive generation with an empty string
        generateBeautifulStrings(n, "", 0, 0, 0);

        sc.close();
    }
}