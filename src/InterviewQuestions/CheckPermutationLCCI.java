package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class CheckPermutationLCCI {
    public static void main(String[] argv) {
        CheckPermutationLCCI d = new CheckPermutationLCCI();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        String str1 = "abc";
        String str2 = "bca";
        System.out.print(s.CheckPermutation(str1,str2));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public boolean CheckPermutation(String s1, String s2) {
            int[] str1 = new int[58];
            int[] str2 = new int[58];
            for(int i=0;i<s1.length();i++){
                str1[(short)s1.charAt(i)-65]++;
            }
            for(int i=0;i<s2.length();i++){
                str2[(short)s2.charAt(i)-65]++;
            }
            for(int i=0;i<str1.length;i++){
                if(str1[i]!=str2[i]){
                    return false;
                }
            }
            return true;
        }
    }

}
    