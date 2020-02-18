public class ExcelSheetColumnNumber {
    public static void main(String[] argv){
        ExcelSheetColumnNumber e = new ExcelSheetColumnNumber();
        e.out();
    }

    public void out(){
        Solution s = new Solution();
        System.out.println(s.titleToNumber("ZY"));
    }

    class Solution {
        public int titleToNumber(String s) {
            int result = 0;
            for(int i=s.length()-1;i>=0;i--){
                result = result + (s.charAt(i)-64) * (int)Math.pow(26, s.length()-i-1);
            }
            return result;
        }
    }
}
