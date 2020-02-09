public class LongestCommonPrefix {
    public static void main(String[] argv){
        LongestCommonPrefix p = new LongestCommonPrefix();
        p.out();
    }

    public void out(){
        Solution s = new Solution();
        String[] strs = new String[]{"flower","flow","flight"};
        System.out.println(s.longestCommonPrefix(strs));
    }

    class Solution {
        public String longestCommonPrefix(String[] strs) {
            char tempStr;
            int i = 0;
            for(String str: strs){
                tempStr = str.charAt(i);

            }

            return "ww";
        }



    }
}
