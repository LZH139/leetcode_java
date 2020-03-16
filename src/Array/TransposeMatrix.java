package Array;

import java.util.HashSet;
import java.util.Set;

public class TransposeMatrix {
    public static void main(String[] argv) {
        TransposeMatrix d = new TransposeMatrix();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
//        int[][] n = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] n = new int[][]{{1,2,3},{4,5,6}};
        System.out.print(s.transpose(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int[][] transpose(int[][] A) {
            int ylength = A.length;
            int xlength = A[0].length;
            int[][] result = new int[xlength][ylength];
            for(int i=0;i<xlength;i++){
                int[] temp = new int[ylength];
                for(int j=0;j<ylength;j++){
                    temp[j] = A[j][i];
                }
                result[i] = temp;
            }
            return result;
        }
    }

}
    