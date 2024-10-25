package Week_12_LinkedList;

public class Singly_Circular_Linked_List {
    public static void printSinglyCircular(Node head){
        Node temp = head;
        while(true){
            System.out.print(temp.val + " ");
            if (temp.next==head) break;
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10); // Creation of new node (a is the "Head" node)
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b; //a->b
        b.next = c; // a->b->c
        c.next = d; // a->b->c->d
        d.next = e; // a->b->c->d->e
        e.next = a; // a->b->c->d->e->a "This connection makes this a singly circular LinkedList"

        printSinglyCircular(a); // 10 20 30 40 50
    }
}
