package Array;

import java.util.*;

public class Shift2DGrid {
    public static void main(String[] argv) {
        Shift2DGrid d = new Shift2DGrid();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[][] n = new int[][]{{3,8,1,9},{19,7,2,5},{4,6,11,10},{12,0,21,13}};
        System.out.print(s.shiftGrid(n,4));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public List<List<Integer>> shiftGrid(int[][] grid, int k) {
            int y = grid.length;
            int x = grid[0].length;
            List<List<Integer>> result = new ArrayList<>();
            for(int i=0;i<grid.length;i++){
                ArrayList<Integer> list = new ArrayList<>();
                for(int j=0;j<x;j++){
                    list.add(0);
                }
                result.add(list);
            }

            for(int i=0;i<y;i++){
                for(int j=0;j<x;j++){
                    result.get(((j+k)/x+i)%y).set((j+k)%x,grid[i][j]);
                }
            }

            return result;
        }
    }

}
    