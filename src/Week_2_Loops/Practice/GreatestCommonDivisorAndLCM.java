package Week_2_Loops.Practice;

import java.util.Scanner;

public class GreatestCommonDivisorAndLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the first number : ");
        int num2 = sc.nextInt();
        //GCD
        int HCF=1;
        for (int i = 1; i<=num1 && i<=num2 ;i++) {
            if(num1%i==0 && num2%i==0){
                HCF = i;
            }
        }
        System.out.println("Greatest common divisor is : "+HCF);
        //LCM
        int LCM = (num1*num2)/HCF;
        System.out.println("LCM is : "+LCM);
    }
}
