package Week_5_Multidimensional_Array;

import java.util.Scanner;

public class RotateMatrixBy90Degree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int n = sc.nextInt();

        int [][] arr = new int[m][n];

        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //Transpose of matrix
        for (int i = 0; i < m; i++) { // Columns
            for (int j = 0; j < m; j++) { //Rows
                if(i<j){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }

        /*
        In this way also we can swap

        int a = 0,b = m-1;
        while(a<b) {
           // swap arr[i][a) and arr[i][b]
           int temp = arr[i] [al;
           arr [i] (a) = arr[i] (b] ;
           arr [1] [b] = temp;
           a++;
           b--;
         }
         */
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m/2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-j-1];
                arr[i][n-j-1] = temp;
            }
        }

        System.out.println("Rotated Matrix : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
