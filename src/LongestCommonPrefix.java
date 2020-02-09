public class LongestCommonPrefix {
    public static void main(String[] argv){
        LongestCommonPrefix p = new LongestCommonPrefix();
        p.out();
    }

    public void out(){
        Solution s = new Solution();
        String[] strs = new String[]{"aa","a"};
        System.out.println(s.longestCommonPrefix(strs));
    }

    class Solution {
        public String longestCommonPrefix(String[] strs) {
            String result = "";
            for(int i=0;i<strs.length;i++){
                if(i==0){
                    result = strs[0];
                }else{
                    result = longestCommonPrefix(result, strs[i]);
                }
            }

            return result;
        }

        public String longestCommonPrefix(String str1, String str2){
            String minstr = str1.length() < str2.length() ? str1 : str2;
            for(int i=0;i<minstr.length();i++){
                if(!isSame(str1.charAt(i), str2.charAt(i))){
                    return str1.substring(0, i);
                }

            }
            return minstr;
        }

        public boolean isSame(char a, char b){
            return a==b;
        }

    }
}
