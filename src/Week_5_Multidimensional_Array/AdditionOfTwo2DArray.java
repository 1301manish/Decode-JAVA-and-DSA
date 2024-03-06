package Week_5_Multidimensional_Array;

import java.util.Scanner;

public class AdditionOfTwo2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows in first matrix : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns in first matrix : ");
        int n = sc.nextInt();

        System.out.print("Enter the number of rows in second matrix : ");
        int x = sc.nextInt();
        System.out.print("Enter the number of columns in second matrix : ");
        int y = sc.nextInt();

        int [][] arr = new int[m][n];
        int [][] brr = new int[x][y];
        int [][] result = new int[x][y];
        // Matrix 1
        System.out.println("Enter the elements of first the array : ");
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //Matrix 2
        System.out.println("Enter the elements of second the array : ");
        for (int i = 0; i <x; i++) {
            for (int j = 0; j <y; j++) {
                brr[i][j] = sc.nextInt();
            }
        }

        if (m==x && n==y){
            for (int i = 0; i <m; i++) {
                for (int j = 0; j <n; j++) {
                    result[i][j] = arr[i][j] + brr[i][j];
                }
            }

            System.out.println("The result array is : ");
            for (int i = 0; i <x; i++) {
                for (int j = 0; j <y; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
        else System.out.println("Addition not possible");
    }
}
