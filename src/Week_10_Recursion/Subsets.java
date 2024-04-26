package Week_10_Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Subsets {

    static ArrayList<String> arr = new ArrayList<>(); //Global

    public static void printSubset(String str, int i, String ans){
        if(i==str.length()) {
            arr.add(ans);
            return;
        }

        char ch = str.charAt(i);
        printSubset(str, i+1, ans); //Not add
        printSubset(str, i+1, ans+ch); //Add
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.next();

        arr = new ArrayList<>(); //Reset
        printSubset(s, 0, "");
        System.out.println(arr);
    }
}
