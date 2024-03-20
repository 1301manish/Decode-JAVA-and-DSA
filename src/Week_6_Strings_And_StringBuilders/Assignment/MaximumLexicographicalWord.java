package Week_6_Strings_And_StringBuilders.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumLexicographicalWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        //Method 1

        String[] words = str.split("\\s+");
        String maxWord = words[0];

        for (int i = 0; i < words.length; i++) {
            if (words[i].compareTo(maxWord) > 0) maxWord = words[i];
        }

        System.out.println("Maximum word in a given sentence is: "+maxWord);


        //Method 2

//        String [] ch = str.split("\\s+");
//
//        Arrays.sort(ch);
//
//        System.out.println("The maximum word lexicographically is : " + ch[ch.length-1]);
    }
}
