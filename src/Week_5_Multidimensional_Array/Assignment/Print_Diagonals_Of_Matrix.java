package Week_5_Multidimensional_Array.Assignment;

import java.util.Scanner;

public class Print_Diagonals_Of_Matrix {
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

        System.out.println("Output : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j || i+j == n-1){
                    System.out.print(mat[i][j] + " ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
