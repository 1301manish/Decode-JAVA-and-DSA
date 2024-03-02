package Week_2_Conditional;

import java.util.Scanner;

public class Three_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if(num>99 && num<1000){
            System.out.println(num + " is a three digit number.");
        }
        else{
            System.out.println(num + " is not a three digit number.");
        }

        if(num>9999 && num<100000){
            System.out.println(num + " is a five digit number.");
        }
        else{
            System.out.println(num + " is not a five digit number.");
        }
    }
}
