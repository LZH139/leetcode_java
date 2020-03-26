package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class MagicIndexLCCI {
    public static void main(String[] argv) {
        MagicIndexLCCI d = new MagicIndexLCCI();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{0, 2, 3, 4, 5};
        System.out.print(s.findMagicIndex(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int findMagicIndex(int[] nums) {
            for(int i=0;i<nums.length;i++){
                if(nums[i] == i){
                    return i;
                }
            }
            return -1;
        }
    }

}
    