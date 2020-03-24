package Array;

import java.util.HashSet;
import java.util.Set;

public class PlayWithChips {
    public static void main(String[] argv) {
        PlayWithChips d = new PlayWithChips();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.print(s.minCostToMoveChips(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int minCostToMoveChips(int[] chips) {
            int odd = 0, even = 0;
            for (int i = 0; i < chips.length; i++) {
                if (chips[i] % 2 == 0) {
                    even++;
                } else if (chips[i] % 2 != 0) {
                    odd++;
                }
            }
            return Math.min(even, odd);
        }
    }

}
    