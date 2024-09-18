package Week_10_Recursion.Practice_Recurssion;

import java.util.*;
/*
Problem Count the number of substrings having same first and last characters
 */
public class Count_Same_Substring {

    // Recursive function to count the substrings with the same first and last characters
    public static int count(String s, int i, int j, int n) {
        // Base case 1: If the length of the substring is 1, it's valid since the first and last characters are the same
        if (n == 1)
            return 1;

        // Base case 2: If the length of the substring is less than or equal to 0, it's invalid, so return 0
        if (n <= 0)
            return 0;

        // Recursive calls:
        // 1. count(s, i + 1, j, n - 1): Exclude the first character (move start index forward)
        // 2. count(s, i, j - 1, n - 1): Exclude the last character (move end index backward)
        // 3. Subtract count(s, i + 1, j - 1, n - 2) to avoid counting the overlapping middle part twice
        int ans = count(s, i + 1, j, n - 1) +
                count(s, i, j - 1, n - 1) -
                count(s, i + 1, j - 1, n - 2);

        // If the first and last characters of the current substring are the same, increment the count
        if (s.charAt(i) == s.charAt(j))
            ans++;

        // Return the total count of valid substrings
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input string
        String s = sc.next();

        // Get the length of the input string
        int n = s.length();

        // Call the recursive function to count substrings and print the result
        System.out.println(count(s, 0, n - 1, n));
    }
}
