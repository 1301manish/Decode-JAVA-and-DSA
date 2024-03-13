package Week_5_Multidimensional_Array.Assignment;

import java.util.Scanner;

public class Generate_Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int [][] arr = new int[n][n];

        int minR = 0;
        int maxR = n-1;
        int minC = 0;
        int maxC = n-1;
        int k = 1;
        while(minR<=maxR && minC<=maxC) {
            //Left -->> Right
            for (int j = minC; j <= maxC; j++) {
                arr[minR][j] = k++;
            }
            minR++;

            if (minR > maxR || minC > maxC) break;
            //Top -->> Bottom
            for (int i = minR; i <= maxR; i++) {
                arr[i][maxC] = k++;
            }
            maxC--;

            if (minR > maxR || minC > maxC) break;
            //Right -->> Left
            for (int j = maxC; j >= minC; j--) {
                arr[maxR][j] += k++;
            }
            maxR--;

            if (minR > maxR || minC > maxC) break;
            //Bottom -->> Top
            for (int i = maxR; i >= minR; i--) {
                arr[i][minC] = k++;
            }
            minC++;
        }
        //Output
        System.out.println("Output : ");
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
