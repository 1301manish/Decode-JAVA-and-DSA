package Week_3_Methods;

import java.util.Scanner;

public class PascalsTriangleUsingCombinationFunction {
    public static int Factorial(int f){
        int fact = 1;
        for (int i = 2; i <=f ; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void combination(int n , int r){
        int NCR = Factorial(n)/(Factorial(r)*Factorial(n-r));
        System.out.print(NCR + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        for (int i = 0; i <=n ; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i ; j++) {
                combination(i,j);
            }
            System.out.println();
        }
    }
}
