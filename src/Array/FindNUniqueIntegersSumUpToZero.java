package Array;

import java.util.HashSet;
import java.util.Set;

public class FindNUniqueIntegersSumUpToZero {
    public static void main(String[] argv) {
        FindNUniqueIntegersSumUpToZero d = new FindNUniqueIntegersSumUpToZero();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.print(s.sumZero(1));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int[] sumZero(int n) {
            int[] result = new int[n];
            if(n==1){
                return result;
            }
            int temp = 0;
            int i=0;
            for(;i<n/2;i++){
                result[i] = -(++temp);
            }
            if(n%2==1){
                result[++i] = 0;
            }
            for(;i<n;i++){
                result[i] = temp--;
            }
            return result;
        }
    }

}
    