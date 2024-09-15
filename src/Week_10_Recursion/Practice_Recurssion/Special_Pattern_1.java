package Week_10_Recursion.Practice_Recurssion;

import java.util.Scanner;
/*
A string is called special if it consists of only stars(‘*’) and dashes(‘-’), and the number of
stars is more than the number of dashes for any prefix of the string. Given a positive integer n,
print all the special strings of size n.
 */
public class Special_Pattern_1 {

    // Recursive function to generate the pattern
    public static void printPattern(int n, int sCount, int dCount, String ans) {
        // Base case: if no more characters are needed, print the current pattern and return
        if (n == 0) {
            System.out.println(ans);
            return;
        }

        // Add '*' to the pattern and recursively call for the remaining (n-1)
        printPattern(n - 1, sCount + 1, dCount, ans + '*');

        // Only add '-' if the count of '*' is greater than the count of '-'
        if (sCount > dCount) {
            printPattern(n - 1, sCount, dCount + 1, ans + '-');
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the size of the pattern
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();

        // Initial call to the recursive function with counts set to 0 and an empty result string
        printPattern(n, 0, 0, "");
    }
}
