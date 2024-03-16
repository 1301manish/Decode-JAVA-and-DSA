/*
 * A class to demonstrate sorting a String and a StringBuilder.
 */
import java.util.*;
public class SortingStringAndStringBuilder {

    public static void main(String[] args) {
        // Sorting a String
        String s = "raghav";
        System.out.println("Original string : " + s);

        // Convert the String to a character array
        char[] ch = s.toCharArray();

        // Sort the character array
        Arrays.sort(ch);

        // Convert the sorted character array back to a String
        s = new String(ch);

        // Print the sorted String
        System.out.println("Sorted String : " + s);

        // Sorting a StringBuilder
        StringBuilder sb = new StringBuilder("garg");
        System.out.println("Original String Builder : " + sb);

        // Convert the StringBuilder to a String, then convert the String to a character array
        char[] ch1 = sb.toString().toCharArray();

        // Sort the character array
        Arrays.sort(ch1);

        // Convert the sorted character array back to a StringBuilder
        sb = new StringBuilder(String.valueOf(ch1));

        // Print the sorted StringBuilder
        System.out.println("Sorted String Builder : " + sb);
    }
}
