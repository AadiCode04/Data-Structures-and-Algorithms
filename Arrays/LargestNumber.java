
public class LargestNumber {



    public static int getSmallest(int nos[]) {
        int smallest = Integer.MAX_VALUE; // +infinity

        for (int i = 0; i < nos.length; i++) {
            if (smallest > nos[i]) {
                smallest = nos[i];
            }
        }
        return smallest;
    }
    public static int getLargest(int nos[]) {
        int largest = Integer.MIN_VALUE; // -infinity

        for (int i = 0; i < nos.length; i++) {
            if (largest < nos[i]) {
                largest = nos[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int nos[] =  { 1 ,2 ,3 ,4 ,6 ,5};
        System.out.println("Largest value is : " + getLargest(nos));
        System.out.println("Smallest value is : " + getSmallest(nos));
    }
}
