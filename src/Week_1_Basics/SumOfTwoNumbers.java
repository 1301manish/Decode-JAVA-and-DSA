package Week_1_Basics;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int x = sc.nextInt();
        System.out.print("Enter the 2nd number : ");
        int y = sc.nextInt();
        int sum = x+y;
        System.out.println("The sum of "+x+" and "+y+" is : "+sum);
    }
}
