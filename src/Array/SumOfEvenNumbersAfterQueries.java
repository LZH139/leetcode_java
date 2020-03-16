package Array;

import java.util.HashSet;
import java.util.Set;

public class SumOfEvenNumbersAfterQueries {
    public static void main(String[] argv) {
        SumOfEvenNumbersAfterQueries d = new SumOfEvenNumbersAfterQueries();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1,2,3,4};
        int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};
        printArray(s.sumEvenAfterQueries(n,queries));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
            int sum = 0;
            for(int x:A){
                if(x%2==0){
                    sum+=x;
                }
            }
            int[] result = new int[queries.length];
            int i=0;
            int temp;
            for(int[] y:queries){
                temp = A[y[1]];
                if(temp%2==0){
                    if((temp+y[0])%2!=0){
                        sum-=temp;
                    }else{
                        sum+=y[0];
                    }
                }else{
                    if((temp+y[0])%2==0){
                        sum += temp+y[0];
                    }
                }
                A[y[1]] = temp+y[0];
                result[i++] = sum;
            }
            return result;
        }
    }

}
    