package Array;

import java.util.HashSet;
import java.util.Set;

public class CanPlaceFlowers {
    public static void main(String[] argv) {
        CanPlaceFlowers d = new CanPlaceFlowers();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1,0,0,0,1};
        System.out.print(s.canPlaceFlowers(n,2));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            int cou = 0;
            int count = 0;
            boolean flag = false;
            for(int i=0;i<flowerbed.length;i++){
                if(flowerbed[i] == 0){
                    cou++;
                }else if(flowerbed[i] == 1 && !flag){
                    count += cou/2;
                    cou = 0;
                    flag = !flag;
                }else if(flowerbed[i] == 1 && flag){
                    count += (cou-1)/2;
                    cou = 0;
                }
            }
            if(cou!=0){
                count += flag?cou/2:(cou+1)/2;
            }

            return count>=n;
        }
    }
}
    