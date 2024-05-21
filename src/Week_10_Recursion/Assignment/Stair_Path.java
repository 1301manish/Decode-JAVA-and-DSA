package Week_10_Recursion.Assignment;

import java.util.Scanner;

public class Stair_Path {

    public static int stairPath(int n){
        if (n<=2) return n;
        else if (n==3) return 4;
        else return stairPath(n-1) + stairPath(n-2) + stairPath(n-3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stairs : ");
        int n = sc.nextInt();
        int ans = stairPath(n);
        System.out.println("Total number of ways : " + ans);
    }
}
