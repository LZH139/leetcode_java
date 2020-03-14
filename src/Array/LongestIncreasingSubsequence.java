package Array;

import java.util.HashSet;
import java.util.Set;

public class
LongestIncreasingSubsequence {
    public static void main(String[] argv) {
        LongestIncreasingSubsequence d = new LongestIncreasingSubsequence();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{10,9,2,5,3,7,101,18};
        System.out.print(s.lengthOfLIS(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int lengthOfLIS(int[] nums) {
            int[] tails = new int[nums.length];
            int res = 0;
            for(int num : nums) {
                int i = 0, j = res;
                while(i < j) {
                    int m = (i + j) / 2;
                    if(tails[m] < num) i = m + 1;
                    else j = m;
                }
                tails[i] = num;
                if(res == j) res++;
            }
            return res;
        }
    }

}
    