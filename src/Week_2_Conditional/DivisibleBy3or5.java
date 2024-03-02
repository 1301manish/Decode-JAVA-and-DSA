package Week_2_Conditional;

import java.util.Scanner;

public class DivisibleBy3or5 {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 3 == 0 || num % 5 == 0){
            System.out.println(num + " is divisible by 5 or 3.");
        }
        else{
            System.out.println(num + " is not divisible by 5 or 3.");
        }
    }
}
