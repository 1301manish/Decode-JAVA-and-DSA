/*
Benefits of LinkedList over array :
    1. No continuous memory allocation
    2. Insertion/Deletion in O(1)
    3. Infinite size
 */
package Week_12_LinkedList;

class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}

public class Linked_List {

    //Printing the LinkedList recursively
    public static void printRecursively(Node head){
        if (head==null) return; // Base case

        System.out.println(head.val); // Self work
        printRecursively(head.next); // Recursive call
    }

    //Printing the LinkedList with the help of loop
    public static void print(Node head){
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }

//        for (int i = 0; i < 5; i++) {
//            System.out.println(temp.val);
//            temp = temp.next;
//        }
    }

    //Printing the LinkedList recursively
    public static void printRecursivelyReverse(Node head){
        if (head==null) return; // Base case

        printRecursivelyReverse(head.next); // Recursive call
        System.out.println(head.val); // Self work
    }

    public static void main(String[] args) {
        Node a = new Node(10); // Creation of new node (a is the "Head" node)
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        System.out.println(a); //Node@6acbcfc0
        System.out.println(a.val); //10

        a.next = b; //a->b     (This is known as "Linking")
        b.next = c; // a->b->c
        c.next = d; // a->b->c->d
        d.next = e; // a->b->c->d->e

        System.out.println(b); //Node@5f184fc6 (Same)
        System.out.println(a.next); //Node@5f184fc6 (same)

        //Printing the LinkedList
        System.out.println(a.val); // 10
        System.out.println(a.next.val); // 20
        System.out.println(a.next.next.val); // 30
        System.out.println(a.next.next.next.val); // 40
        System.out.println(a.next.next.next.next.val); // 50

        System.out.println("Printing with the help of the loop");
        print(a);
        System.out.println("Printing with the help of recursion");
        printRecursively(a);
        System.out.println("Printing the LinkedList in the reverse order");
        printRecursivelyReverse(a);
    }
}
