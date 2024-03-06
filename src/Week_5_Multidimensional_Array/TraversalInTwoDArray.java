package Week_5_Multidimensional_Array;

import java.util.Scanner;

public class TraversalInTwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int n = sc.nextInt();

        int [][] grid = new int[m][n];

        int res1 = grid.length; // This gives the number of rows . This is because in memory it is not stored as grid
                                // In memory 2D array is stored as array of arrays. Therefore , it gives length of the array
                                // that contains multiple array.

        int res2 = grid[0].length; // This gives number of columns, because 2D array is a array of arrays.
                                   // It gives the length of the First array inside the array. And we know that in 2D array
                                   // all arrays are of same size.
        System.out.println(res1);
        System.out.println(res2);
        //Input in 2D array
        System.out.println("Enter the elements : ");
        for (int i = 0; i < grid.length; i++) { //rows
            for (int j = 0; j < grid[i].length; j++) { //cols
                grid[i][j] = sc.nextInt();
            }
        }
        // Output in 2D array
        for (int i = 0; i < m; i++) { //rows
            for (int j = 0; j < n; j++) { //cols
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        // For each loop
         for(int[] i : grid){
//           System.out.println(i);    --> It will give the garbage value
             for ( int j :  i){
                 System.out.print(j + " ");
             }
             System.out.println();
         }

    }
}
