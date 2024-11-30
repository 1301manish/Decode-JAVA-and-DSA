package Week_13_Stack;

import java.util.Stack;

// To reverse the first element pushed into the stack -> Time complexity : O(n)                   Space Complexity : O(n)

public class Reverse_Stack {
    public static void main(String[] args) {
        Stack<Integer> original_st = new Stack<>();

        original_st.push(10);
        original_st.push(20);
        original_st.push(30);
        original_st.push(40);
        original_st.push(50);
        original_st.push(60);
        System.out.println("Original Stack -> " + original_st);
        System.out.println();

        Stack<Integer> reverse_st = new Stack<>();

        // Remove elements from the original stack and push it into the temporary stack
        while (!original_st.isEmpty()) { // Time complexity : O(n)                   Space Complexity : O(n)
            reverse_st.push(original_st.pop());
        }
        System.out.println("Reverse Stack -> " + reverse_st);

    }
}
