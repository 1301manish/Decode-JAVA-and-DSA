package Week_3_Methods.Assignment_Methods;

import java.util.Scanner;

public class Square_Of_n_Natural_Number {
    public static void Square(int n){
        System.out.println("The square of "+n+" is "+n*n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            Square(i);
        }
    }
}
