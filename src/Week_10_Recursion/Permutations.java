package Week_10_Recursion;

import java.util.Scanner;

public class Permutations {
    public static void printPermutations(String ans, String s){
        if (s.length()==0){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            printPermutations(ans+ch, left+right);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.next();
        printPermutations("", s);
    }
}
