package Week_10_Recursion;

import java.util.Scanner;

public class Print_String {

    public  static void printString(int i, String str){
        if (i==str.length()) return;
        System.out.print(str.charAt(i));
        printString(i+1,str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.next();
        printString(0, str);
    }
}
