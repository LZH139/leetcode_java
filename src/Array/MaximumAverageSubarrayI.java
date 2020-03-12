package Array;

import java.util.HashSet;
import java.util.Set;

public class MaximumAverageSubarrayI {
    public static void main(String[] argv) {
        MaximumAverageSubarrayI d = new MaximumAverageSubarrayI();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1,12,-5,-6,50,3};
        System.out.print(s.findMaxAverage(n,4));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public double findMaxAverage(int[] nums, int k) {

            double sum = 0d;
            for(int i=0;i<k;i++){
                sum+=nums[i];
            }
            double result = sum;
            for(int i=k;i<nums.length;i++){
                sum = sum - nums[i-k]+nums[i];
                result = Math.max(result,sum);
            }
            return result/k;
        }

    }

}
    