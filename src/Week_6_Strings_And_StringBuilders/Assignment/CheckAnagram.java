package Week_6_Strings_And_StringBuilders.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st string: ");
        String str1 = sc.nextLine().toLowerCase();//Taking string as input

        System.out.print("Enter the 2nd string: ");
        String str2 = sc.nextLine().toLowerCase();//Taking string as input

        char [] arr = str1.toCharArray();
        Arrays.sort(arr);

        char [] brr = str2.toCharArray();
        Arrays.sort(brr);

        str1 = new String(arr);
        str2 = new String(brr);
        if (str1.equals(str2)) System.out.println("These strings are anagram");
        else System.out.println("These strings are not anagram");

//        if (Arrays.equals(arr,brr)) System.out.println("These strings are anagram");
//        else System.out.println("These strings are not anagram");
    }
}
