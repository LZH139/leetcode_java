package Array;

import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {
    public static void main(String[] argv) {
        FairCandySwap d = new FairCandySwap();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] A = new int[]{1,1};
        int[] B = new int[]{2,2};
        System.out.print(s.fairCandySwap(A,B));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int[] fairCandySwap(int[] A, int[] B) {
            int sumA = 0;
            int sumB = 0;
            Set<Integer> set = new HashSet<>();
            for(int i=0;i<A.length;i++){
                sumA+=A[i];
            }
            for(int j=0;j<B.length;j++){
                sumB+=B[j];
            }
            int delta = (sumB-sumA)/2;
            for(int x:B){
                set.add(x);
            }
            for(int y:A){
                if(set.contains(y+delta)){
                    return new int[]{y,y+delta};
                }
            }
            throw null;
        }
    }

}
    