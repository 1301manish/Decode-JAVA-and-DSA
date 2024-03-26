package Week_8_Basic_Sorting.Assignment;

/*
Ques: Sort a String using bubble sort
 */

import java.util.Scanner;

public class Sort_String_Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.next();                         //Input : AZYZXBYDXJK
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length()-1; i++) {
            boolean flag = true;
            for (int j = 0; j < sb.length() - 1 - i; j++) {
                if (sb.charAt(j) > sb.charAt(j+1)) {
                    char temp = sb.charAt(j);
                    sb.setCharAt(j,sb.charAt(j+1));
                    sb.setCharAt(j+1,temp);
                    flag = false;
                }
            }
            if (flag) break;
        }
        System.out.println("String after sorting : " + sb);  // Output : ABDJKXXYYZZ
    }
}
