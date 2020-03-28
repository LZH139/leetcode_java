package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FirstUniqueCharacterInAString {
    public static void main(String[] argv) {
        FirstUniqueCharacterInAString d = new FirstUniqueCharacterInAString();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.print(s.firstUniqChar("loveleetcode"));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int firstUniqChar(String s) {
            int[] countlist = new int[26];
            int n=s.length();
            for(int i=0;i<n;i++){
               countlist[s.charAt(i)-'a']++;
            }
            for(int i=0;i<n;i++){
                if(countlist[s.charAt(i)-'a']==1){
                    return i;
                }
            }
            return -1;
        }
    }

}
    