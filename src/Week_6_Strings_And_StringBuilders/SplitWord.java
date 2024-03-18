package Week_6_Strings_And_StringBuilders;

import java.util.Scanner;

public class SplitWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        // Split the input string into an array of words based on whitespace characters
        String[] strArray = str.split("\\s+");

        // Print each word in a new line
        for (String element : strArray) {
            System.out.println(element);
        }
    }
}
