package String;

import java.util.HashSet;
import java.util.Set;

public class RepeatedStringMatch {
    public static void main(String[] argv) {
        RepeatedStringMatch d = new RepeatedStringMatch();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        String str = "abc";
        System.out.print(s.repeatedStringMatch(str, str));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int repeatedStringMatch(String A, String B) {
            int count = 0;
            while (A.length()<B.length()){
                A = A+A;
                count++;
              

            }
        }
    }

}
    