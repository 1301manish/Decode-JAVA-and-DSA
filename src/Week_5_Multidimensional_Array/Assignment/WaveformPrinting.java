package Week_5_Multidimensional_Array.Assignment;

import java.util.Scanner;

public class WaveformPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int n = sc.nextInt();

        int [][] arr = new int[m][n];

        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //Output
        System.out.println("Output :");

        System.out.println("\nPrinting in \"N\" formation : ");

        for (int j = 0; j < n; j++) { // Columns
            for (int i = 0; i < m; i++) { //Rows
                if (j%2 == 1){
                    System.out.print(arr[i][j] + " ");
                }
                else {
                    System.out.print(arr[m-i-1][j] + " ");
                }
            }
        }
    }
}
