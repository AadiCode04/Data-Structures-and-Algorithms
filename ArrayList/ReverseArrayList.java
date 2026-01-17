import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 6; i++) {
            list.add(i);
        }
        System.out.print(list + " ");

        System.out.println();

        for (int j = list.size()-1; j >=0 ; j--) {
            System.out.print(list.get(j) + " " );
        }
        System.out.println();
        
    }
}
