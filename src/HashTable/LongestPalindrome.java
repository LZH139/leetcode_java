package HashTable;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {
    public static void main(String[] argv) {
        LongestPalindrome d = new LongestPalindrome();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        String str = "abc";
        System.out.print(s.longestPalindrome("bba"));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int longestPalindrome(String s) {
            int[] list = new int['z'-'A'+1];
            int sl=s.length();
            int sum=0;
            int count=0;
            for(int i=0;i<sl;i++){
                list[s.charAt(i)-'A']++;
            }
            for(int i=0;i<list.length;i++){
                sum+=list[i];
                if((list[i]&1)!=0){
                    count++;
                }
            }
            return count==0?sum:sum-count+1;
        }
    }
}
    