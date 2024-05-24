package Week_10_Recursion.Assignment;

import java.util.Scanner;

public class Print_Increasing_Decreasing {
    public static void pid(int n, int i){
        if (i>n) return;
        System.out.print(i + " ");
        pid(n,i+1);
        if (i>1) System.out.print(i-1 + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        pid(n,1);
    }
}
