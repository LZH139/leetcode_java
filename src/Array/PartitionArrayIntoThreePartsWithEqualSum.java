package Array;

import java.util.HashSet;
import java.util.Set;

public class PartitionArrayIntoThreePartsWithEqualSum {
    public static void main(String[] argv) {
        PartitionArrayIntoThreePartsWithEqualSum d = new PartitionArrayIntoThreePartsWithEqualSum();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1,-1,1,-1};
        System.out.print(s.canThreePartsEqualSum(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public boolean canThreePartsEqualSum(int[] A) {
            int s = 0;
            for(int a: A){
                s+=a;
            }
            if(s%3!=0){
                return false;
            }
            s = s/3;
            int i = 0;
            int j = A.length-1;
            int si = A[i];
            int sj = A[j];
            while (j-i>1){
                if(si == s && sj == s){
                    return true;
                }
                if(si!=s){
                    i++;
                    si = si + A[i];
                }
                if(sj!=s){
                    j--;
                    sj = sj + A[j];
                }

            }
            return false;

        }
    }

}
    