package Array;

import java.util.HashSet;
import java.util.Set;

public class ValidMountainArray {
    public static void main(String[] argv) {
        ValidMountainArray d = new ValidMountainArray();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{2,1};
        System.out.print(s.validMountainArray(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public boolean validMountainArray(int[] A) {
            int N = A.length;
            int i=0;
            while (i+1<N && A[i]<A[i+1]){
                i++;
            }
            if(i == 0 || i==N-1){
                return false;
            }
            while (i+1<N && A[i]>A[i+1]){
                i++;
            }
            return i == N-1;
        }

    }

}
    