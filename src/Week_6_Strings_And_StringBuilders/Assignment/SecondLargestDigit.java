import java.util.Scanner;

public class SecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter a string
        System.out.print("Enter the string: ");
        String str = sc.next(); // Taking string as input

        int max1 = 0;
        // Finding the maximum digit in the string
        for (int i = 0; i < str.length(); i++) {
            int digitValue = (int) str.charAt(i) - '0';
            // Comparing each digit with the current maximum digit
            if (digitValue > max1) max1 = digitValue;
        }

        int max2 = 0;
        // Finding the second largest digit in the string
        for (int i = 0; i < str.length(); i++) {
            int digitValue = (int) str.charAt(i) - '0';
            // Comparing each digit with the current second largest digit
            // and ensuring it's not equal to the maximum digit found earlier
            if (digitValue > max2 && max1 != digitValue) max2 = digitValue;
        }

        // Printing the second largest digit
        System.out.println(max2);
    }
}
