public class PalindromeNumber {
    public static void main(String[] argv){
        PalindromeNumber p = new PalindromeNumber();
        p.out();
    }

    public void out(){
        Solution s = new Solution();
        System.out.println(s.isPalindrome(44));
    }

    class Solution {
        public boolean isPalindrome(int x) {
            return true;
        }
    }
}

