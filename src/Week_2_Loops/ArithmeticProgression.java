package Week_2_Loops;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int x = 1 + (n - 1) * 2;

        for (int i = 1; i <= x; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Method 1
        int y = 4 + (n - 1) * 3;

        for (int i = 4; i <= y; i = i + 3) {
            System.out.print( i + " ");
        }
        //Method 2
        System.out.println();
        int a = 4 , d=3;
        for(int i =1; i<=n ; i++){
            System.out.print(a+ " ");
            a+=d;
        }
    }
}