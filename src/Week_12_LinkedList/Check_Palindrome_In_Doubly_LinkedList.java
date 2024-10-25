package Week_12_LinkedList;

public class Check_Palindrome_In_Doubly_LinkedList {
    private static boolean checkPalindrome(dNode head, dNode tail){
        while (head!=tail) {
            if (head.val != tail.val) return false;
            head = head.next;
            tail = tail.prev;
        }
        return true;
    }
    public static void main(String[] args) {
        dNode a = new dNode(10);
        dNode b = new dNode(20);
        dNode c = new dNode(30);
        dNode d = new dNode(20);
        dNode e = new dNode(10);

        // Making connections
        a.next = b; b.prev = a;
        b.next = c; c.prev = b;
        c.next = d; d.prev = c;
        d.next = e; e.prev = d;

        System.out.println(checkPalindrome(a,e));
    }
}
