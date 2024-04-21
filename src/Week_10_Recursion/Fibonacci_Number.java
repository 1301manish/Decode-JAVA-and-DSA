package Week_10_Recursion;

import java.util.Scanner;

public class Fibonacci_Number {

    public static int fibonacci(int n){
        if (n<=1) return n; // fibonacci(0) = 0, fibonacci(1) = 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println("fibonacci of " + n + " is "+ fibonacci(n));
    }
}
