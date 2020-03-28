package String;

import java.util.HashSet;
import java.util.Set;

public class RansomNote {
    public static void main(String[] argv) {
        RansomNote d = new RansomNote();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.print(s.canConstruct("aa","aab"));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            int[] list =new int[26];
            int index;
            for(int i=0;i<magazine.length();i++){
                list[magazine.charAt(i)-'a']++;
            }
            for(int i=0;i<ransomNote.length();i++){
                index = ransomNote.charAt(i)-'a';
                if(list[index]==0){
                    return false;
                }else{
                    list[index]--;
                }
            }
            return true;
        }
    }

}
    