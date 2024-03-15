package Week_6_Strings_And_StringBuilders;

import java.util.Scanner;

public class ToggleCharacter {
    public static void main(String[] args) {
        // Creating a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter a string
        System.out.print("Enter the string : ");

        // Reading the input string and storing it in a StringBuilder
        StringBuilder s = new StringBuilder(sc.nextLine());

        // Getting the length of the input string
        int n = s.length();

        // Looping through each character of the string
        for (int i = 0; i < n; i++) {
            // Getting the current character
            char ch = s.charAt(i);

            // Converting the character to its ASCII value
            int ascii = (int) ch;

            // Toggling uppercase characters to lowercase
            if (ascii >= 65 && ascii <= 90) {
                ascii += 32;
                ch = (char) ascii;
                s.setCharAt(i, ch);
            }
            // Toggling lowercase characters to uppercase
            else if (ascii >= 97 && ascii <= 122) {
                ascii -= 32;
                ch = (char) ascii;
                s.setCharAt(i, ch);
            }
        }

        // Printing the modified string after toggling characters
        System.out.print("New string after toggle : " + s);
    }
}
