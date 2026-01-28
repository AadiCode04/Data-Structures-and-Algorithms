public class MergeSortLinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;

    // middle find

    static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Case
    static Node mergesort(Node head) {

        // Base Case
        if (head == null || head.next == null) {
            return head;
        }

        // kaam karo

        // mid nikalo
        Node mid = getMid(head);

        // list tod do
        Node righthead = mid.next;
        mid.next = null;

        // recursion
        Node leftSort = mergesort(head);
        Node rightSort = mergesort(righthead);

        return merge(leftSort, rightSort);

    }

    // merge
    static Node merge(Node head1, Node head2) {

        Node dummy = new Node(-1);
        Node temp = dummy;

        while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        if (head1 != null) {
            temp.next = head1;
        } else {
            temp.next = head2;
        }

        return dummy.next;
    }

    static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        head = new Node(4);
        head.next = new Node(1);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);

        System.out.print("Before Starting: ");
        printList(head);

        head = mergesort(head);

        System.out.print("After sorting: ");
        printList(head);

    }
}
