package Array;

import java.util.HashSet;
import java.util.Set;

public class FlippingAnImage {
    public static void main(String[] argv) {
        FlippingAnImage d = new FlippingAnImage();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[][] n = new int[][]{{1,1,0},{1,0,1},{0,0,0}};
        System.out.print(s.flipAndInvertImage(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int[][] flipAndInvertImage(int[][] A) {
            int ylength = A.length;
            int xlength = A[0].length-1;
            int[][] result = new int[ylength][xlength+1];
            for(int i=0;i<ylength;i++){
                for(int j=xlength;j>=0;j--){
                    result[i][xlength-j] = A[i][j] == 0?1:0;
                }
            }
            return result;
        }
    }

}
    