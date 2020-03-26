package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class PrintMatrixClockwise {
    public static void main(String[] argv) {
        PrintMatrixClockwise d = new PrintMatrixClockwise();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[][] n = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.print(s.spiralOrder(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int[] spiralOrder(int[][] matrix) {
            int y = matrix.length;
            if(y==0){
                return new int[0];
            }
            int x = matrix[0].length;
            if(x==0){
                return new int[0];
            }
            int[] result = new int[x*y];
            for(int i=0;i<y;i++){
                for(int j=0;j<x;j++){
                    result[x*i+j] = matrix[i][j];
                }
            }
            return result;

        }
    }

}
    