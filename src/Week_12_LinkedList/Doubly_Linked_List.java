package Week_12_LinkedList;
class dNode{
    int val;
    dNode next;
    dNode prev;

    dNode(int val){
        this.val = val;
    }
}
public class Doubly_Linked_List {
    public static void print(dNode head){ // Print the LinkedList when head is given
        dNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void printReverse(dNode tail){ // Print the LinkedList in reverse order when tail is given
        dNode temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void display(dNode node){ // Print the LinkedList when Random node is given
        dNode temp = node;
        while (temp.prev != null) {
            temp = temp.prev;
        }
        // Now we are on the head of the LinkedList
        print(temp);
    }

    public static void main(String[] args) {
        // Creating nodes
        dNode a = new dNode(10);
        dNode b = new dNode(20);
        dNode c = new dNode(30);
        dNode d = new dNode(40);

        // Making connections
        a.next = b; b.prev = a;
        b.next = c; c.prev = b;
        c.next = d; d.prev = c;

        print(a); // Print the LinkedList when head is given
        printReverse(d); // Print the LinkedList in reverse order when tail is given
        display(c); // Print the LinkedList when any random node is given
    }
}
