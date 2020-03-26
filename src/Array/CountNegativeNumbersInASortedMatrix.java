package Array;

import java.util.HashSet;
import java.util.Set;

public class CountNegativeNumbersInASortedMatrix {
    public static void main(String[] argv) {
        CountNegativeNumbersInASortedMatrix d = new CountNegativeNumbersInASortedMatrix();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[][] n = new int[][]{{3,2},{1,0}};
        System.out.print(s.countNegatives(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int countNegatives(int[][] grid) {
            int sum = 0;
            for(int i=0;i<grid.length;i++){
                for(int j=grid[0].length-1;j>=0;j--){
                    if(grid[i][j]<0){
                        sum++;
                    }else{
                        break;
                    }
                }
            }
            return sum;

        }
    }

}
    