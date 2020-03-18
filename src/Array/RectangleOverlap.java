package Array;

import java.util.HashSet;
import java.util.Set;

public class RectangleOverlap {
    public static void main(String[] argv) {
        RectangleOverlap d = new RectangleOverlap();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.print(s.isRectangleOverlap(new int[]{0,0,2,2},new int[]{1,1,3,3}));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
            return !(rec1[2] <= rec2[0] || rec1[3] <= rec2[1] || rec1[0] >= rec2[2] || rec1[1] >= rec2[3]);
        }
    }

}
    