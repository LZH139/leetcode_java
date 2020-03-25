package Array;

import java.util.HashSet;
import java.util.Set;

public class CellsWithOddValuesInAMatrix {
    public static void main(String[] argv) {
        CellsWithOddValuesInAMatrix d = new CellsWithOddValuesInAMatrix();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[][] n = new int[][]{{0,1},{1,1}};
        System.out.print(s.oddCells(2,3, n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int oddCells(int n, int m, int[][] indices) {
            int[][] matrix = new int[n][m];
            int sum = 0;
            for(int[] in:indices){
                for(int i=0;i<m;i++){
                    matrix[in[0]][i]++;
                }
                for(int i=0;i<n;i++){
                    matrix[i][in[1]]++;
                }
            }
            for(int[] mat:matrix){
                for(int ma:mat){
                    if(ma%2!=0){
                        sum++;
                    }
                }
            }
            return sum;
        }
    }

}
    