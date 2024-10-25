package Week_12_LinkedList;

public class Doubly_Circular_Linked_List {
    public static void printDoublyCircular(dNode head){
        dNode temp = head;
        while(true){
            System.out.print(temp.val + " ");
            if (temp.next==head) break;
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        dNode a = new dNode(10); // Creation of new node (a is the "Head" node)
        dNode b = new dNode(20);
        dNode c = new dNode(30);
        dNode d = new dNode(40);
        dNode e = new dNode(50);

        // Making connection in Doubly Circular LinkedList
        a.next = b; b.prev = a;
        b.next = c; c.prev = b;
        c.next = d; d.prev = c;
        d.next = e; e.prev = d;
        e.next = a; a.prev = e;

        printDoublyCircular(a); // 10 20 30 40 50
    }
}
