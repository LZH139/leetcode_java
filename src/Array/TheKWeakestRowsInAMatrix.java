package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TheKWeakestRowsInAMatrix {
    public static void main(String[] argv) {
        TheKWeakestRowsInAMatrix d = new TheKWeakestRowsInAMatrix();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[][] n = new int[][]{{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        System.out.print(s.kWeakestRows(n,3));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int[] kWeakestRows(int[][] mat, int k) {
            int[] list = new int[mat.length];
            int[] result = new int[k];
            for(int i=0;i<mat.length;i++){
                list[i] = count(mat[i])*1000+i;
            }
            Arrays.sort(list);
            for(int i=0;i<k;i++){
                result[i] = list[i]%1000;
            }
            return result;
        }

        public int count(int[] nums){
            int sum=0;
            for(int n:nums){
                if(n!=1){
                    break;
                }
                sum+=n;
            }
            return sum;
        }
    }

}
    