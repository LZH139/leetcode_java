package HashTable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class KeyboardRow {
    public static void main(String[] argv) {
        KeyboardRow d = new KeyboardRow();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        String[] n = new String[]{"a","b"};
        System.out.print(s.findWords(n));

    }

    public void printArray(int[] nums) {
        System.out.print("{");
        for (int num : nums) {
            System.out.print(num + ","+" ");
        }
        System.out.print("}");
    }

    class Solution {
        public String[] findWords(String[] words) {
            int[][] list = new int[][]{{0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0},{1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},{0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1}};
            int k=0;
            int length;
            String tempw;
            for(String w:words){
                tempw = w;
                w = w.toLowerCase();
                for(int[] ls:list){
                    if(ls[w.charAt(0)-'a']!=0){
                        length = w.length();
                        for(int i=0;i<length;i++){
                            if(ls[w.charAt(i)-'a']==0){
                                break;
                            }
                            if(i == length-1 && ls[w.charAt(i)-'a']!=0){
                                words[k++] = tempw;
                            }
                        }
                    }
                }
            }
            return Arrays.copyOfRange(words,0,k);
        }
    }



}
    