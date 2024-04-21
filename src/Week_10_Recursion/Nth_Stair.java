package Week_10_Recursion;

import java.util.Scanner;

//At a time you can climb 1 or 2 steps.
public class Nth_Stair {

    public static int Stair_Path(int n){
        if (n<=2) return n; // Stair_Path(1) = 1, Stair_Path(2) = 2;
        return Stair_Path(n-1) + Stair_Path(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stairs : ");
        int n = sc.nextInt();
        System.out.println("Number of ways to reach the top of the stairs is : "+ Stair_Path(n));
    }
}
