package HashTable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestHarmoniousSubsequence {
    public static void main(String[] argv) {
        LongestHarmoniousSubsequence d = new LongestHarmoniousSubsequence();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1,1,1,1};
        System.out.print(s.findLHS(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int findLHS(int[] nums) {
            int size = nums.length;
            int rs = 0;
            int i = 0;
            Arrays.sort(nums);
            for (int j = 0;j < size;j++) {
                while (i < size && nums[j] - nums[i] > 1) {
                    i++;
                }
                if(nums[j] - nums[i] == 1){
                    rs = Math.max(rs,j-i+1);
                }
            }
            return rs;

        }
    }

}
    