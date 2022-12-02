public class App {
    public static void main(String[] args) throws Exception {
        int[] prices = {7, 1, 4, 3, 1};
        int profit = maxProfit(prices);
        System.out.println(profit);
    }

    public static int maxProfit(int[] prices) {

        // Proposed solution (o(n))

        int buyPrice = prices[0]; 
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < buyPrice){
                buyPrice = prices[i]; 
            }else {
                maxProfit = Math.max(maxProfit, prices[i] - buyPrice); 
            }
        }

        return maxProfit;

        /*************************************************************
            My solution - (o(n))

            int buyingAmount = prices[0];
            int sellingPrice = 0;
            int maximumProfit = 0;
            int index = 0;

            for(int i = 0; i < prices.length; i++) {
                if(prices[i] < buyingAmount){
                    buyingAmount = prices[i];
                    index = i;
                }
            }

            for(int j = index; j < prices.length; j++){
                if(prices[j] > sellingPrice){
                    sellingPrice = prices[j];
                    maximumProfit = sellingPrice - buyingAmount;
                } 
            }

            return maximumProfit;
        */
    }
}
