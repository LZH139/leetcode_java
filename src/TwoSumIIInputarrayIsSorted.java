public class TwoSumIIInputarrayIsSorted {
    public static void main(String[] argv){
        TwoSumIIInputarrayIsSorted t = new TwoSumIIInputarrayIsSorted();
        t.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(s.twoSum(nums,target));
    }

    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int cursorHead = 0;
            int cursotTail = numbers.length-1;
            while (numbers[cursorHead]+numbers[cursotTail] != target){
                if(numbers[cursorHead]+numbers[cursotTail]>target){
                    cursotTail = cursotTail-1;
                }else{
                    cursorHead = cursorHead+1;
                }
            }
            return new int[]{cursorHead+1,cursotTail+1};

        }
    }
}
