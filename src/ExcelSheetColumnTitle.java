import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class ExcelSheetColumnTitle {
    public static void main(String[] argv){
        ExcelSheetColumnTitle e = new ExcelSheetColumnTitle();
        e.out();
    }

    public void out(){
        Solution s = new Solution();
        System.out.println(s.convertToTitle(52));
    }

    class Solution {
        public String convertToTitle(int n) {
            StringBuilder result = new StringBuilder();
            while (n>0){
                n--;  //神来一减
                char temp = (char)(n%26 + 65);
                n = n/26;
                result.append(temp);
            }
            return result.reverse().toString();
        }
    }
}
