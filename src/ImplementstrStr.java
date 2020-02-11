public class ImplementstrStr {
    public static void main(String[] argv){
        ImplementstrStr i = new ImplementstrStr();
        i.out();
    }

    public void out(){
        Solution s = new Solution();
        System.out.println(s.strStr("ppi", "pi"));
    }

    class Solution {
        public int strStr(String haystack, String needle) {
            if ("".equals(needle) || haystack.equals(needle)) {
                return 0;
            }
            int hLength = haystack.length();
            int nLength = needle.length();
            for(int i=0;i<=hLength-nLength;i++){
                if(haystack.charAt(i) == needle.charAt(0)){
                    for(int j=0;j<nLength;j++){
                        if(needle.charAt(j) != haystack.charAt(i+j)){
                            break;
                        }
                        if(j == nLength - 1){
                            return i;
                        }
                    }
                }
            }
            return -1;

        }
    }
}
