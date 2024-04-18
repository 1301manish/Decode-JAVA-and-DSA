package Week_10_Recursion;

import java.util.Scanner;

public class Print_1_To_n_After_Recursive_Call {

    public static void print (int n) {
        if (n==0) return; //base
        print(n-1); //call
        System.out.println(n); //work
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        print(n);
    }
}
