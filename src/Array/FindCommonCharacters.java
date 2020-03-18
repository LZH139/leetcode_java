package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindCommonCharacters {
    public static void main(String[] argv) {
        FindCommonCharacters d = new FindCommonCharacters();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        String[] n = new String[]{"bella","label","roller"};
        System.out.print(s.commonChars(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public List<String> commonChars(String[] A) {
            int[] last = null;
            List<String> result = new ArrayList<>();
            for(String s:A){
                if(last == null){
                    last = new int[26];
                    for(int i=0;i<s.length();i++){
                        last[s.charAt(i)-'a']++;
                    }
                }else{
                    int[] list = new int[26];
                    for(int i=0;i<s.length();i++){
                        list[s.charAt(i)-'a']++;
                    }
                    for(int i=0;i<last.length;i++){
                        last[i] = Math.min(last[i],list[i]);
                    }
                }
            }
            for(int i=0;i<last.length;i++){
                if(last[i]!=0){
                    for(int j=0;j<last[i];j++){
                        result.add(String.valueOf((char)(i+'a')));
                    }
                }
            }
            return result;
        }
    }

}
    