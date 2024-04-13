/*
Given a matrix having 0-1 only where each row is sorted in increasing order, find the row with the
maximum number of 1’s.
 */
package Week_9_Binary_Search.Assignment;

import java.util.Scanner;

public class Maximum_Number_Of_One_In_Row {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows : ");
        int r = sc.nextInt(); // Read the number of rows

        // Prompt the user to enter the number of columns
        System.out.print("Enter the number of columns : ");
        int c = sc.nextInt(); // Read the number of columns

        // Initialize a 2D array to store the matrix elements
        int [][] mat = new int[r][c];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt(); // Read the matrix elements
            }
        }

        // Initialize variables to keep track of the row with maximum 1s and the count of 1s
        int max = 0; // Maximum count of 1s
        int idx = -1; // Index of the row with maximum 1s
        int count = 0; // Count of 1s in the current row

        // Iterate over each row of the matrix
        for (int i = 0; i < r; i++) {
            int low = 0, high = mat[0].length - 1; // Initialize binary search boundaries
            int firstPos = -1; // Variable to store the index of the leftmost 1 in the row

            // Perform binary search to find the leftmost 1 in the current row
            while (low <= high) {
                int mid = low + (high - low) / 2; // Calculate the middle index
                if (mat[i][mid] == 1) {
                    firstPos = mid; // Update the index of the leftmost 1
                    high = mid - 1; // Move to the left half of the array
                } else {
                    low = mid + 1; // Move to the right half of the array
                }
            }

            // Calculate the count of 1s in the current row based on the index of the leftmost 1
            if (firstPos == -1)
                count = 0; // If no 1 is found, set count to 0
            else
                count = (c - 1) - (firstPos + 1); // Calculate the count of 1s

            // Update max and idx if the current row has more 1s than the previous maximum
            if (max <= count) {
                idx = i; // Update the index of the row with maximum 1s
                max = count; // Update the maximum count of 1s
            }
        }

        // Print the index of the row with maximum number of ones
        System.out.println(idx + " row contains maximum number of ones");
    }
}
