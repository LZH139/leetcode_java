package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class MissingNumberLCCI {
    public static void main(String[] argv) {
        MissingNumberLCCI d = new MissingNumberLCCI();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{9,6,4,2,3,5,7,0,1};
        System.out.print(s.missingNumber(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int missingNumber(int[] nums) {
            int sum = 0;
            int N = nums.length;
            for(int n:nums){
                sum+=n;
            }
            return (1+N)*N/2-sum;
        }
    }

}
    