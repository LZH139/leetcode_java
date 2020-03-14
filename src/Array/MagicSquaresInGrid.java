package Array;

import java.util.HashSet;
import java.util.Set;

public class MagicSquaresInGrid {
    public static void main(String[] argv) {
        MagicSquaresInGrid d = new MagicSquaresInGrid();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[][] n = new int[][]{{4,3,8,4},{9,5,1,9},{2,7,6,2}};
        System.out.print(s.numMagicSquaresInside(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int numMagicSquaresInside(int[][] grid) {
            int R = grid.length, C = grid[0].length;
            int ans = 0;
            for (int r = 0; r < R-2; ++r)
                for (int c = 0; c < C-2; ++c) {
                    if (grid[r+1][c+1] != 5) continue;  // optional skip
                    if (magic(grid[r][c], grid[r][c+1], grid[r][c+2],
                            grid[r+1][c], grid[r+1][c+1], grid[r+1][c+2],
                            grid[r+2][c], grid[r+2][c+1], grid[r+2][c+2]))
                        ans++;
                }

            return ans;
        }

        public boolean magic(int... vals) {
            int[] count = new int[16];
            for (int v: vals){
                count[v]++;
            }
            for (int v = 1; v <= 9; ++v){
                if (count[v] != 1){
                    return false;
                }

            }


            return (vals[0] + vals[1] + vals[2] == 15 &&
                    vals[3] + vals[4] + vals[5] == 15 &&
                    vals[6] + vals[7] + vals[8] == 15 &&
                    vals[0] + vals[3] + vals[6] == 15 &&
                    vals[1] + vals[4] + vals[7] == 15 &&
                    vals[2] + vals[5] + vals[8] == 15 &&
                    vals[0] + vals[4] + vals[8] == 15 &&
                    vals[2] + vals[4] + vals[6] == 15);
        }
    }

}
    