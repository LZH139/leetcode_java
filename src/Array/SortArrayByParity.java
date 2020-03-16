package Array;

import java.util.HashSet;
import java.util.Set;

public class SortArrayByParity {
    public static void main(String[] argv) {
        SortArrayByParity d = new SortArrayByParity();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1};
        System.out.print(s.sortArrayByParity(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int[] sortArrayByParity(int[] A) {
            int[] result = new int[A.length];
            int l = 0;
            int r = A.length-1;
            for(int i=0;i<A.length;i++){
                if(A[i]%2==0){
                    result[l] = A[i];
                    l++;
                }else{
                    result[r] = A[i];
                    r--;
                }
            }
            return result;
        }
    }
}
    