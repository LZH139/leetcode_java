package Array;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandiesToPeople {
    public static void main(String[] argv) {
        DistributeCandiesToPeople d = new DistributeCandiesToPeople();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
//        int[] n = new int[]{1, 2, 3, 4, 5, 6, 7};
        printArray(s.distributeCandies(100,1));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int[] distributeCandies(int candies, int num_people) {
            int[] result = new int[num_people];
            if(num_people == 0){
                return result;
            }
            int cursor = 0;
            int num = 1;
            while (candies>0){
                if(cursor>num_people-1){
                    cursor = 0;
                }
                if(num<candies){
                    result[cursor] += num;
                }else{
                    result[cursor] += candies;
                }
                candies-=num;
                num++;
                cursor++;
            }
            return result;
        }
    }

}
    