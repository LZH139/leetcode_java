package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DegreeOfAnArray {
    public static void main(String[] argv) {
        DegreeOfAnArray d = new DegreeOfAnArray();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1, 2, 2, 3, 1};
//        int[] n = new int[]{1,2,2,3,1,4,2};
//        int[] n = new int[]{1};
        System.out.print(s.findShortestSubArray(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int findShortestSubArray(int[] nums) {
            HashMap<Integer,Integer> left = new HashMap<>();
            HashMap<Integer,Integer> right = new HashMap<>();
            HashMap<Integer,Integer> count = new HashMap<>();
            int temp;
            int maxcount = -1;
            int minlength = Integer.MAX_VALUE;
            for(int i=0;i<nums.length;i++){
                temp = nums[i];
                if(count.containsKey(temp)){
                    count.put(temp,count.get(temp)+1);
                    right.put(temp,i);
                }else{
                    left.put(temp,i);
                    count.put(temp,1);
                }
            }
            for(int x : count.keySet()){
                if(count.get(x)>maxcount){
                    maxcount = count.get(x);
                    if(right.containsKey(x)){
                        minlength = right.get(x)-left.get(x)+1;
                    }else{
                        minlength = 1;
                    }
                }else if(count.get(x)==maxcount && right.containsKey(x)){
                    minlength = Math.min(minlength, right.get(x)-left.get(x)+1);
                }
            }
            return minlength;

        }
    }

}
    