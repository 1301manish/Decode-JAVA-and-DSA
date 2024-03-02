package Week_3_Methods;

import java.util.Scanner;

public class Print_Factorial_From_1_to_n {

    //Using function
    public static int fact(int n){
        int fact = 1;
        for (int i = 1; i <= n ; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            System.out.println("Factorial of "+i+" is : "+fact(i));
        }

        //Without using function
        int fact = 1;
        for (int i = 1; i <=n  ; i++) {
            fact*=i;
            System.out.println("Factorial of "+i+" is : "+fact);
        }
    }
}
