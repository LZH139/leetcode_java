package Array;

import java.util.HashSet;
import java.util.Set;

public class MonotonicArray {
    public static void main(String[] argv) {
        MonotonicArray d = new MonotonicArray();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1,2,2,3};
        System.out.print(s.isMonotonic(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public boolean isMonotonic(int[] A) {
            int i = 0;
            int j = 0;
            for(int k=0;k<A.length-1;k++){
                if(A[k]<A[k+1]){
                    i++;
                }else if(A[k]>A[k+1]){
                    j++;
                }
                if(i!=0&&j!=0){
                    return false;
                }
            }
            return i*j==0;
        }
    }

}
    