package InterviewQuestions;

import java.util.ArrayList;

public class CompressStringLCCI {
    public static void main(String[] argv){
        CompressStringLCCI c = new CompressStringLCCI();
        c.out();
    }

    public void out(){
        Solution s = new Solution();
        System.out.println(s.compressString("aabcccccaaa"));
    }

    class Solution {
        public String compressString(String S) {
            StringBuilder sb = new StringBuilder();
            int l = 0;
            int count = 1;
            for(int i=0;i<S.length();i++){
                if(i==S.length()-1||S.charAt(i+1)!=S.charAt(l)){
                    sb.append(S.charAt(l));
                    sb.append(count);
                    l=i+1;
                    count =1;
                }else{
                    count++;
                }
            }
            return sb.length() >= S.length()?S:sb.toString();
        }
    }
}
