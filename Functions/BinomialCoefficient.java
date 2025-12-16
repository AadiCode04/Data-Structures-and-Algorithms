package Functions;

public class BinomialCoefficient {

    public static int Factorial(int n ){
        int f =1;
        for (int i = 1; i <=n; i++) {
            f = f * i ;
        }
        return f ;
    }
   
    
    public static int BinomialCoeff(int n , int r ){
        int n_factorial = Factorial(n);
        int r_factorial = Factorial(r);
        int n_r_factorial = Factorial(n-r);

        int result = n_factorial / (r_factorial*n_r_factorial);
        return result;
    }

    public static void main(String[] args) {
        
        BinomialCoeff(5 , 2 );
        System.out.println(BinomialCoeff(5,2));
    }

}
