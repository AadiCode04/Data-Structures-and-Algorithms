package Array_Assignment;

public class Que3Stock {
    
    public static int BuyAndSell(int price[]){
        
        int BuyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0 ;
        

        for (int i = 0; i < price.length; i++) {
            int SellPrice = price[i];
            if (BuyPrice < SellPrice) {
                int profit = SellPrice - BuyPrice;
                MaxProfit = Math.max(MaxProfit, profit);
            }else{
                BuyPrice = SellPrice;
            }
        }
        return MaxProfit;
    }

    public static void main(String[] args) {
        int price[] = {7 ,1 ,5 ,3 ,6 ,4};
        System.out.println(BuyAndSell(price));
    }
}
