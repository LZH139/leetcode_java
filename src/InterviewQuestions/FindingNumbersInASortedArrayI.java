package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class FindingNumbersInASortedArrayI {
    public static void main(String[] argv) {
        FindingNumbersInASortedArrayI d = new FindingNumbersInASortedArrayI();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{5,7,7,8,8,10};
        System.out.print(s.search(n,8));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int search(int[] nums, int target) {
            int result = 0;
            for(int n:nums){
                if(n == target){
                    result++;
                }
            }
            return result;
        }
    }

//    二分法更优
//class Solution {
//    public int search(int[] nums, int target) {
//        int i = 0, j = nums.length - 1;
//        while(i <= j) {
//            int m = (i + j) / 2;
//            if(nums[m] <= target) i = m + 1;
//            else j = m - 1;
//        }
//        int right = i;
//
//        i = 0; j = nums.length - 1;
//        while(i <= j) {
//            int m = (i + j) / 2;
//            if(nums[m] < target) i = m + 1;
//            else j = m - 1;
//        }
//        int left = j;
//
//        return right - left - 1;
//    }
}



    