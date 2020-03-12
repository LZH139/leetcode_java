package Array;

import java.util.HashSet;
import java.util.Set;

public class ImageSmoother {
    public static void main(String[] argv) {
        ImageSmoother d = new ImageSmoother();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[][] n = new int[][]{{1,1,1},{1,0,1},{1,1,1}};
        int[][] n1 = new int[][]{{1}};
        System.out.print(s.imageSmoother(n1));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    class Solution {
        public int[][] imageSmoother(int[][] M) {
            int sum = 0;
            int count = 0;
            int[] x = new int[]{0,0,0,-1,-1,-1,1,1,1};
            int[] y = new int[]{0,-1,1,0,-1,1,0,-1,1};
            int xLength = M[0].length;
            int yLength = M.length;
            int[][] m = new int[yLength][xLength];
            for(int i=0;i<yLength;i++){
                for(int j=0;j<xLength;j++){
                    for(int k=0;k<y.length;k++){
                        int nx = j+x[k];
                        int ny = i+y[k];
                        if(nx>=0 && nx<xLength && ny>=0 && ny<yLength){
                            sum+=M[ny][nx];
                            count++;
                        }
                    }
                    m[i][j] = sum/count;
                    sum = 0;
                    count = 0;
                }
            }
            return m;
        }
    }

}
    