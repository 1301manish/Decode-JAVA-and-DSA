package Week_12_LinkedList;

class DLL {
    dNode head; // Starting node of the Doubly Linked List
    dNode tail; // Ending node of the Doubly Linked List
    int size; // Tracks the size of the Doubly Linked List

    // Display method to print the values of the Doubly Linked List
    void display() { // Time Complexity -> O(N) & Space Complexity -> O(1)
        dNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Insert at tail (end): Time Complexity -> O(1) if tail is provided; O(N) if not
    void insertAtTail(int val) {
        dNode temp = new dNode(val); // Creating new node
        if (size == 0) head = tail = temp; // LinkedList is empty
        else { // LinkedList is not empty
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++; // Increasing the size
    }

    // Insert at head (start): Time Complexity -> O(1) & Space Complexity -> O(1)
    void insertAtHead(int val) {
        dNode temp = new dNode(val); // Creating new node
        if (size == 0) head = tail = temp; // LinkedList is empty
        else { // LinkedList is not empty
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++; // Increasing the size
    }

    // Insert at a given index: Time Complexity -> O(N) & Space Complexity -> O(1)
    void insert(int index, int value) {
        if (index == 0) { // Insert at head if index is 0
            insertAtHead(value);
            return;
        }

        if (index == size) { // Insert at tail if index is size
            insertAtTail(value);
            return;
        }

        if (index > size || index < 0) { // Out-of-bounds check
            System.out.println("Invalid Input!!!");
            return;
        }

        dNode temp = new dNode(value); // Creating new node
        dNode x = head; // Pointer starting at head

        for (int i = 0; i < index - 1; i++) { // Moving x to the correct index position
            x = x.next;
        }

        dNode y = x.next; // Node at the current index

        // Insertion
        x.next = temp; temp.prev = x;
        y.prev = temp; temp.next = y;

        size++; // Increasing the size
    }

    // Delete from head: Time Complexity -> O(1) & Space Complexity -> O(1)
    void deleteAtHead() throws Error {
        if (size == 0) throw new Error("LinkedList is empty"); // Base Case: list is empty
        head = head.next; // Move head to the next node
        head.prev = null; // Remove previous pointer from new head
        size--; // Decrease size
    }

    // Delete from tail: Time Complexity -> O(1) & Space Complexity -> O(1)
    void deleteAtTail() throws Error {
        if (size == 0) throw new Error("LinkedList is empty"); // Base Case: list is empty
        tail = tail.prev; // Move tail to the previous node
        tail.next = null; // Remove next pointer from new tail
        size--; // Decrease size
    }

    // Delete from a given index: Time Complexity -> O(N) & Space Complexity -> O(1)
    void delete(int index) throws Error {
        if (index == 0) { // Delete at head
            deleteAtHead();
            return;
        }

        if (index == size - 1) { // Delete at tail
            deleteAtTail();
            return;
        }

        if (index >= size || index < 0) throw new Error("Invalid Index"); // Out-of-bounds check

        dNode temp = head;

        for (int i = 0; i < index - 1; i++) { // Traverse to the correct position
            temp = temp.next;
        }

        temp.next = temp.next.next; // Skip the node to delete
        temp = temp.next;
        temp.prev = temp.prev.prev;

        size--; // Decrease size
    }

    // Get the value of a given index: Time Complexity -> O(N) & Space Complexity -> O(1)
    int get(int index) throws Error {
        // Base Cases
        if (index == size - 1) return tail.val; // If the index is at the tail
        if (index >= size || index < 0) throw new Error("Invalid Input!!!"); // Out-of-bounds check

        dNode temp = head; // Pointer starting at head

        for (int i = 0; i < index; i++) { // Traverse to the specified index
            temp = temp.next;
        }
        return temp.val; // Return the value
    }

    // Set the value of a given index: Time Complexity -> O(N) & Space Complexity -> O(1)
    void set(int index, int value) throws Error {
        // Base Cases
        if (index == size - 1) tail.val = value; // If index is at the tail
        if (index >= size || index < 0) throw new Error("Invalid Input!!!"); // Out-of-bounds check

        dNode temp = head; // Pointer starting at head

        for (int i = 0; i < index; i++) { // Traverse to the specified index
            temp = temp.next;
        }
        temp.val = value; // Set the value
    }
}

public class Implementation_Doubly_LinkedList {
    public static void main(String[] args) {
        DLL list = new DLL(); // Creation of the DLL object

        list.display(); // Displaying an empty list
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display(); // Displaying list: 10 20 30
        list.insertAtTail(40);
        list.display(); // Displaying list: 10 20 30 40
        list.insertAtHead(50);
        list.display(); // Displaying list: 50 10 20 30 40
        list.insert(2, 80);
        list.display(); // Displaying list: 50 10 80 20 30 40
        list.insert(6, 800);
        list.display(); // Displaying list: 50 10 80 20 30 40 800
        list.deleteAtHead();
        list.display(); // Displaying list: 10 80 20 30 40 800
        list.deleteAtTail();
        list.display(); // Displaying list: 10 80 20 30 40
        list.delete(3);
        list.display(); // Displaying list: 10 80 20 40
        System.out.println(list.get(1)); // Getting value at index 1: 80
        list.set(0, 100);
        list.display(); // Displaying list after setting index 0 to 100: 100 80 20 40
    }
}
