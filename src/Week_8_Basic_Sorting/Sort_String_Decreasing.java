package Week_8_Basic_Sorting;

/*
Ques: Sort a String in decreasing order of values
associated after removal of values smaller than X.
 */

import java.util.Scanner;

public class Sort_String_Decreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.next();                         //Input : AZYZXBYDXJK
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch>='X'){
                sb.append(ch);
            }
        }

        System.out.println("Original String : " + s);
        System.out.println("String after removal of X : " + sb);
        for (int i = 0; i < sb.length()-1; i++) {
            boolean flag = true;
            for (int j = 0; j < sb.length() - 1 - i; j++) {
                if (sb.charAt(j) < sb.charAt(j+1)) {
                    char temp = sb.charAt(j);
                    sb.setCharAt(j,sb.charAt(j+1));
                    sb.setCharAt(j+1,temp);
                    flag = false;
                }
            }
            if (flag) break;
        }
        System.out.println("String after sorting : " + sb);  // Output : ZZYYXX
    }
}
