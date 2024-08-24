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


/* METHOD : 2
static String removeChar(String str, char ch){
    // Base Case
    if (str.length() == 0) {
    return "";
    }
    // Check the first character of the given string if
    its ch then remove it
    if (str.charAt(0) == ch) {
        // Pass the rest of the string
        // to recursion Function call
        return removeChar(str.substring(1), ch);
    }

    // Add the first character since if it's not ch if we
    reached here
    return str.charAt(0) + removeChar(str.substring(1),
    ch);
}
 */
