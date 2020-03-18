package Array;

import java.util.HashSet;
import java.util.Set;

public class ElementAppearingMoreThan25 {
    public static void main(String[] argv) {
        ElementAppearingMoreThan25 d = new ElementAppearingMoreThan25();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1,2,2,6,6,6,6,7,10};
        System.out.print(s.findSpecialInteger(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int findSpecialInteger(int[] arr) {
            int length = arr.length/4;
            int count=0;
            int last = arr[0];
            for(int a:arr){
                if(a == last){
                    count++;
                }else{
                    if(count>length){
                        break;
                    }else{
                        last = a;
                        count=1;
                    }
                }
            }
            return last;
        }
    }

}
    