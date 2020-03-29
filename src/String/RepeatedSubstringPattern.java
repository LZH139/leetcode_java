package String;

import java.util.HashSet;
import java.util.Set;

public class RepeatedSubstringPattern {
    public static void main(String[] argv) {
        RepeatedSubstringPattern d = new RepeatedSubstringPattern();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        String str = "abc";
        System.out.print(s.repeatedSubstringPattern(str));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public boolean repeatedSubstringPattern(String s) {
            String str = s + s;
            return str.substring(1, str.length() - 1).contains(s);
        }
    }

}
    