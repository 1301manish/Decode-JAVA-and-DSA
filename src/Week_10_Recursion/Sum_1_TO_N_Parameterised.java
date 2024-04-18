package Week_10_Recursion;

import java.util.Scanner;

public class Sum_1_TO_N_Parameterised {

    public static void sum (int n, int sum) {
        if (n==0) {
            System.out.println("Sum is : " + sum);
            return;
        }
        sum(n-1,sum+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        sum(n,0);
    }
}
