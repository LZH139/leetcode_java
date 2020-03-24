package Array;

import java.util.HashSet;
import java.util.Set;

public class DayOfTheWeek {
    public static void main(String[] argv) {
        DayOfTheWeek d = new DayOfTheWeek();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.print(s.dayOfTheWeek(31,8,2019));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public String dayOfTheWeek(int day, int month, int year) {
            String[] list = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday"};
            if(month==1||month==2){
                month+=12;
                year--;
            }
            int w = (year + year /4 + year / 400 - year / 100 + 2 * month + 3 * (month + 1)/5 + day) % 7;
            return list[w];
        }
    }

}
    