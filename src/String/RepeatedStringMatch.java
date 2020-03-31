package String;

import java.util.HashSet;
import java.util.Set;

public class RepeatedStringMatch {
    public static void main(String[] argv) {
        RepeatedStringMatch d = new RepeatedStringMatch();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        String str = "abc";
        System.out.print(s.repeatedStringMatch(str, str));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int repeatedStringMatch(String A, String B) {
            char[] a = A.toCharArray();
            char[] b = B.toCharArray();
            for(int i=0;i<a.length;i++){
                int len = loop(a,b,i);
                if(len > 0){//
                    int count = 1;
                /*len -= (a.length-i);
                if(len > 0){
                    count += len/a.length;
                    count += len%a.length > 0 ? 1 : 0;
                }*/
                    len = B.length() - a.length + i;
                    count += len/a.length;
                    count += len%a.length > 0 ? 1 : 0;
                    return count;
                }else if(len + a.length <= 0){
                    return -1;
                }
            }
            return -1;

        }
        //使用a滚轮印刷b，start为起始点
        public int loop(char[] a,char[] b,int start){
            int count = start;
            for(char c : b){
                if(a[start % a.length] != c){
                    return count - start;
                }
                start++;
            }
            return 1;//start - count;
        }
    }


}
    