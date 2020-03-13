package Array;

import java.util.HashSet;
import java.util.Set;

public class LargestNumberAtLeastTwiceOfOthers {
    public static void main(String[] argv) {
        LargestNumberAtLeastTwiceOfOthers d = new LargestNumberAtLeastTwiceOfOthers();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1, 2, 3, 4};
        System.out.print(s.dominantIndex(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int dominantIndex(int[] nums) {
            if(nums.length == 0){
                return -1;
            }
            int position = -1;
            int maxNum = Integer.MIN_VALUE;
            int normalMaxNum = Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
                if(maxNum<nums[i]){
                    normalMaxNum = maxNum;
                    maxNum = nums[i];
                    position = i;
                }else if(nums[i]>normalMaxNum){
                    normalMaxNum = nums[i];
                }
            }
            return maxNum>=2*normalMaxNum?position:-1;
        }
    }

}
    