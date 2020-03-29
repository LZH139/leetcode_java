package String;

import java.util.HashSet;
import java.util.Set;

public class StringCompression {
    public static void main(String[] argv) {
        StringCompression d = new StringCompression();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
//        char[] ch = new char[]{'a','a','b','b','c','c','c'};
//        char[] ch = new char[]{'a','a','a','b','b','a','a'};
        char[] ch = new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.print(s.compress(ch));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int compress(char[] chars) {
            int anchor = 0, write = 0;
            for (int read = 0; read < chars.length; read++) {
                if (read + 1 == chars.length || chars[read + 1] != chars[read]) {
                    chars[write++] = chars[anchor];
                    if (read > anchor) {
                        for (char c: ("" + (read - anchor + 1)).toCharArray()) {
                            chars[write++] = c;
                        }
                    }
                    anchor = read + 1;
                }
            }
            return write;
        }
    }


}
    