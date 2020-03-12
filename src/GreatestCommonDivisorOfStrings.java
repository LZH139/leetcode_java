public class GreatestCommonDivisorOfStrings {
    public static void main(String[] argv){
        GreatestCommonDivisorOfStrings i = new GreatestCommonDivisorOfStrings();
        i.out();
    }

    public void out(){
        Solution s = new Solution();
        System.out.println(s.gcdOfStrings("ABABAB", "ABAB"));
    }

    class Solution {
        public String gcdOfStrings(String str1, String str2) {
            if((str1+str2).equals(str2+str1)){
                return str2.substring(0,(int)gcd(str1.length(),str2.length()));
            }
            return "";

        }

        private long gcd(long a,long b){
            return a==0?b:gcd(b%a,a);
        }
    }

}
