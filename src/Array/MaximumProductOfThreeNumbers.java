package Array;

import java.util.HashSet;
import java.util.Set;

public class MaximumProductOfThreeNumbers {
    public static void main(String[] argv) {
        MaximumProductOfThreeNumbers d = new MaximumProductOfThreeNumbers();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{-4,-3,-2,-1,60};
        System.out.print(s.maximumProduct(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int maximumProduct(int[] nums) {
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;
            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            int max3 = Integer.MIN_VALUE;
            for(int n:nums){
                if(n<min1){
                    min2 = min1;
                    min1 = n;
                }else if(n<min2){
                    min2 = n;
                }

                if(n>max1){
                    max3 = max2;
                    max2 = max1;
                    max1 = n;
                }else if(n>max2){
                    max3 = max2;
                    max2 = n;
                }else if(n>max3){
                    max3 = n;
                }
            }
            return Math.max(min1*min2*max1, max1*max2*max3);
        }
    }

}
    