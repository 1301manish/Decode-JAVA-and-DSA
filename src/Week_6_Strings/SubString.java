package Week_6_Strings;

/*
 * This program demonstrates the usage of substring() method in Java strings.
 * substring() method is used to extract a part of a string.
 */

public class SubString {
    public static void main(String[] args) {
        String str = ""; // Initialize an empty string
        System.out.println(str.length());   // Output: 0, prints the length of the empty string

        String str1 = "abcde"; // Initialize a string
        System.out.println(str1.substring(2));   // Output: cde, prints the substring starting from index 2 (inclusive) to the end
        System.out.println(str1.substring(2, 4));   // Output: cd, prints the substring starting from index 2 (inclusive) to index 4 (exclusive)
        System.out.println(str1.substring(2, 2));   // Output: Nothing, since the start and end indices are the same, it returns an empty string
        System.out.println(str1.substring(2, 5));   // Output: cde, prints the substring starting from index 2 (inclusive) to index 5 (exclusive)
//      System.out.println(str1.substring(2,6));   // This line gives an error since index 6 is out of bounds.
//      System.out.println(str1.substring(-1)); -->> Throws error
    }
}
