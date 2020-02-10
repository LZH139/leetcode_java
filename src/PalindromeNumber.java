public class PalindromeNumber {
    public static void main(String[] argv){
        PalindromeNumber p = new PalindromeNumber();
        p.out();
    }

    public void out(){
        Solution s = new Solution();
        System.out.println(s.isPalindrome(121));
    }

    class Solution {
        public boolean isPalindrome(int x) {
            int xLength = numberLength(x);

            if(x<0 || (x % 10 == 0 & x != 0)){
                return false;
            }

            if(xLength == 1 ){
                return true;
            }


            if (x == reverse(x)){
                return true;
            }

            return false;
        }

        public int reverse(int x) {
            long result = 0;
            int i = 1;
            int y = 0;
            int xLength = numberLength(x);
            while(true){
                y = x%10;
                x = x/10;
                result = result + y * power(10,xLength-i);
                i++;
                if(x==0){
                    break;
                }
                if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
                    return 0;
                }
            }
            return (int)result;
        }

        public int numberLength(int x){
            int result = 0;
            while (true){
                x = x/10;
                result++;
                if(x == 0){
                    break;
                }
            }
            return result;
        }

        public int power(int a, int b){
            int result = 1;
            for(int i=0;i<b;i++){
                result = result * a;
            }
            return result;
        }
    }
}

