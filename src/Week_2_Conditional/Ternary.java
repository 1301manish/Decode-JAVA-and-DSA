package Week_2_Conditional;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        String s = (num%2==0) ?"Even":"Odd";
//        System.out.println(s);
        System.out.println((num%2==0) ?"Even":"Odd");
    }
}
