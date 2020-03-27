package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class PrintMatrixClockwise {
    public static void main(String[] argv) {
        PrintMatrixClockwise d = new PrintMatrixClockwise();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[][] n = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.print(s.spiralOrder(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int[] spiralOrder(int[][] matrix) {
            int y = matrix.length;
            if(y==0){
                return new int[0];
            }
            int x = matrix[0].length;
            if(x==0){
                return new int[0];
            }
            int l = 0;
            int r = x-1;
            int u = 0;
            int b = y-1;
            int cur = 0;
            int[] result = new int[x*y];
            while (true){
                for(int i=l;i<=r;i++){
                    result[cur++] = matrix[u][i];
                }
                if(++u>b){
                    break;
                }
                for(int i=u;i<=b;i++){
                    result[cur++] = matrix[i][r];
                }
                if(--r<l){
                    break;
                }
                for(int i=r;i>=l;i--){
                    result[cur++] = matrix[b][i];
                }
                if(--b<u){
                    break;
                }
                for(int i=b;i>=u;i--){
                    result[cur++] = matrix[i][l];
                }
                if(++l>r){
                    break;
                }
            }

            return result;

        }
    }

}
    