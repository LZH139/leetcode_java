package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SquaresOfASortedArray {
    public static void main(String[] argv) {
        SquaresOfASortedArray d = new SquaresOfASortedArray();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{-4,-1,0,3,10};
        printArray(s.sortedSquares(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int[] sortedSquares(int[] A) {
            for(int i=0;i<A.length;i++){
                A[i] = A[i]*A[i];
            }
            Arrays.sort(A);
            return A;
        }
    }

}
    