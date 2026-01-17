import java.util.ArrayList;

public class MaximumArrayList {
    public static void main(String[] args) {
        
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < 6; i++) {
            list.add(i);
        }
        
        int max = Integer.MIN_VALUE;
        
        for (int j = 0; j < list.size(); j++) {
            if ( list.get(j) > max ) {
                max = list.get(j);
            }
        }

        System.out.println( "Maximum element is : " + max);
    }
}
