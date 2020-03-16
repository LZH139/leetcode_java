package Array;

import java.util.HashSet;
import java.util.Set;

public class FibonacciNumber {
    public static void main(String[] argv) {
        FibonacciNumber d = new FibonacciNumber();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.print(s.fib(2));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int fib(int N) {
            int f1 = 0;
            int f2 = 1;
            if(N==0){
                return f1;
            }
            if(N==1){
                return f2;
            }
            int f3 = 0;
            for(int i=2;i<=N;i++){
                f3 = f1+f2;
                f1 = f2;
                f2 = f3;
            }
            return f3;
        }
    }

}
    