package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class MissingNumberII {
    public static void main(String[] argv) {
        MissingNumberII d = new MissingNumberII();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{0,1,3};
        System.out.print(s.missingNumber(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int missingNumber(int[] nums) {
            int i=0;
            int j = nums.length-1;
            int temp;
            while (i<=j){
                temp = (i+j)/2;
                if(nums[temp] == temp){
                    i = temp+1;
                }else{
                    j = temp-1;
                }
            }
            return i;
        }
    }

}
    