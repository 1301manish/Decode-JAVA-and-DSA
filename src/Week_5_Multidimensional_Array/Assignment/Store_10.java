package Week_5_Multidimensional_Array.Assignment;

public class Store_10 {
    public static void main(String[] args) {
        int[][] grid = new int[5][5];

        // Storing 10 at each index
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = 10;
            }
        }

        // Printing the matrix
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}
