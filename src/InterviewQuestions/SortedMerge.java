package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class SortedMerge {
    public static void main(String[] argv) {
        SortedMerge d = new SortedMerge();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] A = new int[]{1,2,3,0,0,0};
        int[] B = new int[]{2,5,6};
        s.merge(A,3, B,3);
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public void merge(int[] A, int m, int[] B, int n) {
            int i=m-1;
            int j=n-1;
            int cur = A.length-1;
            while (i>=0 || j>=0){
                if(i == -1) {
                    A[cur] = B[j];
                    j--;
                }else if(j == -1){
                    A[cur] = A[i];
                    i--;
                }else if(A[i]>B[j]){
                    A[cur] = A[i];
                    i--;
                }else if(A[i]<B[j]){
                    A[cur] = B[j];
                    j--;
                }else{
                    A[cur] = A[i];
                    i--;
                }
                cur--;
            }
            System.out.print(1);
        }
    }

}
    