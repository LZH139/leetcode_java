package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HowManyNumbersArSmallerThanTheCurrenNumber {
    public static void main(String[] argv) {
        HowManyNumbersArSmallerThanTheCurrenNumber d = new HowManyNumbersArSmallerThanTheCurrenNumber();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{8,1,2,2,3};
        System.out.print(s.smallerNumbersThanCurrent(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int[] count = new int[101];
            int[] array = new int[nums.length];
            int repeat = 0;
            System.arraycopy(nums,0,array,0,nums.length);
            Arrays.sort(array);
            count[array[0]] = 0;
            for(int i=1;i<array.length;i++){
                if(array[i] == array[i-1]){
                    repeat++;
                    count[array[i]] = i-repeat;
                }else{
                    repeat = 0;
                    count[array[i]] = i;
                }

            }
            for(int i=0;i<nums.length;i++){
                nums[i] = count[nums[i]];
            }
            return nums;

        }
    }
}
    