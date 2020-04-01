package HashTable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArraysII {
    public static void main(String[] argv) {
        IntersectionOfTwoArraysII d = new IntersectionOfTwoArraysII();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n1 = new int[]{4,9,5};
        int[] n2 = new int[]{9,4,9,8,4};
        System.out.print(s.intersect(n1,n2));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int i=0;
            int j=0;
            int k=0;
            while (i<nums1.length && j<nums2.length){
                if(nums1[i]<nums2[j]){
                    i++;
                }else if(nums1[i]>nums2[j]){
                    j++;
                }else{
                    nums1[k++] = nums1[i++];
                    j++;
                }
            }
            return Arrays.copyOfRange(nums1,0,k);
        }
    }

}
    