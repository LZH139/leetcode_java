package Array;

import java.util.HashSet;
import java.util.Set;

public class MinCostClimbingStairs {
    public static void main(String[] argv) {
        MinCostClimbingStairs d = new MinCostClimbingStairs();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{0,1,2,2};
        System.out.print(s.minCostClimbingStairs(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int minCostClimbingStairs(int[] cost) {
            int c1=0;
            int c2=0;
            int curr;
            for(int i=0;i<cost.length;i++){
                curr = cost[i]+Math.min(c1,c2);
                c1 = c2;
                c2 = curr;
            }
            return Math.min(c1,c2);
        }
    }

}
    