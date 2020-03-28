package DepthFirstSearch;

import java.util.HashSet;
import java.util.Set;

public class FloodFill {
    public static void main(String[] argv) {
        FloodFill d = new FloodFill();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
//        int[][] n = new int[][]{{1,1,1},{1,1,0},{1,0,1}};
        int[][] n = new int[][]{{0,0,0},{0,1,1}};
        int[][] img = s.floodFill(n,1,1,1);
        System.out.print(1);
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            if(image[sr][sc] != newColor){
                dfs(image, sr, sc, newColor,image[sr][sc]);
            }
            return image;
        }

        public void dfs(int[][] image, int sr, int sc, int newColor, int oldColor){
            if(image[sr][sc]==oldColor){
                image[sr][sc] = newColor;
                if(sr>=1){
                    dfs(image, sr-1, sc, newColor,oldColor);
                }
                if(sc>=1){
                    dfs(image, sr, sc-1, newColor,oldColor);
                }
                if(sr<image.length-1){
                    dfs(image, sr+1, sc, newColor,oldColor);
                }
                if(sc<image[0].length-1){
                    dfs(image, sr, sc+1, newColor,oldColor);
                }
            }
        }

    }

}
    