package Week_15_Trees;

import java.util.Scanner;

// Java program to count BST subtrees
// that lie in given range
class Count_Subtrees_In_Given_Range {
    public static class Node {
        int val;
        Node left, right;

        Node(int x) {
            val = x;
            left = null;
            right = null;
        }
    }

    // Global variable to store the count
    static int ans;

    // Recursive function to count
    // subtrees that lie in a range
    static boolean countSubtrees(Node root, int low, int high) {
        if (root == null) return true;

        // Check for left and right subtree.
        boolean left = countSubtrees(root.left, low, high);
        boolean right = countSubtrees(root.right, low, high);

        // If current subtree lies within range, then increment
        // ans count and return true.
        if (root.val >= low && root.val <= high && left && right) {
            ans++;
            return true;
        }

        // Else return false as this subtree
        // is out of range.
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Binary tree
        //         10
        //       /    \
        //     5       50
        //   /       /  \
        //  1       40   100
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(50);
        root.left.left = new Node(1);
        root.right.left = new Node(40);
        root.right.right = new Node(100);

        // Take low and high as input from the user
        System.out.println("Enter the lower bound (low):");
        int low = sc.nextInt();
        System.out.println("Enter the upper bound (high):");
        int high = sc.nextInt();

        // Initialize global variable
        ans = 0;
        countSubtrees(root, low, high);
        System.out.println("Number of subtrees in range [" + low + ", " + high + "]: " + ans);
    }
}
