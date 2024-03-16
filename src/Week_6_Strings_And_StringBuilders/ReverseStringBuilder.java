package Week_6_Strings_And_StringBuilders;

import java.util.Scanner;

/*
Take input as string builder and reverse it without using builtin function
 */
public class ReverseStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        StringBuilder sb1 = new StringBuilder(sc.nextLine());
        int j = sb1.length();
        for (int i = 0; i < j/2 ; i++) {
            char temp = sb1.charAt(i);
            sb1.setCharAt(i, sb1.charAt(j-1));
            sb1.setCharAt(j-1,temp);
            j--;
        }
        System.out.print("Reverse String without using builtin method : " + sb1);

        /*
        Take input as string builder and reverse it using builtin function
        */
        System.out.println("Enter a string : ");
        StringBuilder sb2 = new StringBuilder(sc.nextLine());
        sb2.reverse();
        System.out.print("Reversed string using builtin method : ");
    }
}
