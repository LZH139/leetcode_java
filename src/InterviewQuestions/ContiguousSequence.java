package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class ContiguousSequence {
    public static void main(String[] argv) {
        ContiguousSequence d = new ContiguousSequence();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.print(s.maxSubArray(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int maxSubArray(int[] nums) {
            int res=nums[0];
            for(int i=1;i<nums.length;i++){
                nums[i]=Math.max(nums[i-1]+nums[i],nums[i]);
                res=Math.max(res,nums[i]);
            }
            return res;
        }
    }


}
    