package HashTable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMismatch {
    public static void main(String[] argv) {
        SetMismatch d = new SetMismatch();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.print(s.findErrorNums(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public class Solution {
        public int[] findErrorNums(int[] nums) {
            int sameNum = 0;
            int temp = 0;
            int sum = 0;
            int[] res = new int[2];
            Arrays.sort(nums);
            for(int i=0;i<nums.length;i++){
                if(temp == 0) {
                    temp = nums[i];
                }else{
                    if(temp == nums[i]){
                        sameNum = nums[i];
                    }
                    temp = nums[i];
                }
                sum += nums[i];
            }
            res[0] = sameNum;
            res[1] = (1+nums.length)*nums.length/2-sum+sameNum;
            return res;

        }

    }



}
    