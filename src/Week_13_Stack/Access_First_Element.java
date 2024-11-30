package Week_13_Stack;

import java.util.Stack;
// To access the first element pushed into the stack -> Time complexity : O(n)                   Space Complexity : O(n)
public class Access_First_Element {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println("Stack -> " + st);
        System.out.println("Element at th top of the stack -> " + st.peek());

        // Accessing the 1st element inserted in the stack
        while (st.size() != 1) {
            // Now the size of the stack is 1
            st.pop();// Remove (n-1) elements from the top.
            // Now, the size if the stack is 1.
        }

        System.out.println("The first element inserted in the stack was -> " + st.peek());
    }
}
