package Array;

import java.util.HashSet;
import java.util.Set;

public class NonDecreasingArray {
    public static void main(String[] argv) {
        NonDecreasingArray d = new NonDecreasingArray();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
//        int[] n = new int[]{3,4,2,3};
        int[] n = new int[]{4,2,3};
//        int[] n = new int[]{4,2,1};
//        int[] n = new int[]{-1,4,2,3};
//        int[] n = new int[]{1,5,4,6,7,8,9};
        System.out.print(s.checkPossibility(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    class Solution {
        public boolean checkPossibility(int[] nums) {
            int count = 0;
            if(nums.length<3){
                return true;
            }
            int left = 0;
            int right = nums.length-1;
            boolean flagl = false;
            boolean flagr = false;
            while ((!flagl || !flagr) && left<right){
                if(nums[left]<=nums[left+1]){
                    left++;
                }else{
                    flagl = true;
                }
                if(nums[right]>=nums[right-1]){
                    right--;
                }else{
                    flagr =true;
                }
            }
            if(right-left>1){
                return false;
            }else if(right-left==1){
                if(left!=0 && right!=nums.length-1){
                    if(nums[left-1]<nums[left+1] || nums[right+1]>nums[right-1]){
                        return true;
                    }else{
                        return false;
                    }
                }else{
                    return true;
                }
            }else{
                return true;
            }

        }
    }

}
    