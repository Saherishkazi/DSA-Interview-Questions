public class Buy_Sell_Stock {
   
    public static int stock(int prices[] ){
        int buyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){ //profit - sell the stocks
                int profit = prices[i] - buyPrice; //todays profit
                MaxProfit = Math.max(profit, MaxProfit);
            }
            //lose - buy the stocks
            else{
                buyPrice = prices[i];
            }
        }
        return MaxProfit;
    }

    public static void main(String arg[]){
    int prices[]= {7,1,5,3,6,4};
    System.out.println(stock(prices));
    }
    
}

