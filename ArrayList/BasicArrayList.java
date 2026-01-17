import java.util.*;

public class BasicArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);


        //Get Operation 
        int element = list.get(2);
        System.out.println(element);

        //Set Element At index

        int setedElement = list.set(1, 222);
        System.out.println(setedElement);
        System.out.println(list);

        //Size of Array list 
        System.out.println(list.size());

        //Print ArrayList


        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

    }
}