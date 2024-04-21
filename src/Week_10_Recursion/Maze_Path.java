package Week_10_Recursion;

import java.util.Scanner;

public class Maze_Path {

    public static int Maze_Path1(int row, int col, int m, int n){
        if (row==m || col==n) return 1;
//        if (row==m && col==n) return 1;
//        if (row>m || col>n) return 0;
        int rightPath = Maze_Path1(row,col+1,m,n);
        int leftPath = Maze_Path1(row+1,col,m,n);
        return leftPath+rightPath;
    }


    public static int Maze_Path2(int m, int n){
        if (m==1 || n==1) return 1;
        int rightPath = Maze_Path2(m,n-1);
        int leftPath = Maze_Path2(m-1,n);
        return leftPath+rightPath;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int n = sc.nextInt();

        System.out.println("Number of ways to reach the destination using Maze_Path1 is : "+ Maze_Path1(1,1,m,n));
        System.out.println("Number of ways to reach the destination using Maze_Path1 is : "+ Maze_Path2(m,n));
    }
}
