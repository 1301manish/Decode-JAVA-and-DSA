package Week_5_Multidimensional_Array.Practice;

import java.util.Scanner;

public class Print_Upper_Matrix {

    // Method to print the upper triangular matrix
    public static void upper(int [][] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Print the element if it is in the upper triangular part of the matrix
                if (j >= i) {
                    System.out.print(arr[i][j]+" ");
                } else {
                    // Print empty spaces for elements not in the upper triangular part
                    System.out.print("  ");
                }
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter the number of rows and column of the matrix: ");
        int n = sc.nextInt(); // Number of rows

        int[][] mat = new int[n][n]; // Matrix to store input elements

        // Input matrix elements
        System.out.println("Enter " + (n * n) + " elements in the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt(); // Store input elements in the matrix
            }
        }

        // Call the method to print the upper triangular matrix
        upper(mat);
    }
}
