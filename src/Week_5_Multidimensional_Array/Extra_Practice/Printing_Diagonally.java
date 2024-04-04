package Week_5_Multidimensional_Array.Extra_Practice;

import java.util.Scanner;

public class Printing_Diagonally {
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

        // Array to store elements printed diagonally
        int [] arr = new int[n*m];
        int idx = 0; // Index for the array
        int row = 0; // Row index
        int column = 0; // Column index

        // Loop until we traverse all columns
        while(column<m){
            int i = row;
            int j = column;

            // Traverse diagonally upwards
            while (i>=0 && j<m){
                arr[idx] = mat[i][j]; // Store diagonal elements in the array
                i--; // Move upwards
                j++; // Move rightwards
                idx++; // Increment index
            }
            row++; // Move to the next row

            // If we reach the last row, reset row to the last index and move to the next column
            if (row>=n){
                row=n-1;
                column++;
            }
        }

        // Print the elements diagonally
        System.out.println("Printing the elements diagonally : ");
        for (int i = 0; i <m*n ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
