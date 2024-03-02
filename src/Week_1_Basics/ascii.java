package Week_1_Basics;

import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character : ");
        char ch = sc.next().charAt(0);
        System.out.print("The ascii value of "+ch+" is :");
        System.out.println((int)ch);//type casting

    }
}
