package Week_10_Recursion;

import java.util.Scanner;

public class Generate_Parenthesis {
    public static void generateParenthesis(int open, int close, int n, String s){
        if (s.length()==n*2){
            System.out.println(s);
            return;
        }
        if (open<n) generateParenthesis(open+1,close,n,s+"(");
        if (close<open) generateParenthesis(open,close+1,n,s+")");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        generateParenthesis(0,0,n,"");
    }
}
