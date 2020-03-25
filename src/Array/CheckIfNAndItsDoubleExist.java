package Array;

import java.util.HashSet;
import java.util.Set;

public class CheckIfNAndItsDoubleExist {
    public static void main(String[] argv) {
        CheckIfNAndItsDoubleExist d = new CheckIfNAndItsDoubleExist();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{3,1,7,11};
        System.out.print(s.checkIfExist(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public boolean checkIfExist(int[] arr) {
            Set<Float> set = new HashSet<>();
            for(int i=0;i<arr.length;i++){
                if(set.contains(arr[i]/(float)2) || set.contains(arr[i]*(float)2)){
                    return true;
                }
                set.add((float)arr[i]);
            }
            return false;
        }
    }

}
    