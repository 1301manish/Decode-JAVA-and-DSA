package Week_2_Conditional;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number : ");
        int num = sc.nextInt();
        // Odd or Even
        if(num % 2 ==0){
            System.out.println(num + " is a even number.");
        }
        else {
            System.out.println(num + " is a odd number.");
        }

        // Divisible by 5 or not
        if(num % 5 == 0){
            System.out.println(num + " is dividible by 5.");
        }
        else{
            System.out.println(num + " is not dividible by 5.");
        }
    }
}


