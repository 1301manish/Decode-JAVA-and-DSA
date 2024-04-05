package Week_5_Multidimensional_Array.Practice;

import java.util.Scanner;

public class Prefix_Sum_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter the number of rows of the matrix: ");
        int r = sc.nextInt(); // Number of rows
        System.out.print("Enter the number of columns of the matrix: ");
        int c = sc.nextInt(); // Number of columns

        int[][] mat = new int[r][c]; // Matrix to store input elements

        // Input matrix elements
        System.out.println("Enter " + (r * c) + " elements in the matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt(); // Store input elements in the matrix
            }
        }
        //Row wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                mat[i][j] = mat[i][j-1]+mat[i][j];
            }
        }
        //Column wise prefix sum
        for (int i = 1; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = mat[i-1][j]+mat[i][j];
            }
        }
        //Printing the matrix
        System.out.println("Output Matrix : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
