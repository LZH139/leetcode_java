package Array;


public class RotateArray {
    public static void main(String[] argv){
        RotateArray d = new RotateArray();
        d.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{1,2,3,4,5,6,7};
        s.rotate(n,3);
    }

    public void printArray(int [] nums){
        for(int num:nums){
            System.out.print(num+" ");
        }
    }

    class Solution {
        public void rotate(int[] nums, int k) {
            k = k%nums.length;
            reverse(nums,0,nums.length-1);
            reverse(nums,0,k-1);
            reverse(nums,k,nums.length-1);
            printArray(nums);
        }

        public void reverse(int[] nums,int start,int end){
            int temp;
            while (start<end){
                temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

    }
}
