package Array;

import java.util.LinkedList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] argv) {
        FindAllNumbersDisappearedInAnArray d = new FindAllNumbersDisappearedInAnArray();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{4,3,2,7,8,2,3,1};
        System.out.print(s.findDisappearedNumbers(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            List<Integer> list = new LinkedList<>();
            for(int num:nums){
                int index = Math.abs(num)-1;
                nums[index] = Math.abs(nums[index]) * (-1);
            }
            for(int i=0;i<nums.length;i++){
                if(nums[i]>0){
                    list.add(i+1);
                }
            }
            return list;
        }
    }
}
