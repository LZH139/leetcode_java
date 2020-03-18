package Array;

import java.util.HashSet;
import java.util.Set;

public class RelativeSortArray {
    public static void main(String[] argv) {
        RelativeSortArray d = new RelativeSortArray();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.print(s.relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19},new int[]{2,1,4,3,9,6}));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {
            int[] countlist = new int[1001];
            int[] result = new int[arr1.length];
            int cursor = 0;
            for(int i=0;i<arr1.length;i++){
                countlist[arr1[i]]++;
            }
            for(int i=0;i<arr2.length;i++){
                while (countlist[arr2[i]]!=0){
                    result[cursor] = arr2[i];
                    countlist[arr2[i]]--;
                    cursor++;
                }
            }
            for(int i=0;i<1001;i++){
                while (countlist[i]!=0){
                    result[cursor] = i;
                    countlist[i]--;
                    cursor++;
                }
            }
            return result;
        }
    }

}
    