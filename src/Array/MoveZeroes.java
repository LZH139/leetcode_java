package Array;

public class MoveZeroes {
    public static void main(String[] argv){
        MoveZeroes d = new MoveZeroes();
        d.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{0,1,0,3,12};
        s.moveZeroes(n);
    }

    public void printArray(int [] nums){
        for(int num:nums){
            System.out.print(num+" ");
        }
    }

    class Solution {
        public void moveZeroes(int[] nums) {
            int cura = 0;
            int curb = 0;
            int temp;
            while (curb<nums.length){
                if(nums[curb]==0){
                    cura = curb;
                    while (nums[cura] == 0 && cura<nums.length-1){
                        cura++;
                    }
                    if(nums[cura] == 0){
                        return;
                    }
                    temp = nums[cura];
                    nums[cura] = nums[curb];
                    nums[curb] = temp;
                }
                curb++;
            }
        }
    }
}
