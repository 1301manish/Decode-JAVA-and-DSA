package Week_2_Conditional;

import java.util.Scanner;

public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number : ");
        int b = sc.nextInt();
        System.out.print("Enter the 3rd number : ");
        int c = sc.nextInt();
        if (a>=b && b>=c){
            System.out.println(a+" is largest number.");
        }
        else if (b>=c && c>=a){
            System.out.println(b+" is largest number.");
        }
        else{
            System.out.println(c+" is largest number.");
        }
    }
}
