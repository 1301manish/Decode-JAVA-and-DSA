package Week_5_Multidimensional_Array;

import java.util.Scanner;

/*
Algorithm:
Step 1:
    i : minR
    j : minC -> maxC
    minR++
Step 2:
    j : maxC
    i : minR -> maxR
    j : maxC--
Step 3:
    i : maxR
    j : maxC -> minC
    maxR--
Step 4:
    j : minC
    i : maxR -> minR
    minC++
*/
public class SpiralMatrix {
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
        int minR = 0;
        int maxR = m-1;
        int minC = 0;
        int maxC = n-1;
        while(minR<=maxR && minC<=maxC) {
            //Left -->> Right
            for (int j = minC; j <= maxC; j++) {
                System.out.print(arr[minR][j] + " ");
            }
            minR++;

            if (minR>maxR || minC>maxC) break;
            //Top -->> Bottom
            for (int i = minR; i <= maxR; i++) {
                System.out.print(arr[i][maxC] + " ");
            }
            maxC--;

            if (minR>maxR || minC>maxC) break;
            //Right -->> Left
            for (int j = maxC; j >= minC; j--) {
                System.out.print(arr[maxR][j] + " ");
            }
            maxR--;

            if (minR>maxR || minC>maxC) break;
            //Bottom -->> Top
            for (int i = maxR; i >= minR; i--) {
                System.out.print(arr[i][minC] + " ");
            }
            minC++;
        }
    }
}
