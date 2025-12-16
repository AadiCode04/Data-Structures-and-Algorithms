public class MaxSubArraySumPreffix {
    public static void maxsubarray(int number[]) {

        int currSum = 0 ;
        int MaxSum = Integer.MIN_VALUE;
        int prefix[] =  new int[number.length]; 

        //Calculate prefix Array 
        prefix[0] = 0 ;
        for (int i = 1; i < prefix.length; i++) {
             prefix[i] =  prefix[i-1] + number[i] ;
        }

         for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                 currSum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1] ;
                
                if (MaxSum < currSum) {
                    MaxSum = currSum;
                }
        
                
            }
            
        }
        System.out.println("Maximum Sum : " + MaxSum);
    }

    public static void main(String[] args) {
        int number[] = {1 , -3 ,2};
        maxsubarray(number);
    }
}
