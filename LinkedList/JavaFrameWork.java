import java.util.LinkedList;

public class JavaFrameWork {
    public static void main(String[] args) {
        
        //create --> Object = Integer..
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        System.out.print(ll);

        System.out.println();
        //remove


        ll.removeLast();
        ll.removeFirst();
        System.out.print(ll);
    }
}
