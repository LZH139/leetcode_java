package Array;

import java.util.HashSet;
import java.util.Set;

public class ToeplitzMatrix {
    public static void main(String[] argv) {
        ToeplitzMatrix d = new ToeplitzMatrix();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[][] n = new int[][]{{1,2,3,4},{5,1,2,3},{9,5,1,2}};
//        int[][] n = new int[][]{{1,2},{2,2}};
        System.out.print(s.isToeplitzMatrix(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public boolean isToeplitzMatrix(int[][] matrix) {
            Set<Integer> visted = new HashSet<>();
            int xlength = matrix[0].length;
            int ylength = matrix.length;
            int currx;
            int curry;
            int temp;
            int position;
            for(int i=0;i<ylength;i++){
                for(int j=0;j<xlength;j++){
                    position = i-j;
                    if(!visted.contains(position)){
                        currx = j;
                        curry = i;
                        temp = matrix[i][j];
                        while (0 <=currx && currx < xlength && 0<=curry && curry < ylength){
                            if(temp != matrix[curry][currx]){
                                return false;
                            }
                            currx++;
                            curry++;
                        }
                        visted.add(position);
                    }
                }
            }
            return true;
        }
    }

}
    