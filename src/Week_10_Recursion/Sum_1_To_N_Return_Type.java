package Week_10_Recursion;

import java.util.Scanner;

public class Sum_1_To_N_Return_Type {

    public static int sum(int n){
        if (n==0) return 0;
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println("sum of " + n + " to 1 is : " + sum(n));
    }
}
