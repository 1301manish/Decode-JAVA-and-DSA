package Week_2_Loops.Practice;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the first number : ");
        int num2 = sc.nextInt();
        int temp;
        if (num1>num2){
            temp=num1;
        }
        else {
            temp = num2;
        }
        if(num1==0 || num2==0){
            System.out.println("Greatest common divisor is : 0");
        }
        else{
            for (int i = temp; i<=num1*num2; i++) {
                if(i%num1==0 && i%num2==0){
                    System.out.println("Greatest common divisor is : "+i);
                    break;
                }
        }

        }
    }
}
