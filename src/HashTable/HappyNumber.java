package HashTable;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] argv) {
        HappyNumber d = new HappyNumber();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.print(s.isHappy(9995));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public boolean isHappy(int n) {
            int[] list = new  int[1054];
            while (true){
               n = count(n);
               if(n==1){
                   return true;
               }else if(list[n]!=0){
                   return false;
               }
               list[n]++;
            }
        }

        public int count(int n){
            String str = String.valueOf(n);
            int strlength=str.length();
            int result = 0;
            for(int i=0;i<strlength;i++){
                result+=Math.pow(str.charAt(i)-'0',2);
            }
            return result;
        }
    }
}
    