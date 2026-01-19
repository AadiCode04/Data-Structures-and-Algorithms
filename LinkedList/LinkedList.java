package LinkedList;

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {

        // Step :-1 Create a newNode

        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step:-2 newNode next = head
        newNode.next = head; // linking

        // Step:- 3 Head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newnNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newnNode;
            return;
        }

        tail.next = newnNode;
        tail = newnNode;
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;

        while (i < idx - 1) {

            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(20);
        ll.addLast(30);
        ll.print();
        ll.add(2, 100);

        ll.print();
        System.out.println(ll.size);
    }
}
