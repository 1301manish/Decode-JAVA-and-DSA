package Week_10_Recursion.Practice_Recurssion;

import java.util.Scanner;

public class Prime_Number {
    public static boolean checkPrime (int n, int i) {
        if (n<i*i) return true;
        if (n%i==0) return false;
        else return checkPrime(n,i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        boolean result = checkPrime(n,2);
        if (result) System.out.println(n + " is a prime number");
        else System.out.println(n + " is not a prime number");
    }
}
