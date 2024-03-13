package Week_5_Multidimensional_Array.Assignment;
/*
Write a program to print the row number having the maximum sum in a given matrix.
 */
import java.util.Scanner;

public class Row_Of_Maximum_Sum {
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

        int maxSum = 0;
        int idx = 0;
        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) {
                sum+=mat[i][j];
            }
            if(maxSum<sum){
                maxSum=sum;
                idx = i;
            }
        }
        System.out.println("The row " + idx + " has maximum sum " + maxSum);
    }
}
