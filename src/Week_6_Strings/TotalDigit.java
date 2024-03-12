package Week_6_Strings;

import java.util.Scanner;

public class TotalDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        String str = Integer.toString(num);
        int length = str.length();
        System.out.println("Number of digits in number " + num + " is " + length);
    }
}
