package HashTable;

import java.util.*;

public class WordPattern {
    public static void main(String[] argv) {
        WordPattern d = new WordPattern();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        String str = "abc";
        System.out.print(s.wordPattern(str,str));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public boolean wordPattern(String pattern, String str) {
            if (pattern == null && str == null) {
                return true;
            }
            if (pattern == null || str == null) {
                return false;
            }
            String[] word = str.split(" ");
            if (pattern.length() != word.length) {
                return false;
            }
            Map<Object, Integer> mem = new HashMap<>();
            for (int i = 0; i < word.length; i++) {
                Integer pi = mem.put(pattern.charAt(i), i);
                Integer si = mem.put(word[i], i);
                if (!Objects.equals(pi, si)) {
                    return false;
                }
            }

            return true;
        }
    }


}
    