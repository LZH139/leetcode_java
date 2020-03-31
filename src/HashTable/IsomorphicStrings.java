package HashTable;

import java.util.HashSet;
import java.util.Set;

public class IsomorphicStrings {
    public static void main(String[] argv) {
        IsomorphicStrings d = new IsomorphicStrings();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        System.out.print(s.isIsomorphic("ab","aa"));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public boolean isIsomorphic(String s, String t) {
            return helper(s,t) && helper(t,s);
        }

        public boolean helper(String s, String t){
            int[] list = new int[127];
            int slength = s.length();
            for(int i=0;i<slength;i++){
                if(list[s.charAt(i)] == 0) {
                    list[s.charAt(i)] = t.charAt(i);
                }else{
                    if(list[s.charAt(i)] != t.charAt(i)){
                        return false;
                    }
                }
            }
            return true;
        }

    }

}
    