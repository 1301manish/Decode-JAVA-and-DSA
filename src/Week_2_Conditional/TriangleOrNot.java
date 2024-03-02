package Week_2_Conditional;

import java.util.Scanner;

public class TriangleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of 1st side : ");
        int a = sc.nextInt();
        System.out.print("Enter the length of 2nd side : ");
        int b = sc.nextInt();
        System.out.print("Enter the length of 3rd side : ");
        int c = sc.nextInt();
        if ((a+b)>c && (b+c)>a && (a+c)>b){
            System.out.println("It can form a triangle.");
        }
        else{
            System.out.println("It cannot form a triangle.");
        }
    }
}
