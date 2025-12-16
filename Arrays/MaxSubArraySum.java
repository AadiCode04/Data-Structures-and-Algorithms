public class MaxSubArraySum {
    public static void maxsubarray(int number[]) {

        int currSum = 0 ;
        int MaxSum = Integer.MIN_VALUE;
         for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currSum=0;
                for (int k = start; k <= end; k++) {
                    //SubArray Sum
                currSum += number[k];
                }
                // System.out.println("current sum "+currSum );
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
