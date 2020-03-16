package Array;

import java.util.HashSet;
import java.util.Set;

public class SortArrayByParityII {
    public static void main(String[] argv) {
        SortArrayByParityII d = new SortArrayByParityII();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{4,2,5,7};
        System.out.print(s.sortArrayByParityII(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

//    class Solution {
//        public int[] sortArrayByParityII(int[] A) {
//            int[] result = new int[A.length];
//            int i = 0;
//            int j = 1;
//            for(int k=0;k<A.length;k++){
//                if(A[k]%2==0){
//                    result[i] = A[k];
//                    i+=2;
//                }else{
//                    result[j] = A[k];
//                    j+=2;
//                }
//            }
//            return result;
//        }
//    }
    class Solution {
        public int[] sortArrayByParityII(int[] A) {
            int j =1;
            for(int i=0;i<A.length;i+=2){
                if(A[i]%2 == 1){
                    while (A[j]%2 == 1){
                        j+=2;
                    }
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
            return A;
        }
    }

}
    