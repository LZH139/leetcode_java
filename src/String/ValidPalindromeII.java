package String;

import java.util.HashSet;
import java.util.Set;

public class ValidPalindromeII {
    public static void main(String[] argv) {
        ValidPalindromeII d = new ValidPalindromeII();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        String str = "abc";
        System.out.print(s.validPalindrome(str));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public boolean validPalindrome(String s) {
           return validPalindrome(s,0);
        }

        public boolean validPalindrome(String s, int times) {
            if(s == null || s.isEmpty()){
                return true;
            }
            int head = 0;
            int tail = s.length()-1;
            while (head<tail){
                if(s.charAt(head)!=s.charAt(tail)){
                    if (times == 1){
                        return false;
                    }
                    return validPalindrome(s.substring(head,tail),1) || validPalindrome(s.substring(head+1,tail+1),1);
                }else{
                    head++;
                    tail--;
                }
            }
            return true;
        }
    }

}
    