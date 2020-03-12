package Array;

import java.util.HashSet;
import java.util.Set;

public class LongestContinuousIncreasingSubsequence {
    public static void main(String[] argv) {
        LongestContinuousIncreasingSubsequence d = new LongestContinuousIncreasingSubsequence();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1,3,5,7};
        System.out.print(s.findLengthOfLCIS(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int findLengthOfLCIS(int[] nums) {
            if(nums.length == 0){
                return 0;
            }
            int longest = Integer.MIN_VALUE;
            int temp = 1;
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]<nums[i+1]){
                    temp++;
                }else{
                    longest = Math.max(longest,temp);
                    temp = 1;
                }
            }
            return Math.max(longest,temp);
        }
    }

}
    