package Array;

import java.util.HashSet;
import java.util.Set;

public class CheckIfItIsAStraightLine {
    public static void main(String[] argv) {
        CheckIfItIsAStraightLine d = new CheckIfItIsAStraightLine();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[][] n = new int[][]{{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        System.out.print(s.checkStraightLine(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public boolean checkStraightLine(int[][] coordinates) {
            if(coordinates.length==2){
                return true;
            }
            int y1 = coordinates[1][1]-coordinates[0][1];
            int x1 = coordinates[1][0]-coordinates[0][0];
            int x2;
            int y2;
            for(int i=2;i<coordinates.length;i++){
                x2 = coordinates[i][0]-coordinates[0][0];
                y2 = coordinates[i][1]-coordinates[0][1];
                if(x1*y2!=x2*y1){
                    return false;
                }
            }
            return true;
        }
    }

}
    