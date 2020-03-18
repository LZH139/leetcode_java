package Array;

import java.util.*;

public class AddToArrayFormOfInteger {
    public static void main(String[] argv) {
        AddToArrayFormOfInteger d = new AddToArrayFormOfInteger();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1, 2, 3, 4, 5, 6, 7};
        s.addToArrayForm(new int[]{0},23);

    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public List<Integer> addToArrayForm(int[] A, int K) {
            int N = A.length;
            int cur = K;
            List<Integer> ans = new ArrayList();

            int i = N;
            while (--i >= 0 || cur > 0) {
                if (i >= 0) {
                    cur += A[i];
                }
                ans.add(cur % 10);
                cur /= 10;
            }

            Collections.reverse(ans);
            return ans;


        }
    }
}