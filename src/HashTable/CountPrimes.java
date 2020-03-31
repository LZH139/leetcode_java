package HashTable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountPrimes {
    public static void main(String[] argv) {
        CountPrimes d = new CountPrimes();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.print(s.countPrimes(6));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        int countPrimes(int n) {
            boolean[] isPrim = new boolean[n];
            Arrays.fill(isPrim, true);
            for (int i = 2; i * i < n; i++){
                if (isPrim[i]){
                    for (int j = i * i; j < n; j += i){
                        isPrim[j] = false;
                    }

                }
            }
            int count = 0;
            for (int i = 2; i < n; i++){
                if (isPrim[i]){
                    count++;
                }
            }
            return count;
        }
    }
}
    