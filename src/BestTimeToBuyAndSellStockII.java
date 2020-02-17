public class BestTimeToBuyAndSellStockII {
    public static void main(String[] argv){
        BestTimeToBuyAndSellStockII b = new BestTimeToBuyAndSellStockII();
        b.out();
    }

    public void out(){
        Solution s = new Solution();
        int [] stock = new int[]{7,1,5,3,6,4};
        System.out.println(s.maxProfit(stock));
    }

    class Solution {
        public int maxProfit(int[] prices) {
            int result =0;
            int minprice = Integer.MAX_VALUE;
            int profit = 0;
            for(int i=0;i<prices.length;i++){
                if(prices[i]<minprice){
                    minprice = prices[i];
                    result = result+profit;
                    profit = 0;
                }else{
                    profit = profit + prices[i]-prices[i-1];
                    minprice = prices[i];
                }
                if(i == prices.length-1){
                    result = result + profit;
                }
            }
            return result;
        }
    }
}
