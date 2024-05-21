package Week_10_Recursion.Assignment;

import java.util.Scanner;

public class Sum_Of_Odd_From_a_to_b {

    public  static int sumOdd(int a, int b){
        if (a%2==0) a++;
        if (a>b) return 0;
        else {
            return a + sumOdd(a+2, b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        int sum = sumOdd(a,b);
        System.out.println("The required sum is : " + sum);
    }
}
