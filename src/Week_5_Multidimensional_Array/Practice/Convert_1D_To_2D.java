package Week_5_Multidimensional_Array.Practice;

import java.util.*;

public class Convert_1D_To_2D {

    public static void main(String[] args) {
        // Creating a Scanner object to read user input
        Scanner scn = new Scanner(System.in);

        // Asking user for the dimensions of the 2D array
        System.out.println("Enter the dimensions of 2D array you want to convert to: ");
        int n = scn.nextInt(); // Number of rows
        int m = scn.nextInt(); // Number of columns

        // Creating a 1D array to store input elements
        int[] arr = new int[m * n];

        // Creating a 2D array to store elements of 1D array
        int[][] mat = new int[n][m];

        // Asking user to enter the elements of the 1D array
        System.out.println("Enter the elements of 1D array: ");
        for (int i = 0; i < m * n; i++) {
            arr[i] = scn.nextInt();
        }

        // Sorting the 1D array
        Arrays.sort(arr);

        // Converting the sorted 1D array to a 2D array
        int index = 0;
        for (int i = 0; i < n; i++) { // Looping through rows
            for (int j = 0; j < m; j++) { // Looping through columns
                mat[i][j] = arr[index++]; // Assigning element from sorted 1D array to 2D array
            }
        }

        // Displaying the resulting 2D array
        System.out.println("The resulting 2D array:");
        for (int i = 0; i < n; i++) { // Looping through rows
            for (int j = 0; j < m; j++) { // Looping through columns
                System.out.print(mat[i][j] + " "); // Printing each element
            }
            System.out.println(); // Moving to the next line for the next row
        }
    }
}
