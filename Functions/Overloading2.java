package Functions;

public class Overloading2 {
    // Overloading Using Data Type 

    //function to calc int sum
     public static int sum (int a , int b ){
        return a + b ;
    }

    //function to calc float sum
    public static float sum( float a , float b){
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 01));
        System.out.println(sum(1.11f, 1.11f));
    }

}
