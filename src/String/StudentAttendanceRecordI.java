package String;

import java.util.HashSet;
import java.util.Set;

public class StudentAttendanceRecordI {
    public static void main(String[] argv) {
        StudentAttendanceRecordI d = new StudentAttendanceRecordI();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        String str = "LALL";
        System.out.print(s.checkRecord(str));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public boolean checkRecord(String s) {
            int n = s.length();
            int countA = 0;
            int countL = 0;
            int cur;
            for(int i=0;i<n;i++){
                if(s.charAt(i) == 'A'){
                    countA++;
                }else if(s.charAt(i) == 'L'){
                    cur = i;
                    while (++cur<n){
                        if(s.charAt(cur) == 'L'){
                            countL++;
                        }else{
                            break;
                        }
                        if(countL>1){
                            return false;
                        }
                    }
                    countL=0;
                }
            }
            return !(countA>1);
        }
    }

//    class Solution {
//        public boolean checkRecord(String s) {
//            int countA = 0;
//            int countContL = 0;
//
//            for(int i=0; i<s.length(); i++){
//                if(s.charAt(i) == 'A'){
//                    countA++;
//                    if(countA>1){
//                        return false;
//                    }
//                }
//                else if(s.charAt(i)=='L'){
//                    if(i>1 && s.charAt(i-1)=='L' && s.charAt(i-2) == 'L'){
//                        return false;
//                    }
//                }
//            }
//            return true;
//        }
//    }

}
    