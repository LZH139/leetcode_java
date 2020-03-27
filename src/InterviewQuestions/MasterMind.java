package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class MasterMind {
    public static void main(String[] argv) {
        MasterMind d = new MasterMind();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
//        int[] n = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.print(s.masterMind("RGRB","BBBY"));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int[] masterMind(String solution, String guess) {
            int[] result = new int[2];
            int[] set = new int[24];
            char temp;
            for(int i=0;i<solution.length();i++){
                temp = solution.charAt(i);
                if(temp == guess.charAt(i)){
                    result[0]++;
                }
                set[temp-66]++;
            }
            for(int i=0;i<guess.length();i++){
                if(set[guess.charAt(i)-66]-- > 0){
                    result[1]++;
                }
            }
            result[1] = result[1]-result[0];
            return result;
        }
    }

}
    