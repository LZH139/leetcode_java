package Array;

import java.util.HashSet;
import java.util.Set;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] argv) {
        FindNumbersWithEvenNumberOfDigits d = new FindNumbersWithEvenNumberOfDigits();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{12,345,2,6,7896};
        System.out.print(s.findNumbers(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int findNumbers(int[] nums) {
            int result = 0;
            int tempLength;
            for(int i=0;i<nums.length;i++){
                tempLength = String.valueOf(nums[i]).length();
                if(tempLength%2 == 0){
                    result++;
                }
            }
            return result;
        }
    }

}
    