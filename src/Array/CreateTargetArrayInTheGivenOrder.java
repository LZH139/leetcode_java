package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CreateTargetArrayInTheGivenOrder {
    public static void main(String[] argv) {
        CreateTargetArrayInTheGivenOrder d = new CreateTargetArrayInTheGivenOrder();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n1 = new int[]{0,1,2,3,4};
        int[] n2 = new int[]{0,1,2,2,1};
        System.out.print(s.createTargetArray(n1,n2));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int[] createTargetArray(int[] nums, int[] index) {
            List<Integer> result = new ArrayList<>();
            for(int i=0;i<index.length;i++){
                result.add(index[i],nums[i]);
            }
            int[] ta = new int[result.size()];
            for(int i=0;i<result.size();i++){
                ta[i] = result.get(i);
            }
            return ta;
        }
    }

}
    