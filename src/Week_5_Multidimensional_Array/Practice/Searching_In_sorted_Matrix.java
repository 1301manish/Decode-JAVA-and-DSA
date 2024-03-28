/*
Check if an element x exists in the given sorted matrix or not. Each row and column is sorted in itself. If it
does not exist, return -1, else return its row and column index.
 */
package Week_5_Multidimensional_Array.Practice;

import java.util.Scanner;

public class Searching_In_Sorted_Matrix {

    // Method to search for an element in a sorted matrix
    public static void searchMatrix(int[][] matrix, int item) {
        // Get the number of rows and columns in the matrix
        int n = matrix.length;
        int m = matrix[0].length;

        // Initialize pointers for traversal starting from the top-right corner
        int st = 0, end = m - 1;

        // Perform search until pointers remain within the matrix bounds
        while (st < n && end >= 0) {
            // If the current element is equal to the item, print its position and return
            if (matrix[st][end] == item) {
                System.out.println("Row = " + st);
                System.out.println("Column = " + end);
                return;
            }
            // If the current element is greater than the item, move left in the same row
            if (matrix[st][end] > item)
                end--;
                // If the current element is less than the item, move down to the next row
            else
                st++;
        }
        // If the element is not found after traversing the entire matrix, print a message
        System.out.println("Element not found in the matrix");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the dimensions of the 2D array
        System.out.print("Enter the number of rows of the 2D array: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns of the 2D array: ");
        int m = sc.nextInt();

        // Create a 2D array based on user-provided dimensions
        int[][] matrix = new int[n][m];

        // Prompt user to enter elements of the 2D array
        System.out.println("Enter " + (n * m) + " elements into the 2D array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Prompt user to enter the element to be searched
        System.out.println("Enter the element to be searched: ");
        int item = sc.nextInt();

        // Call the searchMatrix method to search for the element in the matrix
        searchMatrix(matrix, item);
    }
}
