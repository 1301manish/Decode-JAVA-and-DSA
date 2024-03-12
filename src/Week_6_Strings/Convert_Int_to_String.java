package Week_6_Strings;

import java.util.Scanner;

public class Convert_Int_to_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        //Converting Integer to String without using builtin method
        String str = "" + num;
        System.out.println(str);

        //Converting Integer to String using builtin method
        String str2 = String.valueOf(num);
        String str3 = Integer.toString(num);

    }
}
