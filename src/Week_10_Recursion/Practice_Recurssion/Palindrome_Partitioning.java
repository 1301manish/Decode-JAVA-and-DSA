package Week_10_Recursion.Practice_Recurssion;

import java.util.ArrayList;
import java.util.Scanner;
/*
You are given a string. Your task is to divide the string into palindromic substrings. Print all such
partitions.
 */
public class Palindrome_Partitioning {

    // Method to check if a given string is a palindrome
    public static boolean isPalindromeUsingLoop(String str) {
        int start = 0;  // Initialize start pointer
        int end = str.length() - 1;  // Initialize end pointer

        // Loop to check if the string is a palindrome by comparing characters
        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) return false;  // If characters don't match, it's not a palindrome
            start++;
            end--;
        }
        return true;  // Return true if the string is a palindrome
    }

    // Recursive method to generate all palindrome partitions
    public static void generatePalindrome(String str, int idx, ArrayList<String> ans) {
        // Base case: If we've reached the end of the string, print the current partition
        if (idx == str.length()) {
            System.out.println(ans);  // Print the partition list
            return;
        }

        String current = "";  // Initialize an empty string to store substrings
        // Loop through the string to create substrings starting from the current index
        for (int i = idx; i < str.length(); i++) {
            current += str.charAt(i);  // Add the current character to the substring

            // Check if the current substring is a palindrome
            if (isPalindromeUsingLoop(current)) {
                ans.add(current);  // If it's a palindrome, add it to the answer list
                generatePalindrome(str, i + 1, ans);  // Recursively call for the next index
                ans.remove(ans.size() - 1);  // Backtrack by removing the last added palindrome
            }
        }
    }

    public static void main(String[] args) {
        // Input the string for which we need to find palindrome partitions
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sc.next();  // Read the input string

        ArrayList<String> ans = new ArrayList<>();  // Initialize the list to store partitions
        generatePalindrome(str, 0, ans);  // Call the recursive method starting from index 0
    }
}
