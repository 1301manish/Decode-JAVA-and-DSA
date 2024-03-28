package Week_5_Multidimensional_Array.Practice;

import java.util.Scanner;
/*
Given a matrix ‘A’ of dimension n x m and 2 coordinates (l1, r1) and (l2, r2). Return the sum of the
rectangle from (l1,r1) to (l2, r2).
 */


public class Sum_Of_Rectangle_In_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows of the matrix: ");
        int r = sc.nextInt();

        System.out.print("Enter the columns of the matrix: ");
        int c = sc.nextInt();

        int[][] mat = new int[r][c];
        System.out.println("Enter "+(r*c)+" elements in the matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

// Input rectangle coordinates
        System.out.println("Enter the range of rows: ");
        int sRow = sc.nextInt();
        int eRow = sc.nextInt();
        System.out.println("Enter the range of columns: ");
        int sCol = sc.nextInt();
        int eCol = sc.nextInt();

        int sum = 0;
        // Calculate sum of the rectangle
        for (int i = sRow; i <= eRow; i++) {
            for (int j = sCol; j <= eCol; j++) {
                sum += mat[i][j];
            }
        }

        // Output the result
        System.out.println("Sum of elements between coordinates (" + sRow + "," + sCol + ") and (" + eRow + "," + eCol + ") is: " + sum);
    }
}
