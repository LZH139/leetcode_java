package Array;

import java.util.*;

public class MinimumAbsoluteDifference {
    public static void main(String[] argv) {
        MinimumAbsoluteDifference d = new MinimumAbsoluteDifference();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{8,-68,-32,-81,83,93,-96,62,-103,-94,-66,74};
        System.out.print(s.minimumAbsDifference(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public List<List<Integer>> minimumAbsDifference(int[] arr) {
            Arrays.sort(arr);
            List<List<Integer>> result = new ArrayList<>();
            int min = Integer.MAX_VALUE;
            int tempMin;
            for(int i=0;i<arr.length-1;i++){
                tempMin = Math.abs(arr[i+1]-arr[i]);
                if(tempMin<min){
                    result.clear();
                    min = Math.abs(arr[i+1]-arr[i]);
                    result.add(new ArrayList<Integer>(Arrays.asList(arr[i],arr[i+1])));
                }else if(tempMin==min){
                    result.add(new ArrayList<Integer>(Arrays.asList(arr[i],arr[i+1])));
                }
            }
            return result;
        }
    }
}
    