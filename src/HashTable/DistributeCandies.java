package HashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public static void main(String[] argv) {
        DistributeCandies d = new DistributeCandies();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1,1,2,2,3,3};
        System.out.print(s.distributeCandies(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int distributeCandies(int[] candies) {
            HashSet<Integer> set = new HashSet<>();
            int sum=0;
            for(int i=0;i<candies.length;i++){
                if(!set.contains(candies[i])){
                    sum++;
                    set.add(candies[i]);
                }
            }
            return Math.min(sum, candies.length / 2);
        }
    }

}
    