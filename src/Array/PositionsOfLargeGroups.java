package Array;

import java.util.*;

public class PositionsOfLargeGroups {
    public static void main(String[] argv) {
        PositionsOfLargeGroups d = new PositionsOfLargeGroups();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.print(s.largeGroupPositions("abbxxxxzzy"));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public List<List<Integer>> largeGroupPositions(String S) {
            List<List<Integer>> result = new ArrayList<>();
            int l=0;
            for(int r=0;r<S.length();r++) {
                if(r == S.length()-1 || S.charAt(r)!=S.charAt(r+1)){
                    if(r-l+1>=3){
                        result.add(Arrays.asList(new Integer[]{l,r}));
                    }
                    l = r+1;
                }
            }
            return result;
        }
    }

}
    