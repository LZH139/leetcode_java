package Array;

public class MaxConsecutiveOnes {
    public static void main(String[] argv) {
        MaxConsecutiveOnes d = new MaxConsecutiveOnes();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1,1,0,1,1,1};
        System.out.print(s.findMaxConsecutiveOnes(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int max = 0;
            int temp = 0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==1){
                    temp++;
                    if(temp>max){
                        max = temp;
                    }
                }else{
                    temp = 0;
                }
            }
            return max;
        }
    }
}
