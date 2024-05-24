package Week_10_Recursion.Assignment;

import java.util.Scanner;

public class Sum_Of_Digits {
    public static int sumOfDigits(int n){
        if (n==0) return 0;
        int i = n%10;
        return i + sumOfDigits(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Sum of digits of " + n + " is : " + sumOfDigits(n));
    }
}
