package Array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {
    public static void main(String[] argv){
        ContainsDuplicateII d = new ContainsDuplicateII();
        d.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{1,0,1,1};
        System.out.print(s.containsNearbyDuplicate(n,1));
    }

    public void printArray(int [] nums){
        for(int num:nums){
            System.out.print(num+" ");
        }
    }

    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            Set<Integer> set = new HashSet<>();
            for(int i=0;i<nums.length;i++){
                if(set.size()>k){
                    set.remove(nums[i-k-1]);
                }
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
