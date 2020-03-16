package BreadthFirstSearch;

import java.util.Stack;

public class MaxAreaOfIsland {
    public static void main(String[] argv){
        MaxAreaOfIsland b = new MaxAreaOfIsland();
        b.out();
    }

    public void out() {
        Solution s = new Solution();
//        int[][] n = new int[][]{{2,1,1},{1,1,0},{0,1,1}};
//        int[][] n = new int[][]{{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
//                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
//                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
//                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};

        int [][] n = new int[][]{{1,1,0,0,0},
                                {1,1,0,0,0},
                                {0,0,0,1,1},
                                {0,0,0,1,1}};
        System.out.println(s.maxAreaOfIsland(n));
    }
    class Solution {
        public int maxAreaOfIsland(int[][] grid) {
            int ylength = grid.length;
            int xlength = grid[0].length;
            int max = 0;
            int count = 0;
            int[] xList = new int[]{-1,0,0,1};
            int[] yList = new int[]{0,-1,1,0};
            Stack<int[]> stack = new Stack<>();
            for(int i=0;i<ylength;i++){
                for(int j=0;j<xlength;j++){
                    if(grid[i][j] == 1){
                        stack.push(new int[]{i,j});
                        while (!stack.isEmpty()){
                            int[] point = stack.pop();
                            if(grid[point[0]][point[1]] ==1){
                                grid[point[0]][point[1]] = 0;
                                count++;
                            }
                            for(int k=0;k<xList.length;k++){
                                int nx = point[1]+xList[k];
                                int ny = point[0]+yList[k];
                                if(0<=nx && nx<xlength && 0<=ny && ny<ylength && grid[ny][nx] == 1){
                                    stack.push(new int[]{ny,nx});
                                }
                            }
                        }
                        max = Math.max(count,max);
                        count = 0;
                    }
                }
            }
            return max;
        }
    }
}
