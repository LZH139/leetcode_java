package String;

import java.util.HashSet;
import java.util.Set;

public class ReverseString {
    public static void main(String[] argv) {
        ReverseString d = new ReverseString();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        char[] n = new char[]{'h','e','l','l','o'};
        s.reverseString(n);
        System.out.print(1);
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public void reverseString(char[] s) {
            int head = 0;
            int tail = s.length-1;
            char temp;
            while (tail-head>=1){
                temp = s[head];
                s[head] = s[tail];
                s[tail] = temp;
                head++;
                tail--;
            }
        }
    }

}
    