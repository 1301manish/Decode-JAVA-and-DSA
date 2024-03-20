package Week_6_Strings_And_StringBuilders.Assignment;

import java.util.Scanner;

public class NumberOfSubstringsContainingVowels {

    public static boolean isVowel(String str){
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u') return false;
        }
        return  true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                if (isVowel(str.substring(i,j))) count++;
            }
        }
        System.out.println(count);
    }
}
