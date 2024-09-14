package Week_10_Recursion.Practice_Recurssion;

import java.util.Scanner;
/*
Count all the possible paths on an m x n grid from top left (grid[0][0])
to bottom right (grid[m-1][n-1]) having constraints that from each cell
you can either move only to right or down
 */
public class Grid_Path {

    public static int Grid_Path(int row, int col, int m, int n){
        if (row==m-1 && col==n-1) return 1;
        if (row>=m || col>=n) return 0;
        int rightPath = Grid_Path(row,col+1,m,n);
        int downPath = Grid_Path(row+1,col,m,n);
        return downPath+rightPath;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int n = sc.nextInt();

        System.out.println("Number of ways to reach the destination using Grid_Path1 is : "+ Grid_Path(0,0,m,n));
    }
}
