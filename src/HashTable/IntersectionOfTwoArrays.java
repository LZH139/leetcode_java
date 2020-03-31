package HashTable;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] argv) {
        IntersectionOfTwoArrays d = new IntersectionOfTwoArrays();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n1 = new int[]{4,9,5};
        int[] n2 = new int[]{9,4,9,8,4};
        System.out.print(s.intersection(n1,n2));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            int[] count = new int[1000];
            List<Integer> res = new ArrayList<>();
            for(int i=0;i<nums1.length;i++){
                count[nums1[i]]++;
            }

            for (int value : nums2) {
                if (count[value] != 0) {
                    res.add(value);
                    count[value] = 0;
                }
            }
            int[] result = new int[res.size()];
            for(int i=0;i<result.length;i++){
                result[i] = res.get(i);
            }
            return result;
        }
    }

}
    