package Week_10_Recursion.Practice_Recurssion;

import java.util.Scanner;

public class Convert_To_Integer {

    // Recursive function to convert a numeric string to an integer
    public static int toInteger(String str, int index) {
        // Base case: If we are at the first character of the string
        if (index == 0) {
            return str.charAt(0) - '0'; // Convert the first character to its numeric value
        }

        // Recursive call: Process the next character and construct the number
        return toInteger(str, index - 1) * 10 + (str.charAt(index) - '0');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the numeric string
        System.out.println("Enter a numeric string: ");
        String str = scanner.next();

        // Convert the string to an integer and print the result
        System.out.println("Converted integer: " + toInteger(str, str.length() - 1));
    }
}
