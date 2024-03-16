package Week_6_Strings_And_StringBuilders;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of words : ");
        int n = sc.nextInt();

        String [] arr = new String[n];

        System.out.println("Enter " + n + " words : ");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.next();
        }

        System.out.print("Output : ");
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
