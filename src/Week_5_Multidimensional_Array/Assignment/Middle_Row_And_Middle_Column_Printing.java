package Week_5_Multidimensional_Array.Assignment;

import java.util.Scanner;
/*
Write a function which accepts a 2D array of integers and its size as arguments and displays the
elements of middle row and the elements of middle column.
[Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 etc...]
 */
public class Middle_Row_And_Middle_Column_Printing {

    public static void display(int [][] mat, int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n/2 || j == n/2){
                    System.out.print(mat[i][j] + " ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows and column of the matrix: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        System.out.println("Enter "+(n*n)+" elements in the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        display(mat, n);
    }
}
