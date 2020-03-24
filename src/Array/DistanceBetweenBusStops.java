package Array;

import java.util.HashSet;
import java.util.Set;

public class DistanceBetweenBusStops {
    public static void main(String[] argv) {
        DistanceBetweenBusStops d = new DistanceBetweenBusStops();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1,2,3,4};
        System.out.print(s.distanceBetweenBusStops(n,0,3));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int distanceBetweenBusStops(int[] distance, int start, int destination) {
            int sum1=0;
            int sum2=0;
            if(start>destination){
                int temp = destination;
                destination = start;
                start = temp;
            }
            for(int i=0;i<distance.length;i++){
                if(i>=start && i<destination){
                    sum1+=distance[i];
                }else{
                    sum2+=distance[i];
                }
            }
            return Math.min(sum1,sum2);
        }
    }

}
    