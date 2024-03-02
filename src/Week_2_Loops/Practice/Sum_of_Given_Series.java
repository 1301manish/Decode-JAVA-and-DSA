package Week_2_Loops.Practice;

import java.util.Scanner;


public class Sum_of_Given_Series {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number : " );
        int num = sc.nextInt();

        float sum=0;
        for (int i = 1; i <=num; i++)
        {
            sum = sum + (float) Math.pow(-1, i+1)*(1/i);
        }
        System.out.print("The sum of the given series is : "+sum);
    }
}
