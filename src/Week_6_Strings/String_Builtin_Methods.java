package Week_6_Strings;

public class String_Builtin_Methods {
    public static void main(String[] args) {
        // Initializing a string
        String s = "Pawan Kumar Singh";

        // Printing the character at index 2 in the string
        System.out.println("Character at index 2: " + s.charAt(2));

        // Printing the character at index 7 in the string
        System.out.println("Character at index 7: " + s.charAt(7));

        // Note: Uncommenting the line below would result in an exception
        // as the index 15 is beyond the length of the string
        // System.out.println(s.charAt(15));

        // Getting the length of the string
        int n = s.length();
        System.out.println("Length of the string: " + n);
    }
}
