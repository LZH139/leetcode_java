public class BestTimeToBuyAndSellStock {
    public static void main(String[] argv){
        BestTimeToBuyAndSellStock b = new BestTimeToBuyAndSellStock();
        b.out();
    }

    public void out(){
        Solution s = new Solution();
        int [] stock = new int[]{7,1,5,3,6,4};
        System.out.println(s.maxProfit(stock));
    }
    class Solution {
        public int maxProfit(int[] prices) {
            return 1;
        }
    }
}
