package HashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class NumberOfBoomerangs {
    public static void main(String[] argv) {
        NumberOfBoomerangs d = new NumberOfBoomerangs();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1, 2, 3, 4, 5, 6, 7};
//        System.out.print(s.numberOfBoomerangs(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int numberOfBoomerangs(int[][] points) {
            int len = points.length;
            int ans = 0;
            HashMap<Double, Integer> map = new HashMap<Double, Integer>();
            for(int i = 0; i < len; i++){
                for(int j = 0; j < len; j++){
                    if(i != j){
                        double dis = Math.pow(points[i][0] - points[j][0], 2)
                                + Math.pow(points[i][1] - points[j][1], 2);
                        if(!map.containsKey(dis)){
                            map.put(dis, 1);
                        }else{
                            int n = map.get(dis);
                            ans += 2 * n;
                            map.put(dis, 1+n);
                        }
                    }
                }
                map.clear();
            }
            return ans;
        }
    }

}
    