package HashTable;

import java.util.HashSet;
import java.util.Set;

public class BullsAndCows {
    public static void main(String[] argv) {
        BullsAndCows d = new BullsAndCows();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        String str = "abc";
        System.out.print(s.getHint("1123",  "0111"));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public String getHint(String secret, String guess) {
            int[] counts = new int[10];
            int[] countg = new int[10];
            int a = 0;
            int b = 0;
            char chs;
            char chg;
            StringBuilder sb = new StringBuilder();
            int slength = secret.length();
            for(int i=0;i<slength;i++){
                chs = secret.charAt(i);
                chg = guess.charAt(i);
                counts[chs-'0']++;
                countg[chg-'0']++;
                if(chs == chg){
                    a++;
                }
            }
            for(int i=0;i<10;i++){
                b+=Math.min(countg[i],counts[i]);
            }
            return sb.append(a).append("A").append(b-a).append("B").toString();
        }
    }

}
    