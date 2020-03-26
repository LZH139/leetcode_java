package Array;

import java.util.HashSet;
import java.util.Set;

public class FindTheDistanceValueBetweenTwoArrays {
    public static void main(String[] argv) {
        FindTheDistanceValueBetweenTwoArrays d = new FindTheDistanceValueBetweenTwoArrays();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n1 = new int[]{4,5,8};
        int[] n2 = new int[]{10,9,1,8};
        System.out.print(s.findTheDistanceValue(n1,n2,2));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
            int sum = 0;
            for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr2.length;j++){
                    if(Math.abs(arr1[i]-arr2[j])<=d){
                        break;
                    }
                    if(j==arr2.length-1){
                        sum++;
                    }
                }
            }
            return sum;
        }
    }


}



    