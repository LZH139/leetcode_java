package Array;

import java.util.Arrays;

public class ArrayPartitionI {
    public static void main(String[] argv){
        ArrayPartitionI d = new ArrayPartitionI();
        d.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{1,4,3,2};
        System.out.print(s.arrayPairSum(n));
    }

    public void printArray(int [] nums){
        for(int num:nums){
            System.out.print(num+" ");
        }
    }

    class Solution {
        public int arrayPairSum(int[] nums) {
            Arrays.sort(nums);
            int sum = 0;
            for(int i=0;i<nums.length;i+=2){
                sum+=nums[i];
            }
            return sum;
        }
    }

}
