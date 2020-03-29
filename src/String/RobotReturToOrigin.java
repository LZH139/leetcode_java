package String;

import java.util.HashSet;
import java.util.Set;

public class RobotReturToOrigin {
    public static void main(String[] argv) {
        RobotReturToOrigin d = new RobotReturToOrigin();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        String str = "UD";
        System.out.print(s.judgeCircle(str));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public boolean judgeCircle(String moves) {
            int horizontal = 0;
            int vertical =0;
            int n = moves.length();
            for(int i=0;i<n;i++){
                if(moves.charAt(i) == 'U'){
                    vertical++;
                }else if(moves.charAt(i) == 'D'){
                    vertical--;
                }else if(moves.charAt(i) == 'L'){
                    horizontal++;
                }else{
                    horizontal--;
                }
            }
            return horizontal==0 && vertical==0;
        }
    }

//    class Solution {
//        public boolean judgeCircle(String moves)
//        {
//            int[] a = new int['Z'];
//            char[] c = moves.toCharArray();
//            for(int i=0;i<c.length;i++){
//                a[c[i]]++;
//            }
//            if(a['U']==a['D']&&a['L']==a['R']){
//                return true;
//            }
//            return false;
//
//        }
//    }

}
    