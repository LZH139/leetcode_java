package String;

import java.util.HashSet;
import java.util.Set;

public class AddStrings {
    public static void main(String[] argv) {
        AddStrings d = new AddStrings();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.print(s.addStrings("999","1"));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public String addStrings(String num1, String num2) {
            StringBuilder sb = new StringBuilder();
            int cur1 = num1.length()-1;
            int cur2 = num2.length()-1;
            int carry=0;
            int n1;
            int n2;
            while (cur1>=0 || cur2>=0 || carry!=0){
                n1 = cur1<0?0:(int)num1.charAt(cur1) - (int)('0');
                n2 = cur2<0?0:(int)num2.charAt(cur2) - (int)('0');
                sb.append((n1+n2+carry)%10);
                carry = (n1+n2+carry)/10;
                cur1--;
                cur2--;
            }
            return sb.reverse().toString();
        }
    }

}
    