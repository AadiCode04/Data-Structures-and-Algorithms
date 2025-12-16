package BitManipulation;

public class EvenOdd {
    
    public static void checker(int n){
        int bitmask = 1 ;
        if((n  & bitmask)==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
    
    public static void main(String[] args) {
        checker(3);
        checker(11);
        checker(12);

    }
}
