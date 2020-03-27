package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class FindMajorityElement {
    public static void main(String[] argv) {
        FindMajorityElement d = new FindMajorityElement();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1,2,5,9,5,9,5,5,5};
        System.out.print(s.majorityElement(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int majorityElement(int[] nums) {
            int candidate = -1;
            int count = 0;
            for(int num:nums){
                if(count == 0){
                    candidate = num;
                    count++;
                }else{
                    if(num!=candidate){
                        count--;
                    }else{
                        count++;
                    }
                }
            }
            count=0;
            for(int n:nums){
                if(n == candidate){
                    count++;
                }
            }
            return count>nums.length/2?candidate:-1;

        }
    }

}
    