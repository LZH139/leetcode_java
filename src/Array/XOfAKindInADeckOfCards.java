package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class XOfAKindInADeckOfCards {
    public static void main(String[] argv) {
        XOfAKindInADeckOfCards d = new XOfAKindInADeckOfCards();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1,1};
        System.out.print(s.hasGroupsSizeX(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public boolean hasGroupsSizeX(int[] deck) {
            int[] count = new int[10000];
            for (int c: deck)
                count[c]++;

            int g = -1;
            for (int i = 0; i < 10000; ++i){
                if (count[i] > 0) {
                    if (g == -1){
                        g = count[i];
                    }else{
                        g = gcd(g, count[i]);
                    }

                }
            }
            return g >= 2;
        }

        public int gcd(int x, int y) {
            return x == 0 ? y : gcd(y%x, x);
        }
    }


}
    