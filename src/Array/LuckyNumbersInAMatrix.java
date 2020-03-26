package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LuckyNumbersInAMatrix {
    public static void main(String[] argv) {
        LuckyNumbersInAMatrix d = new LuckyNumbersInAMatrix();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[][] n = new int[][]{{3,7,8},{9,11,13},{15,16,17}};
        System.out.print(s.luckyNumbers(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public List<Integer> luckyNumbers (int[][] matrix) {
            int[][] min = new int[matrix.length][2];
            int temp = Integer.MAX_VALUE;
            int y = matrix.length;
            int x = matrix[0].length;
            List<Integer> result = new ArrayList<>();
            for(int i=0;i<y;i++){
                for(int j=0;j<x;j++){
                    if(temp>matrix[i][j]){
                        temp = matrix[i][j];
                        min[i][0] = temp;
                        min[i][1] = j;
                    }
                }
                temp = Integer.MAX_VALUE;
            }
            int tempmin;
            int position;
            for(int i=0;i<min.length;i++){
                tempmin = min[i][0];
                position = min[i][1];
                for(int j=0;j<y;j++){
                    if(matrix[j][position]>tempmin){
                        break;
                    }
                    if(j==y-1){
                        result.add(tempmin);
                    }
                }
            }
            return result;
        }
    }

}
    