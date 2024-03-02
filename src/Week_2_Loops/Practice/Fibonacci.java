package Week_2_Loops.Practice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int num1 = 0;
        int num2 = 1;

        System.out.print(num1+" ");
        System.out.print(num2+" ");
        for (int i = 0; i <num-2; i++) {
            int num3 = num1+num2;
            num1=num2;
            num2=num3;

            System.out.print(num3 +" ");

        }

    }
}
