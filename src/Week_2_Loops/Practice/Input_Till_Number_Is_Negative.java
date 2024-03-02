package Week_2_Loops.Practice;

//Write a program to enter the numbers till the user wants, the number can be positive,
//negative or zero. Calculate the sum of numbers until a negative number is encountered. I
//f the input is a negative number, current sum is discarded and print -1.

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Input_Till_Number_Is_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int sum =0;
        while (flag){
            System.out.print("Enter the number : ");
            int num = sc.nextInt();
            if (num>0){
                sum+=num;
                System.out.println("The sum is : "+sum);
            }
            else{
                sum=-1;
                System.out.println("The current sum is discarded : "+sum);
                flag=false;
            }
        }
    }
}
