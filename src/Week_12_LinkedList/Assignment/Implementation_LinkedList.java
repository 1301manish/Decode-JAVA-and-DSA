/*
Limitations of LinkedList :
    1. for get() Arrays has Time Complexity -> O(1) and LinkedList has Time Complexity -> O(N)
    2. for set() Arrays has Time Complexity -> O(1) and LinkedList has Time Complexity -> O(N)
 */
package Week_12_LinkedList.Assignment;

public class Implementation_LinkedList {

    static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null; // This is optional
        }
    }

    static class SLL { // User defined data structure
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

        // Delete at tail: Time Complexity -> O(N) (to traverse to the second-to-last node)
        // Space Complexity -> O(1) (no additional space used)
        void deleteAtTail() throws Error { // (Method to delete the last node of the LinkedList)
            if (head == null) throw new Error("LinkedList is empty"); // if LinkedList is empty, throw an error
            if (head == tail) { // when LinkedList has only one node
                head = tail = null; // set both head and tail to null
            } else { // when LinkedList has more than one node
                Node temp = head; // start traversal from head

                while (temp.next.next != null) { // traverse to the second-to-last node
                    temp = temp.next;
                }

                temp.next = null; // disconnect the last node
                tail = temp; // update tail to the new last node
            }

            size--; // decrease the size of the LinkedList
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

        /**
         * Method to display the values of the LinkedList in the format 10 -> 100 -> 20 -> null
         * Time Complexity -> O(N) (due to traversal through all nodes)
         * Space Complexity -> O(N) (due to recursive call stack)
         *
         * Note: This method prints the elements of the LinkedList followed by "null" to indicate the end.
         *
         */
        /**
         * Method to display the values of the LinkedList recursively in the format 10 -> 100 -> 20 -> null
         * Time Complexity -> O(N)
         * Space Complexity -> O(N)
         */
        public void displayRecursive() {
            displayRecursiveHelper(head);  // Start the recursion from the head node
            System.out.println("null");    // Print "null" at the end of the list
        }

        private void displayRecursiveHelper(Node currentNode) {
            if (currentNode == null) {
                return;  // Base case: If the current node is null, stop the recursion
            }
            System.out.print(currentNode.val + " -> ");  // Print current node's value followed by " -> "
            displayRecursiveHelper(currentNode.next);    // Recursive call for the next node
        }

        // Here Time Complexity -> O(1), but if only head is given then the time complexity becomes O(N)
        void size() { // (Method to print the size of the LinkedList)
            System.out.println("Length of the LinkedList is : " + size);
        }

        /*
         * Method to calculate the size of the LinkedList by traversing it
         * Time Complexity -> O(N) (due to traversal of the entire list)
         * Space Complexity -> O(1)
         *
         * Note: This method is unnecessary as the size is already maintained
         * as a class variable with O(1) time complexity for access.

        int calculateSize() {
            Node temp = head;  // Start at the head of the list
            int count = 0;     // Initialize the count to zero

            // Traverse the list and count the nodes
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;  // Return the total count of nodes
        }
        */

    }
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

        list.deleteAtTail();
        list.display();
        list.size();

        list.displayRecursive();
    }
}
