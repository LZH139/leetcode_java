package Array;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class BinaryPrefixDivisibleBy5 {
    public static void main(String[] argv) {
        BinaryPrefixDivisibleBy5 d = new BinaryPrefixDivisibleBy5();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1};
        System.out.print(s.prefixesDivBy5(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public List<Boolean> prefixesDivBy5(int[] A) {
            List<Boolean> res = new LinkedList<>();
            int sum=0;
            for(int i=0;i<A.length;i++){
                sum = sum<<1;
                sum=sum+A[i];
                sum = sum%5;
                System.out.print(sum+" ");
                res.add(sum%5==0);
            }
            return res;
        }
    }

}
    