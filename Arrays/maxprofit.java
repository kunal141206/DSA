public class maxprofit {
    public static int maximumProfit(int[] prices){
        if(prices == null || prices.length == 0){
            return 0;
        }
        int minval = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i = 0;i<prices.length;i++){
            if(prices[i] < minval){
                minval = prices[i];
            }
            else if(prices[i] - minval > maxprofit){
                maxprofit = prices[i] - minval;
            }
        }
            return maxprofit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maximumProfit(prices));
    }
}
