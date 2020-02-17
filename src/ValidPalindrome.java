public class ValidPalindrome {
    public static void main(String[] argv){
        ValidPalindrome v = new ValidPalindrome();
        v.out();
    }

    public void out(){
        Solution s = new Solution();
        System.out.println(s.isPalindrome(""));
    }

    class Solution {
        public boolean isPalindrome(String s) {
            char[] list = new char[s.length()];
            int cursor = 0;
            for(int i=0;i<s.length();i++) {
                if (Character.isLetterOrDigit(s.charAt(i))) {
                    list[cursor] = Character.toLowerCase(s.charAt(i));
                    cursor++;
                }
            }
            s = String.valueOf(list,0,cursor);
            if("".equals(s)){
                return true;
            }
            int leftCursor = 0;
            int rightCursor = s.length()-1;
            while(true){
                if(s.charAt(leftCursor) == s.charAt(rightCursor)){
                    leftCursor++;
                    rightCursor--;
                }else{
                    return false;
                }
                if(rightCursor-leftCursor<=0){
                    return true;
                }

            }
        }
    }
}
