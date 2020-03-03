package Array;

import java.util.HashSet;
import java.util.Set;

public class KdiffPairsInAnArray {
    public static void main(String[] argv) {
        KdiffPairsInAnArray d = new KdiffPairsInAnArray();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{3, 1, 4, 1, 5};
        System.out.print(s.findPairs(n,2));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int findPairs(int[] nums, int k) {
            Set<Integer> set = new HashSet<>();
            Set<Integer> sameSet = new HashSet<>();
            int count = 0;
            if(k<0){
                return count;
            }
            for(int i=0;i<nums.length;i++){
                if(k==0){
                    if(set.contains(nums[i]) && !sameSet.contains(nums[i])){
                        sameSet.add(nums[i]);
                        count++;
                    }
                }else if(!set.contains(nums[i])){
                    if(set.contains(nums[i]+k)){
                        count++;
                    }
                    if(set.contains(nums[i]-k)){
                        count++;
                    }
                }
                set.add(nums[i]);
            }
            return count;
        }
    }
}
