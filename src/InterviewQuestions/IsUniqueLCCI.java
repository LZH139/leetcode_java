package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class IsUniqueLCCI {
    public static void main(String[] argv) {
        IsUniqueLCCI d = new IsUniqueLCCI();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        String str = "leetcode";
        System.out.print(s.isUnique(str));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public boolean isUnique(String astr) {
            Set<Integer> set = new HashSet<>();
            for(int i=0;i<astr.length();i++){
                if(set.contains((int)astr.charAt(i))){
                    return false;
                }else{
                    set.add((int)astr.charAt(i));
                }
            }
            return true;
        }
    }

}
    