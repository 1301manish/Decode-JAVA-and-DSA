package Week_5_Multidimensional_Array;

import java.util.Scanner;

public class MatrixMultiplication {

    public static void print(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows 1st Matrix : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns 1st Matrix : ");
        int n = sc.nextInt();

        int [][] arr = new int[m][n];

        System.out.println("Enter the elements of the 1st array : ");
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the number of rows of 2nd Matrix : ");
        int p = sc.nextInt();
        System.out.print("Enter the number of columns 2nd Matrix : ");
        int q = sc.nextInt();

        int [][] brr = new int[p][q];

        System.out.println("Enter the elements of the 2nd array : ");
        for (int i = 0; i < p ; i++) {
            for (int j = 0; j < q ; j++) {
                brr[i][j] = sc.nextInt();
            }
        }

        if (n!=p){
            System.out.println("Matrix cannot be multiplied");
        }

        else {
            int [][] crr = new int [m][q];
            for (int i = 0; i < m; i++) {  // Traversing row of crr
                for (int j = 0; j < q; j++) { // Traversing column of crr
                    //crr[i][j] = arr[i][0]*brr[0][j] + arr[i][1]*brr[1][j] + arr[i][2]*brr[2][j] + .....

                    for (int k = 0; k < n; k++) { // Traversing for the multiplication of row of 1st Matrix and column of 2nd Matrix
                        crr[i][j] += arr[i][k]*brr[k][j];
                    }
                }
            }

            print(arr);
            print(brr);
            print(crr);

        }
    }
}
