 package Week_13_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Prefix_To_Infix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a valid prefix expression
        System.out.print("Enter a valid prefix expression (e.g., +AB*CD): ");
        String str = sc.nextLine();

        // Stack to store operands during conversion
        Stack<String> stack = new Stack<>();

        // Iterate through the prefix expression from right to left
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);

            // If the character is an operand (letter or digit), push it to the stack
            if (Character.isLetterOrDigit(ch)) {
                stack.push(String.valueOf(ch)); // Push operand to stack
            }
            // If the character is an operator, pop two operands, create an infix expression and push it back to the stack
            else {
                String operand1 = stack.pop(); // Pop the first operand
                String operand2 = stack.pop(); // Pop the second operand

                // Combine the operands with the operator to form the infix expression
                String infix = "(" + operand1 + ch + operand2 + ")";
                stack.push(infix); // Push the resulting infix expression back to the stack
            }
        }

        // The final infix expression is the only element left in the stack
        System.out.println("The infix expression is: " + stack.peek());
    }
}