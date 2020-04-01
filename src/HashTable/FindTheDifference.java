package HashTable;

import java.util.HashSet;
import java.util.Set;

public class FindTheDifference {
    public static void main(String[] argv) {
        FindTheDifference d = new FindTheDifference();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        String str = "abc";
        System.out.print(s.findTheDifference("abcd","abcde"));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public char findTheDifference(String s, String t) {
            int[] list = new int['z'-'a'+1];
            int sl = s.length();
            int tl = t.length();
            for(int i=0;i<sl;i++){
                list[s.charAt(i)-'a']++;
            }

            for(int i=0;i<tl;i++){
                if(list[t.charAt(i)-'a']-- <=0){
                    return t.charAt(i);
                }
            }

            return 'a';

        }
    }

}
    