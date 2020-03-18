package Array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateZeros {
    public static void main(String[] argv) {
        DuplicateZeros d = new DuplicateZeros();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1,0,2,3,0,4,5,0};
        s.duplicateZeros(n);
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public void duplicateZeros(int[] arr) {
            int count = 0;
            int len = arr.length;
            int i = 0;

            while(i + count < len) {
                if(arr[i++] == 0){
                    count++;
                }
            }

            i--;
            int j = len - 1;

            if(count + i + 1 > len) {
                arr[j--] = arr[i--];
                count--;
            }

            while(count > 0) {
                arr[j--] = arr[i];
                if(arr[i] == 0) {
                    arr[j--] = arr[i];
                    count--;
                }
                i--;
            }
        }
    }

}
    