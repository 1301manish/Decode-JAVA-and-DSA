package Week_10_Recursion.Practice_Recurssion;

import java.util.Scanner;
/*
Given a set of characters and a positive integer k, print all possible strings of length k that
can be formed from the given set.
 */
public class Special_Pattern_2 {

    // Recursive function to generate all possible combinations of characters from the given set
    public static void stringFromSet(int n, Character[] ch, String ans, int k) {
        // Base case: when the length of the string reaches the desired size, print the result
        if (k == 0) {
            System.out.println(ans);
            return;
        }

        // Loop through each character in the set and recursively build the string
        for (int i = 0; i < n; i++) {
            stringFromSet(n, ch, ans + ch[i], k - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of elements in the set
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();

        // Input: length of the pattern to be generated
        System.out.println("Enter the value of k : ");
        int k = sc.nextInt();

        // Initialize a character array of size n to store the elements of the set
        Character[] ch = new Character[n];

        // Input: elements of the character set
        System.out.println("Enter the elements of the set : ");
        for (int i = 0; i < n; i++) {
            ch[i] = sc.next().charAt(0);
        }

        // Generate and print all possible combinations of characters from the set of size k
        stringFromSet(n, ch, "", k);
    }
}
