public class RomanToInteger {
    public static void main(String[] argv){
        RomanToInteger r = new RomanToInteger();
        r.out();
    }

    public void out(){
        Solution s = new Solution();
        String str = "III";
        System.out.println(s.romanToInt(str));
    }

    class Solution {
        public int romanToInt(String s) {
            int result = 0;
            for(int i=0; i<s.length(); i++){

            }
            return result;
        }
    }
}
