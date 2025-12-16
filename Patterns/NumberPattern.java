package Patterns;

public class NumberPattern {
    public static void main(String[] args) {

        int n = 4 ;

        for( int line = 1 ;line <=n ; line++ ){
            for(int nos=1 ; nos<=line ; nos++){
                System.out.print(nos);
            }
            System.out.println();
        }
    }
}
