package Array;

import java.util.HashSet;
import java.util.Set;

public class FindPivotIndex {
    public static void main(String[] argv) {
        FindPivotIndex d = new FindPivotIndex();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{-1,-1,-1,-1,-1,0};
        System.out.print(s.pivotIndex(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int pivotIndex(int[] nums) {
            int sum = 0;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
            }
            int temp = 0;
            for(int i=0;i<nums.length;i++){
                temp += nums[i];
                if(temp -nums[i] == sum-temp){
                    return i;
                }
            }
            return -1;
        }
    }

}
    