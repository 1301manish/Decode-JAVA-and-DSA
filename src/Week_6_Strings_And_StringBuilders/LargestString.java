package Week_6_Strings_And_StringBuilders;

public class LargestString {

    // Method to compare two strings and return the larger one
    public static String max(String a, String b) {
        // Removing leading zeros from both strings
        String s = purify(a);
        String t = purify(b);

        // Comparing lengths of strings
        if (s.length() > t.length())
            return a; // Return first string if it has more digits
        if (s.length() < t.length())
            return b; // Return second string if it has more digits

        // If both strings have equal lengths, compare character by character
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                if (s.charAt(i) > t.charAt(i))
                    return a; // Return first string if its current character is greater
                else
                    return b; // Return second string if its current character is greater
            }
        }
        // If both strings are exactly the same, return either one
        if (a.length() >= b.length())
            return a;
        else
            return b;
    }

    // Method to remove leading zeros from a string
    public static String purify(String s) {
        // Loop through the string until a non-zero digit is found
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0')
                return s.substring(i); // Return substring from the first non-zero digit
        }
        // If all characters are zeros, return the original string
        return s;
    }

    public static void main(String[] args) {

        // Array of strings to find the largest
        String[] arr = {"71536", "438778787999804085", "00577", "8745", "68423"};
        String maxS = arr[0];

        // Iterate through the array to find the largest string
        for (int i = 0; i < arr.length; i++) {
            maxS = max(maxS, arr[i]);
        }

        // Print the largest string
        System.out.println(maxS);


        //       Method 1: This method uses Integer.parseInt() to convert strings to integers and find the maximum value.
//                   However, it fails when an integer is out of the bounds of the int value, leading to NumberFormatException.

//        String [] arr = {"71536","4385","00577","8745","68423"};
//        int max = Integer.parseInt(arr[0]);
//
//        for (int i = 0; i < arr.length ; i++) {
//            int n = Integer.parseInt(arr[i]);
//            max = Math.max(max,n);
//        }
//
//        System.out.println(max);
    }
}
