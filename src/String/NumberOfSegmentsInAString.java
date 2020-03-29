package String;

import java.util.HashSet;
import java.util.Set;

public class NumberOfSegmentsInAString {
    public static void main(String[] argv) {
        NumberOfSegmentsInAString d = new NumberOfSegmentsInAString();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.print(s.countSegments("Hello, my name is John"));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    class Solution {
        public int countSegments(String s) {
            int n = s.length();
            int count=0;
            for(int i=0;i<n;i++){
                if((i==0 || s.charAt(i-1) == ' ') && s.charAt(i)!=' '){
                    count++;
                }
            }
            return count;
        }
    }

}
    