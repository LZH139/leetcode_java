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
        int[] n = new int[]{17,18,5,4,6,1};
        System.out.print(s.replaceElements(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int[] replaceElements(int[] arr) {
            int max = -1;
            int temp;
            for(int i=arr.length-1;i>=0;i--){
                temp = arr[i];
                arr[i] = max;
                max = Math.max(temp, max);
            }
            return arr;
        }
    }

}
    