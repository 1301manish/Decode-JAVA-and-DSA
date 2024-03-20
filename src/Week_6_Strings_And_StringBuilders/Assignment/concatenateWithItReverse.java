package Week_6_Strings_And_StringBuilders.Assignment;

import java.util.Scanner;

public class concatenateWithItReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();//Taking string as input
        StringBuilder sb = new StringBuilder(str);//Converting that string to String Builder for better performance of the program

        System.out.println("The resultant string : " + str + sb.reverse());
    }
}
