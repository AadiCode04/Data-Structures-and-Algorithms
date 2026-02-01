public class DoublyCircularLinkedList {

    
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;

    // add at beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);

        // empty list
        if (head == null) {
            head = newNode;
            newNode.next = head;
            newNode.prev = head;
            return;
        }

        Node last = head.prev;

        newNode.next = head;
        newNode.prev = last;

        head.prev = newNode;
        last.next = newNode;

        head = newNode;
    }

    // add at last
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            newNode.prev = head;
            return;
        }

        Node last = head.prev;

        last.next = newNode;
        newNode.prev = last;

        newNode.next = head;
        head.prev = newNode;
    }

    // delete first 
    public void deleteFirst() {
        if (head == null) {
            return;
        }

        // single 
        if (head.next == head) {
            head = null;
            return;
        }

        Node last = head.prev;
        head = head.next;

        head.prev = last;
        last.next = head;
    }

    // display 
    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("( back to head )");
    }

    // display 
    public void displayBackward() {
        if (head == null) {
            return;
        }

        Node last = head.prev;
        Node temp = last;

        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        } while (temp != last);

        System.out.println("( back to last )");
    }

    // main 
    public static void main(String[] args) {
        DoublyCircularLinkedList dcll = new DoublyCircularLinkedList();

        dcll.addFirst(10);
        dcll.addFirst(20);
        dcll.addLast(30);
        dcll.addLast(40);

        dcll.displayForward();
        dcll.displayBackward();

        dcll.deleteFirst();
        dcll.displayForward();
    }
}

