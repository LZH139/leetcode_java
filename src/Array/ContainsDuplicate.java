package Array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] argv){
        ContainsDuplicate d = new ContainsDuplicate();
        d.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{1,2,3,4,5,6,7};
        System.out.print(s.containsDuplicate(n));
    }

    public void printArray(int [] nums){
        for(int num:nums){
            System.out.print(num+" ");
        }
    }

    class Solution {
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for(int i=0;i<nums.length;i++){
                if(set.contains(nums[i])){
                    return true;
                }else{
                    set.add(nums[i]);
                }
            }
            return false;
        }
    }
}
