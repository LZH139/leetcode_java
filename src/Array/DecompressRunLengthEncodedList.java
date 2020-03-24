package Array;

import java.util.HashSet;
import java.util.Set;

public class DecompressRunLengthEncodedList {
    public static void main(String[] argv) {
        DecompressRunLengthEncodedList d = new DecompressRunLengthEncodedList();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1,1,2,3};
        System.out.print(s.decompressRLElist(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int[] decompressRLElist(int[] nums) {
            int length=0;
            for(int i=0;i<nums.length;i+=2){
                length+=nums[i];
            }
            int[] result = new int[length];
            int cursor=0;
            for(int i=0;i<nums.length;i+=2){
                for(int j=0;j<nums[i];j++){
                    result[cursor] = nums[i+1];
                    cursor++;
                }
            }
            return result;
        }
    }

}
    