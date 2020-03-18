package Array;

import java.util.HashSet;
import java.util.Set;

public class NumberOfEquivalentDominoPairs {
    public static void main(String[] argv) {
        NumberOfEquivalentDominoPairs d = new NumberOfEquivalentDominoPairs();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[][] n = new int[][]{{1,2},{2,1},{3,4},{5,6}};
        System.out.print(s.numEquivDominoPairs(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int numEquivDominoPairs(int[][] dominoes) {
            int[] list = new int[100];
            int result = 0;
            for(int[] d:dominoes){
                result+=list[d[0]>=d[1]?d[0]*10+d[1]:d[1]*10+d[0]]++;
            }
            return result;
        }
    }
}
    