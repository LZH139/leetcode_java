package Array;

import java.util.HashSet;
import java.util.Set;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public static void main(String[] argv) {
        ReplaceElementsWithGreatestElementOnRightSide d = new ReplaceElementsWithGreatestElementOnRightSide();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.print(s.replaceElements(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int[] replaceElements(int[] arr) {

        }
    }

}
    