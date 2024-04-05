package Week_5_Multidimensional_Array.Practice;

import java.util.Scanner;

/*
. A square matrix is said to be an perfect Matrix if both of the following conditions hold:
a) All the elements in the diagonals of the matrix are non-zero integers.
b) All other elements except the diagonal elements are 0.
Given a 2D integer array grid of size n*n representing a square matrix, return true if the grid is a perfect matrix.
Otherwise, return false.
 */
public class Perfect_Matrix {
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

        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j || i+j==n-1){
                    if (mat[i][j]==0){
                        flag = false;
                    }
                }

                else{
                    if (mat[i][j]!=0){
                        flag = false;
                    }
                }
            }
        }
        if (flag) System.out.println("It is a perfect matrix");
        else System.out.println("It is not a perfect matrix");
    }
}
