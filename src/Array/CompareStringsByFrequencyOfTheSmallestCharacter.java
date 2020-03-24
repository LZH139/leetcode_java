package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CompareStringsByFrequencyOfTheSmallestCharacter {
    public static void main(String[] argv) {
        CompareStringsByFrequencyOfTheSmallestCharacter d = new CompareStringsByFrequencyOfTheSmallestCharacter();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1, 2, 3, 4, 5, 6, 7};
//        System.out.print(s.numSmallerByFrequency(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int[] numSmallerByFrequency(String[] queries, String[] words) {
            int[] res = new int[queries.length];
            int[] target = new int[words.length];
            for (int i = 0; i < words.length; i++) {
                target[i] = f(words[i]);
            }
            Arrays.sort(target);
            for (int i = 0; i < res.length; i++) {
                int queryCount = f(queries[i]);
                int queryRes = 0;
                for (int j = 0; j < target.length; j++) {
                    if (target[j] > queryCount) {
                        queryRes = target.length - j;
                        break;
                    }
                }
                res[i] = queryRes;
            }
            return res;
        }
        private int f(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            int res = 0;
            for (int i = 0; i < arr.length; i++) {
                res++;
                if (i != arr.length - 1) {
                    if (arr[i] != arr[i + 1]) {
                        break;
                    }
                }
            }
            return res;
        }
    }


}
    