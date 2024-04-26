package Week_10_Recursion;

import java.util.Scanner;

public class Generate_String_Without_Consicutive_Ones {

    public static void printString(String s, int n){
        int m = s.length();
        if (m==n) {
            System.out.println(s);
            return;
        }
        if (m==0 || s.charAt(m-1)=='0'){
            printString(s+1,n);
            printString(s+0,n);
        }
        else printString(s+0,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the string to generated : ");
        int n = sc.nextInt();
        printString("",n);
    }
}
