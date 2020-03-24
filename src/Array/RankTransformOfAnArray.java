package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RankTransformOfAnArray {
    public static void main(String[] argv) {
        RankTransformOfAnArray d = new RankTransformOfAnArray();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{37,12,28,9,100,56,80,5,12};
        System.out.print(s.arrayRankTransform(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int[] arrayRankTransform(int[] arr) {
            int[] array = new int[arr.length];
            System.arraycopy(arr,0,array,0,arr.length);
            Arrays.sort(arr);
            HashMap<Integer,Integer> map = new HashMap<>();
            int index = 1;
            for(int num:arr){
                if(!map.containsKey(num)){
                    map.put(num,index);
                    index++;
                }
            }
            for(int i=0;i<array.length;i++){
                array[i] = map.get(array[i]);
            }
            return array;
        }
    }

}
    