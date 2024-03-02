package Week_3_Methods.Assignment_Methods;
import java.util.Scanner;
public class Odd_Number_Between_Two_Numbers {
    public static void fun(int n1, int n2){
        if(n1>n2){
            fun(n2,n1);
            return;
        }
        for (int i = n1; i <= n2; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int n2 = sc.nextInt();
        System.out.println("The odd numbers between "+n1+" and "+n2+" are :");
        fun(n1,n2);
    }
}
