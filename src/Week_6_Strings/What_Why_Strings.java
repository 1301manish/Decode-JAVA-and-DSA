package Week_6_Strings;

import java.util.Scanner;

/*
Character array is known as string
*/
public class What_Why_Strings {
    public static void main(String[] args) {
        // Creating and printing a character array
        char[] ch = {'M', 'a', 'n', 'i', 's', 'h'};
        for (char element : ch) {
            System.out.print(element);
        }
        System.out.println();

        // Printing the character array using a for loop
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
        System.out.println();

        // Creating and printing a string
        String x = "Manish is a student";
        System.out.print(x);

        // Taking input for a single word in a string
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your name : ");
        String str = sc.next();   // Input: Manish
        System.out.println(str);   // Output: Manish

        // Taking input for a full name in a string
        System.out.print("\nEnter your full name : ");
        String str1 = sc.next();   // Input: Manish Kumar
        System.out.println(str1);   // Output: Manish

        // Consuming the newline character left by the previous next()
        sc.nextLine();

        // Taking input for a full name in a string
        System.out.print("\nEnter your full name : ");
        String str2 = sc.nextLine();   // Input: Manish Kumar
        System.out.println(str2);   // Output: Manish Kumar
    }
}
