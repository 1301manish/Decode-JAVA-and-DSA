package Week_10_Recursion.Practice_Recurssion;

import java.util.Scanner;

/*
Find the m-th summation of the first n natural numbers where the m-th summation of the first n natural
numbers is defined as follows:
 If m > 1: SUM(n, m) = SUM(SUM(n, m - 1), 1)
 Else: SUM(n, 1) = Sum of the first n natural numbers.
 */
public class MthSummation {

    // Function to find the sum of the first num natural numbers using recursion
    public static int sumOfFirstNNumbers(int num) {
        if (num == 0) {
            return 0; // Base case: sum of the first 0 natural numbers is 0
        }
        return num + sumOfFirstNNumbers(num - 1); // Recursive case: num + sum of the first (num-1) natural numbers
    }

    // Function to find the m-th summation of the first n natural numbers using recursion
    public static int mthSummation(int n, int m) {
        if (m == 1) {
            return sumOfFirstNNumbers(n); // Base case: when m is 1, return the sum of the first n natural numbers
        }
        int previousSummation = mthSummation(n, m - 1); // Recursive case: find the (m-1)-th summation first
        return mthSummation(previousSummation, 1); // Find the sum of the previous summation
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Input for m
        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();

        // Calculate the m-th summation of the first n natural numbers
        int result = mthSummation(n, m);

        // Output the result
        System.out.println("The " + m + "-th summation of the first " + n + " natural numbers is: " + result);
    }
}
