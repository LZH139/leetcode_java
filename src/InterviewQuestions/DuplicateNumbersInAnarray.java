package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbersInAnarray {
    public static void main(String[] argv) {
        DuplicateNumbersInAnarray d = new DuplicateNumbersInAnarray();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{2, 3, 1, 0, 2, 5, 3};
        System.out.print(s.findRepeatNumber(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int findRepeatNumber(int[] nums) {
            int[] list = new int[nums.length];
            for(int i=0;i<nums.length;i++){
                if(list[nums[i]]!=0){
                    return nums[i];
                }
                list[nums[i]]++;
            }
            return -1;
        }
    }
}
    