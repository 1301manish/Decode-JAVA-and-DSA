package Week_2_Loops.Practice;

import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        System.out.print("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        String orignal = sc.next();
        String reverse ="";
        for (int i = orignal.length()-1; i >=0; i--) {
            reverse=reverse + orignal.charAt(i);
        }
        if (orignal.equals(reverse)){
            System.out.println("This is a palindrome number");
        }
        else {
            System.out.println("This is not a palindrome number");
        }
    }
}
