package Array;

public class MissingNumber {
    public static void main(String[] argv){
        MissingNumber d = new MissingNumber();
        d.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{3,0,1};
        System.out.print(s.missingNumber(n));
    }

    public void printArray(int [] nums){
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
    class Solution {
        public int missingNumber(int[] nums) {
            int result = nums.length;
            for(int i=0;i<nums.length;i++){
                result = result^nums[i]^i;
            }
            return result;
        }
    }

}
