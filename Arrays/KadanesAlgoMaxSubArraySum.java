import java.security.PublicKey;
import java.util.Scanner;

public class KadanesAlgoMaxSubArraySum {

    public static void kadanesAlgo(int number[]){
        int currentSum = 0 ;
        int MaximumSum = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            currentSum = currentSum + number[i]; 
            if (currentSum < 0) {
                currentSum = 0 ;
            }

            if(currentSum > MaximumSum){
                MaximumSum = currentSum;
            }

        }
        System.out.print("Maximum of SubArray sum is : " + MaximumSum);
    }
    public static void main(String[] args) {
        // int number[]= { -2 , -3 , 4 , -1 , -2 ,1 , 5 ,-3 };
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int number[] = new int[n];
        
        System.out.println("Enter "+ n + " input element "  );
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
         kadanesAlgo(number);

    }
}
