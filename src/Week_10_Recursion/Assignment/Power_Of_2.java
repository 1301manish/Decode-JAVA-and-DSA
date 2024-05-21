package Week_10_Recursion.Assignment;

import java.util.Scanner;

public class Power_Of_2 {

    public static boolean isPowerOfTwo(int n){
        if (n == 1)
            return true;
        if (n % 2 != 0 || n == 0) {
            return false;
        }
        return isPowerOfTwo(n / 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(isPowerOfTwo(n));
    }
}
