package Array;

import java.util.HashSet;
import java.util.Set;

public class MaximizeDistanceToClosestPerson {
    public static void main(String[] argv) {
        MaximizeDistanceToClosestPerson d = new MaximizeDistanceToClosestPerson();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1,0,0,0};
        System.out.print(s.maxDistToClosest(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int maxDistToClosest(int[] seats) {
            int max = Integer.MIN_VALUE;
            int temp = 0;
            for(int i=0;i<seats.length;i++){
                if(seats[i] == 0){
                    temp++;
                }else{
                    if(temp-i == 0){
                        max = Math.max(max,temp);
                    }else{
                        max = Math.max(max,(temp+1)/2);
                    }
                    temp = 0;
                }
            }
            if(temp!=0){
                max = Math.max(max,temp);
            }
            return max;
        }
    }

}
    