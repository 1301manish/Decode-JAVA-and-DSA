package Week_10_Recursion.Practice_Recurssion;

import java.util.Scanner;
/*
A string is called beautiful if it consists of only stars(‘*’) and dashes(‘-’). Further the number of stars in
the first half of the string should be equal to the number of stars in the second half of the string. Given a
number n, print all the beautiful strings of length n. If the value of n is odd, the middle value can be either

'*' or '-'
 */
public class Beautiful_Strings_2 {

    // Helper function to recursively generate beautiful strings
    public static void generateBeautifulStrings(int n, String current, int firstHalfStars, int secondHalfStars, int index) {
        // Base case: when the string length reaches n
        if (current.length() == n) {
            if (firstHalfStars == secondHalfStars) {
                System.out.println(current);
            }
            return;
        }

        // First half (index < n/2)
        if (index < n / 2) {
            // Add a star to the first half
            generateBeautifulStrings(n, current + "*", firstHalfStars + 1, secondHalfStars, index + 1);

            // Add a dash to the first half
            generateBeautifulStrings(n, current + "-", firstHalfStars, secondHalfStars, index + 1);
        }
        // Middle character for odd n
        else if (n % 2 == 1 && index == n / 2) {
            // Middle character can be either star or dash
            generateBeautifulStrings(n, current + "*", firstHalfStars, secondHalfStars, index + 1);
            generateBeautifulStrings(n, current + "-", firstHalfStars, secondHalfStars, index + 1);
        }
        // Second half (index > n/2 or index > (n/2) for odd n)
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