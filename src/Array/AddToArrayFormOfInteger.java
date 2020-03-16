package Array;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AddToArrayFormOfInteger {
    public static void main(String[] argv) {
        AddToArrayFormOfInteger d = new AddToArrayFormOfInteger();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.print(s.addToArrayForm(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public List<Integer> addToArrayForm(int[] A, int K) {

        }
    }

}
    