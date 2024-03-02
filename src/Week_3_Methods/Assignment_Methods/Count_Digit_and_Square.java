package Week_3_Methods.Assignment_Methods;

import java.util.Scanner;

public class Count_Digit_and_Square {

    static int Square(int n){
        return n*n;
    }
    static int Count(int n) {
        int count = 0;
        while (n!=0) {
            n = n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("The number of digits in "+n+" is : "+Count(n));
        System.out.println("The square of number of digits in "+n+" is : "+Square(Count(n)));
    }
}
