package String;

import java.util.HashSet;
import java.util.Set;

public class DetectCapital {
    public static void main(String[] argv) {
        DetectCapital d = new DetectCapital();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        String str = "FlaG";
        System.out.print(s.detectCapitalUse(str));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public boolean detectCapitalUse(String word) {
            int n = word.length();
            if(word.length() < 2){
                return true;
            }

            if(word.charAt(0) >= 97){
                for(int i=1;i<n;i++){
                    if(word.charAt(i)<97){
                        return false;
                    }
                }
            }else{
                if(word.charAt(1)<97){
                    for (int i=1;i<n;i++){
                        if(word.charAt(i)>=97){
                            return false;
                        }
                    }
                }else{
                    for (int i=1;i<n;i++){
                        if(word.charAt(i)<97){
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }

}
    