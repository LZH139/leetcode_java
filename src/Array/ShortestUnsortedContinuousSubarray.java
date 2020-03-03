package Array;

import java.util.Stack;

public class ShortestUnsortedContinuousSubarray {
    public static void main(String[] argv){
        ShortestUnsortedContinuousSubarray d = new ShortestUnsortedContinuousSubarray();
        d.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{2, 6, 4, 8, 10, 9, 15};
        System.out.print(s.findUnsortedSubarray(n));
    }

    public void printArray(int [] nums){
        for(int num:nums){
            System.out.print(num+" ");
        }
    }

    class Solution {
        public int findUnsortedSubarray(int[] nums) {
            Stack<Integer> stack = new Stack<>();
            int l=nums.length;
            int r = 0;
            for(int i=0;i<nums.length;i++){
                while (!stack.isEmpty()&&nums[i]<nums[stack.peek()]){
                    l = Math.min(l,stack.pop());
                }
                stack.push(i);
            }
            stack.clear();
            for(int i=nums.length-1;i>=0;i--){
                while (!stack.isEmpty()&&nums[i]>nums[stack.peek()]){
                    r = Math.max(r,stack.pop());
                }
                stack.push(i);
            }
            return r-l>0? r-l+1 : 0;
        }
    }

}
