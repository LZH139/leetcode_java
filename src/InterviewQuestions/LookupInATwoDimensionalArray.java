package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class LookupInATwoDimensionalArray {
    public static void main(String[] argv) {
        LookupInATwoDimensionalArray d = new LookupInATwoDimensionalArray();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[][] n = new int[][]{{1,   4,  7, 11, 15},{2,   5,  8, 12, 19},{3,   6,  9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        System.out.print(s.findNumberIn2DArray(n,5));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public boolean findNumberIn2DArray(int[][] matrix, int target) {
            int y = matrix.length;
            int x = matrix[0].length;
            if(y==0){
                return false;
            }
            for(int i=0;i<y;i++){
                if(matrix[i][x-1]<target){
                    continue;
                }
                for(int j=0;j<x;j++){
                    if(matrix[i][j] == target){
                        return true;
                    }else if(matrix[i][j] > target){
                        break;
                    }
                }
            }
            return false;
        }
    }

}
    