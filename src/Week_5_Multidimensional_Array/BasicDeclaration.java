package Week_5_Multidimensional_Array;

public class BasicDeclaration {
    public static void main(String[] args) {
        int [][] grid = new int[3][3]; //Declared
        // 10 20 30
        // 40 50 60
        // 70 80 90
        int [][] grid1 = {{1,2,3},{4,5,6},{7,8,9}}; // Declared and Initialised
        // 1 2 3
        // 4 5 6
        // 7 8 9
        grid[0][0] = 10;
        grid[0][1] = 20;
        grid[0][2] = 30;
        grid[1][0] = 40;
        grid[1][1] = 50;
        grid[1][2] = 60;
        grid[2][0] = 70;
        grid[2][1] = 80;
        System.out.println(grid[2][2]); // It will return 0 because we have initialised it
    }
}
