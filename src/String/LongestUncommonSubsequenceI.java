package String;

import java.util.HashSet;
import java.util.Set;

public class LongestUncommonSubsequenceI {
    public static void main(String[] argv) {
        LongestUncommonSubsequenceI d = new LongestUncommonSubsequenceI();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        String str = "abc";
        System.out.print(s.findLUSlength(str,str));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public class Solution {
        public int findLUSlength(String a, String b) {
            if (a.equals(b)){
                return -1;
            }
            return Math.max(a.length(), b.length());
        }
    }


}
    