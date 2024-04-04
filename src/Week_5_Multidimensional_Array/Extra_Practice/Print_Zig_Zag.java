package Week_5_Multidimensional_Array.Extra_Practice;

import java.util.Scanner;

public class Print_Zig_Zag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter the number of rows of the matrix: ");
        int n = sc.nextInt(); // Number of rows
        System.out.print("Enter the number of columns of the matrix: ");
        int m = sc.nextInt(); // Number of columns

        int[][] mat = new int[n][m]; // Matrix to store input elements

        // Input matrix elements
        System.out.println("Enter " + (n * m) + " elements in the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt(); // Store input elements in the matrix
            }
        }

        // Array to store elements printed in zig-zag order
        int idx = 0; // Index for the array
        int row = 0; // Current row index
        int col = 0; // Current column index
        int [] arr = new int[m * n]; // Array to store elements

        // Loop until we traverse all elements in zig-zag order
        while (idx < m * n) {
            // If the sum of current row and column indices is even, move diagonally up-right
            if ((row + col) % 2 == 0) {
                while (row >= 0 && col < m) {
                    arr[idx++] = mat[row][col]; // Store the element
                    row--; // Move upwards
                    col++; // Move rightwards
                }
                // Adjust indices when out of bounds
                if (col == m) {
                    col = m - 1; // Move to the last column
                    row += 2; // Move down by two rows
                } else if (row < 0) {
                    row = 0; // Move to the first row
                }
            }
            // If the sum of current row and column indices is odd, move diagonally down-left
            else {
                while (row < n && col >= 0) {
                    arr[idx++] = mat[row][col]; // Store the element
                    row++; // Move downwards
                    col--; // Move leftwards
                }
                // Adjust indices when out of bounds
                if (row == n) {
                    row = n - 1; // Move to the last row
                    col += 2; // Move to the next column
                } else if (col < 0) {
                    col = 0; // Move to the first column
                }
            }
        }

        // Print the elements in zig-zag order
        System.out.println("Printing zig-zag : ");
        for (int i = 0; i < m * n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
