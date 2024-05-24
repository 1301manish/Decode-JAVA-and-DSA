package Week_10_Recursion.Assignment;

import java.util.Scanner;

public class Reverse_Number {
    public static int reverseNumber(int n, int ans){
        if (n==0) return ans;
        int i = n%10;
        ans = ans*10 + i;
        return reverseNumber(n/10,ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int reverse = reverseNumber(n,0);
        System.out.println("Reverse of " + n + " is : " + reverse);
    }
}
