package String;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfAString {
    public static void main(String[] argv) {
        ReverseVowelsOfAString d = new ReverseVowelsOfAString();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.print(s.reverseVowels("leetcode"));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public String reverseVowels(String s) {
            int head = 0;
            int tail = s.length()-1;
            char[] list = s.toCharArray();
            char temp;
            while (tail>head){
                while (!isVowels(list[tail]) && tail>head){
                    tail--;
                }
                while (!isVowels(list[head]) && tail>head){
                    head++;
                }
                temp = list[head];
                list[head++] = list[tail];
                list[tail--] = temp;
            }
            return String.valueOf(list);
        }

        public boolean isVowels(char ch){
            return  ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    ||ch=='A'|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';

        }
    }

}
    