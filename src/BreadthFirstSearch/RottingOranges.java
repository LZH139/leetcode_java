package BreadthFirstSearch;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RottingOranges {
    public static void main(String[] argv){
        RottingOranges b = new RottingOranges();
        b.out();
    }

    public void out(){
        Solution s = new Solution();
//        int[][] n = new int[][]{{2,1,1},{1,1,0},{0,1,1}};
        int[][] n = new int[][]{{2,1,1},{0,1,1},{1,0,1}};
        System.out.println(s.orangesRotting(n));
    }

    class Solution {
        public int orangesRotting(int[][] grid) {
            int sum = 0;
            int[] dr = new int[]{-1,1,0,0};
            int[] dc = new int[]{0,0,-1,1};
            int gridR = grid.length;
            int gridC = grid[0].length;
            Queue<Integer> q = new LinkedList<>();
            for(int i=0;i<gridR;i++){
                for(int j=0;j<gridC;j++){
                    if(grid[i][j] == 2) {
                        q.offer(i * 10 + j);
                        sum++;
                    }else if(grid[i][j] != 0){
                        sum++;
                    }
                }
            }
            int count = q.size();
            int code;
            int min = 0;
            int r;
            int c;
            int nr;
            int nc;
            boolean flag = false;
            while (!q.isEmpty()){
               int size = q.size();
               for(int s=0;s<size;s++){
                   code = q.poll();
                   r = code/10;
                   c = code%10;
                   for(int i=0;i<4;i++){
                       nr = r+dr[i];
                       nc = c+dc[i];
                       if(nr>=0 && nr<gridR && nc>=0 && nc<gridC){
                           if(grid[nr][nc]==1){
                               grid[nr][nc] = 2;
                               q.offer(nr*10+nc);
                               count++;
                               flag = true;
                           }
                       }
                   }
               }
               if(flag){
                   min++;
                   flag = false;
               }

            }
            return sum>count?-1:min;

        }
    }

}
