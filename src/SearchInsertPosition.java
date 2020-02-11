public class SearchInsertPosition {
    public static void main(String[] argv){
        SearchInsertPosition s = new SearchInsertPosition();
        s.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] nums = new int[]{1,3,5,6};
        System.out.println(s.searchInsert(nums, 0));
    }

    class Solution {
        public int searchInsert(int[] nums, int target) {
            for(int i=0;i<nums.length;i++){
                if(nums[i] >= target){
                    return i;
                }
            }

            return nums.length;

        }
    }
}
