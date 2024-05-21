package Week_2_Loops.Practice;

import java.util.Scanner;

public class Palindrome3 {
    public static void main(String[] args) {
        System.out.print("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        String orignal = sc.next();
        int i = 0;
        int j = orignal.length()-1;
        boolean flag = true;
        while (i<=j){
            if (orignal.charAt(i)!=orignal.charAt(j)){
                flag = false;
                break;
            }
            else {
                i++;
                j--;
            }
        }
        if (flag) System.out.println("Palindrome");
        else System.out.println("Not palindrome");
    }
}
