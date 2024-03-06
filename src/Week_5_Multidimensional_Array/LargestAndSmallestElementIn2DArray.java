package Week_5_Multidimensional_Array;

import java.util.Scanner;

public class LargestAndSmallestElementIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int n = sc.nextInt();

        int [][] arr = new int[m][n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        //Input
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
               arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                //Max
                max = Math.max(max,arr[i][j]);
                //Min
                min = Math.min(min,arr[i][j]);
            }
        }
        //Output
        System.out.print("The maximum element in the array is : " + max);
        System.out.print("\nThe minimum element in the array is : " + min);
    }
}
