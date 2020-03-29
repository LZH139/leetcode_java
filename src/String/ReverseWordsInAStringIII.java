package String;

import java.util.HashSet;
import java.util.Set;

public class ReverseWordsInAStringIII {
    public static void main(String[] argv) {
        ReverseWordsInAStringIII d = new ReverseWordsInAStringIII();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        String str = "Let's take LeetCode contest";
        System.out.print(s.reverseWords(str));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public String reverseWords(String s) {
            char[] list = s.toCharArray();
            int n = list.length;
            int cur=0;
            for(int i=0;i<n;i++){
                if(list[i] == ' '){
                    reservelist(list,cur,i-1);
                    while (list[i] == ' '){
                        i++;
                    }
                    cur = i;
                }else if(i == n-1){
                    reservelist(list,cur,n-1);
                }
            }
            return String.valueOf(list);
        }

        public void reservelist(char[] list , int start, int end){
            char temp;
            while (end>start){
                temp = list[end];
                list[end] = list[start];
                list[start] = temp;
                end--;
                start++;
            }
        }
    }
}
    