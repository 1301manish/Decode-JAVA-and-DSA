package Week_2_Loops.Practice;

import java.util.Scanner;

public class aToPowerb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base : ");
        int a =sc.nextInt();
        System.out.print("Enter the exponent : ");
        int b =sc.nextInt();
        int pro = 1 ;
        for (int i = 0; i < b; i++) {
            pro*=a;
        }
        System.out.println(pro);
    }
}
