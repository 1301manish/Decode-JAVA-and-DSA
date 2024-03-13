package Week_5_Multidimensional_Array.Assignment;

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

        System.out.print("Enter first coordinate: ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();

        System.out.print("Enter second coordinate: ");
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += mat[i][j];
            }
        }

        System.out.println("Sum of element between coordinate ("+l1+" ,"+r1+") and ("+l2+" ,"+r2+") is: "+sum);
    }
}
