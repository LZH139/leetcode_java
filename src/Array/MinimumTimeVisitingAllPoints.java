package Array;

import java.util.HashSet;
import java.util.Set;

public class MinimumTimeVisitingAllPoints {
    public static void main(String[] argv) {
        MinimumTimeVisitingAllPoints d = new MinimumTimeVisitingAllPoints();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[][] n = new int[][]{{1,1},{3,4},{-1,0}};
        System.out.print(s.minTimeToVisitAllPoints(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int minTimeToVisitAllPoints(int[][] points) {
            int time = 0;
            if(points.length==1){
                return time;
            }
            for(int i=1;i<points.length;i++){
                time += Math.max(Math.abs(points[i][0]-points[i-1][0]),Math.abs(points[i][1]-points[i-1][1]));
            }
            return time;
        }
    }

}
    