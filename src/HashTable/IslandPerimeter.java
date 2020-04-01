package HashTable;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class IslandPerimeter {
    public static void main(String[] argv) {
        IslandPerimeter d = new IslandPerimeter();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
//        int[][] n = new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        int[][] n = new int[][]{{1,1},{1,1}};
        System.out.print(s.islandPerimeter(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int islandPerimeter(int[][] grid) {
            for (int r = 0; r < grid.length; r++) {
                for (int c = 0; c < grid[0].length; c++) {
                    if (grid[r][c] == 1) {
                        // 题目限制只有一个岛屿，计算一个即可
                        return dfs(grid, r, c);
                    }
                }
            }
            return 0;
        }

        int dfs(int[][] grid, int r, int c) {
            if (!(0 <= r && r < grid.length && 0 <= c && c < grid[0].length)) {
                return 1;
            }
            if (grid[r][c] == 0) {
                return 1;
            }
            if (grid[r][c] != 1) {
                return 0;
            }
            grid[r][c] = 2;
            return dfs(grid, r - 1, c)
                    + dfs(grid, r + 1, c)
                    + dfs(grid, r, c - 1)
                    + dfs(grid, r, c + 1);
        }

    }

}
    