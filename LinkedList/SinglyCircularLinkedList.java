public class SinglyCircularLinkedList {

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;

    public void addFirst(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            newnode.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newnode;
        newnode.next = head;
        head = newnode;
    }

    public void addLast(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            newnode.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newnode;
        newnode.next = head;
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }

        if (head.next == head) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        head = head.next;
        temp.next = head;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("( Back to head )");
    }

    public static void main(String[] args) {
        SinglyCircularLinkedList sll = new SinglyCircularLinkedList();

        sll.addFirst(10);
        sll.addFirst(20);
        sll.addLast(30);
        sll.addLast(40);

        sll.display();

        sll.deleteFirst();
        sll.display();
    }
}
