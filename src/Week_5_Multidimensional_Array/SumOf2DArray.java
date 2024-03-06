package Week_5_Multidimensional_Array;

import java.util.Scanner;

public class SumOf2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int n = sc.nextInt();

        int [][] arr = new int[m][n];
        int sum = 0;
        int product = 1;

        //Input
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                sum += arr[i][j];
                product *= arr[i][j];
            }
        }
        //Output
        System.out.print("The sum of the element in the array is : " + sum);
        System.out.print("\nThe product of the element in the array is : " + product);
    }
}
