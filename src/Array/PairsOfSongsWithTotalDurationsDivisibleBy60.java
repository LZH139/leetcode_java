package Array;

import java.util.HashSet;
import java.util.Set;

public class PairsOfSongsWithTotalDurationsDivisibleBy60 {
    public static void main(String[] argv) {
        PairsOfSongsWithTotalDurationsDivisibleBy60 d = new PairsOfSongsWithTotalDurationsDivisibleBy60();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{30,20,150,100,40};
        System.out.print(s.numPairsDivisibleBy60(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int numPairsDivisibleBy60(int[] time) {
            int[] list = new int[60];
            int sum=0;
            for(int i=0;i<time.length;i++){
                sum+=list[(60-time[i]%60)%60];
                list[time[i]%60]++;
            }
            return sum;
        }
    }

}
    