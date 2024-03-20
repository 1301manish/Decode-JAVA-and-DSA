import java.util.Scanner;

public class ConvertToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter a string
        System.out.print("Enter the string: ");
        String str = sc.next();

        int sum = 0;
        int n = str.length();

        // Iterating through each character of the string
        for (int i = 0; i < n; i++) {
            // Converting the character to its corresponding integer value
            // ASCII value of character '0' is subtracted to get the actual digit value
            // This conversion works because the ASCII values for digits '0' to '9' are contiguous
            // For example, ASCII value of '0' is 48, '1' is 49, ..., '9' is 57.
            // So subtracting '0' from any digit character gives its integer value.
            int digitValue = (int) str.charAt(i) - '0';

            // Accumulating the integer value considering the position of each digit
            // Multiply the current sum by 10 to shift the digits to the left
            // and then add the new digit value obtained from the string
            sum = sum * 10 + digitValue;
        }

        // Printing the integer value obtained from the string
        System.out.println(sum);
    }
}
