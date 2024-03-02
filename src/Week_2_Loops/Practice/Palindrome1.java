package Week_2_Loops.Practice;

import java.util.Scanner;

public class Palindrome1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num1 = sc.nextInt();
        int num=num1;
        int ans = 0;
        while (num != 0) {
            int i = num % 10;
            num = num / 10;
            ans = ans * 10 + i;
        }
        if (num1 == ans) {
            System.out.println("This is palindrome number");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
