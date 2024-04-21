package Week_10_Recursion;

import java.util.Scanner;

public class Skip {

    public  static void skip(int i, String str, String ans){
        if (i==str.length()) {
            System.out.println(ans);
            return;
        }
        if (str.charAt(i)!='a') ans += str.charAt(i);
        skip(i+1,str,ans);
        /*
        if (str.charAt(i)!='a') skip(i+1,str,ans+str.charAt(i));
        else skip(i+1,str,ans);
        */

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.next();
        skip(0, str, "");
    }
}
