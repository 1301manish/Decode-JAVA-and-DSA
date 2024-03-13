import java.util.Scanner;

public class Rotate_Matrix_By_90_Degree_Anti_clockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int m = sc.nextInt(); // Number of rows
        System.out.println("Enter the number of columns : ");
        int n = sc.nextInt(); // Number of columns

        int [][] arr = new int[m][n]; // Initializing the matrix

        System.out.println("Enter the elements of the array : ");
        // Input matrix elements
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Transpose of matrix
        for (int i = 0; i < m; i++) { // Columns
            for (int j = 0; j < m; j++) { // Rows
                if(i < j){
                    // Swap elements across diagonal
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }

        // Reversing each column of the matrix
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < m/2; i++) {
                // Swap elements symmetrically across the middle row
                int temp = arr[i][j];
                arr[i][j] = arr[m-i-1][j];
                arr[m-i-1][j] = temp;
            }
        }

        System.out.println("90 Degree Anti Clockwise Rotated Matrix : ");
        // Printing the rotated matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
