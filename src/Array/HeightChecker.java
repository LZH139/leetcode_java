package Array;

import java.util.HashSet;
import java.util.Set;

public class HeightChecker {
    public static void main(String[] argv) {
        HeightChecker d = new HeightChecker();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1,1,4,2,1,3};
        System.out.print(s.heightChecker(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int heightChecker(int[] heights) {
            int[] countlist = new int[101];
            int result = 0;
            for(int i=0;i<heights.length;i++){
                countlist[heights[i]]++;
            }
            int j=0;
            for(int i=0;i<heights.length;i++){
                while(countlist[j] <=0){
                    j++;
                }
                if(heights[i] != j){
                    result++;
                }
                countlist[j]--;
            }
            return result;
        }
    }

}
    