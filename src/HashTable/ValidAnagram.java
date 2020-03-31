package HashTable;

import java.util.HashSet;
import java.util.Set;

public class ValidAnagram {
    public static void main(String[] argv) {
        ValidAnagram d = new ValidAnagram();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        String str = "abc";
        System.out.print(s.isAnagram("aacc", "ccac"));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public boolean isAnagram(String s, String t) {
            if(s.length()!=t.length()){
                return false;
            }
            return helper(s,t) && helper(t,s);
        }

        public boolean helper(String s,String t){
            int list[] = new int[128];
            int slength = s.length();
            int tlength = t.length();
            for(int i=0;i<slength;i++){
                list[s.charAt(i)]++;
            }
            for(int i=0;i<tlength;i++){
                if(list[t.charAt(i)]-- == 0){
                    return false;
                }
            }
            return true;
        }
    }

}
    