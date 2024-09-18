/*
Limitations of LinkedList :
    1. for get() Arrays has Time Complexity -> O(1) and LinkedList has Time Complexity -> O(N)
    2. for set() Arrays has Time Complexity -> O(1) and LinkedList has Time Complexity -> O(N)
 */
package Week_12_LinkedList;

class SLL { // User defined data structure
    private Node head; // Make these private so that it can only be accessed through the methods
    private Node tail;
    private int size;

    //Insert at head : Time Complexity -> O(1)     Space Complexity -> O(1)
    void insertAtHead(int val) { // (Method to insert a node at the head (start) of the LinkedList )
        Node temp = new Node(val);
        if (head==null) head = tail = temp; // when LinkedList is empty
        else { // when LinkedList is not empty
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void insert(int index, int value){ // Insert at the give index     Time Complexity -> O(N) & Space Complexity -> O(1)
        if (index==0) { // Base Case
            insertAtHead(value);
            return;
        }

        if (index==size) { // Base Case
            insertAtTail(value);
            return;
        }

        if (index>size || index<0) { // Base Case
            System.out.println("Invalid Input!!!");
            return;
        }

        Node temp = new Node(value); // Creating new node
        Node x = head; // Keeping x at the head

        for (int i = 0; i < index-1; i++) { // Moving x at the required index (Loop runs N times, so Time Complexity -> O(N))
            x=x.next;
        }

        // Insertion
        temp.next = x.next;
        x.next = temp;

        size++; // Increasing the size
    }

    //Insert at tail : Time Complexity -> O(1) [Only when tail is given]     Space Complexity -> O(1)
    // If tail is not given the Time Complexity -> O(N) (because you have to travel the whole LinkedList) & Space Complexity -> O(1) remains same
    void insertAtTail(int val) { // (Method to insert a node at the end of the LinkedList )
        Node temp = new Node(val);
        if (head==null) head = tail = temp; // when LinkedList is empty
        else { // when LinkedList is not empty
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    // This method gives the value of the given index
    int get (int index) throws Error { // Time Complexity -> O(N) & Space Complexity -> O(1)
        // Base Case
        if (index==size-1) return tail.val;
        if (index>=size || index<0) {
            throw new Error("Invalid Input!!!");
        }

        Node temp = head; // Create temporary node

        for (int i = 0; i < index; i++) { //Traverse till the required index (Loop runs N times. So, Time Complexity -> O(N))
            temp = temp.next;
        }
        return temp.val;
    }

    void set (int index, int value) throws Error { // Time Complexity -> O(N) & Space Complexity -> O(1)
        // Base Case
        if (index==size-1) tail.val = value;
        if (index>=size || index<0) {
            throw new Error("Invalid Input!!!");
        }

        Node temp = head; // Create temporary node

        for (int i = 0; i < index; i++) { //Traverse till the required index (Loop runs N times. So, Time Complexity -> O(N))
            temp = temp.next;
        }
        temp.val = value;
    }

    void deleteAtHead () throws Error {
        if (head==null) throw new Error("LinkedList is empty");
        head = head.next;
        size--;
    }

    void delete (int index) throws Error { //Delete at a given index Time Complexity -> O(N) & Space Complexity -> O(1)
        if (index==0) { // Base Case
            deleteAtHead();
            return;
        }
        if (index>=size || index<0) throw new Error("Invalid Index"); // Base Case

        Node temp = head;

        for (int i = 0; i < index-1; i++) { // Traversing to the required index
            temp = temp.next;
        }

        if (temp.next==tail) tail = temp; // If we are deleting tail, then make temp tail before doing this.Otherwise, we will lose tail.

        temp.next = temp.next.next;  // Deleting the element
        size--; // Reducing the size
    }

    void display(){ // (Method to print the LinkedList) Time Complexity -> O(N) & Space Complexity -> O(1)
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Here Time Complexity -> O(1), but if only head is given then the time complexity becomes O(N)
    void size() { // (Method to print the size of the LinkedList)
        System.out.println("Length of the LinkedList is : " + size);
    }
}
public class Implementation_LinkedList {
    public static void main(String[] args) {
        SLL list = new SLL(); // Creation of the object
        list.insertAtTail(10); // Adding node to the LinkedList
        list.insertAtTail(20);
        list.display(); // Printing the LinkedList
        list.size(); // Printing the size of the LinkedList
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.insertAtHead(50);
        list.display();
        list.size();
        list.insert(2,100);
        list.display();
        list.size();
        System.out.println(list.get(3));
        list.set(3,90);
        list.display();
        list.deleteAtHead();
        list.display();
        list.delete(3);
        list.display();
    }
}
