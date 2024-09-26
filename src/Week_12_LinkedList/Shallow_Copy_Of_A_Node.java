package Week_12_LinkedList;

public class Shallow_Copy_Of_A_Node {
    public static void main(String[] args) {

        Node a = new Node(100);
        System.out.println(a.val); // 100

        Node temp = a; // Shallow Copy (Now temp has all the access of node "a". We can modify a with help of "temp".)
//      Node temp = new Node(100); // Deep Copy (In this case new node is created.)

        System.out.println(temp.val); // 100
        temp.val = 12;
        System.out.println(temp.val); //12
        System.out.println(a.val); // 12 (Here, temp has modified the value of a)

    }
}
