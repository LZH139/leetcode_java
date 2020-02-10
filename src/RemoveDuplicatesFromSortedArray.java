public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] argv){
        RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();
        r.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{1,1,1,2,2,2,3,3};
        System.out.println(s.removeDuplicates(n));
        printArray(n);

    }

    class Solution {
        public int removeDuplicates(int[] nums) {
            int cursor = 1;
            for(int i=0; i<nums.length; i++){
                if(i!=0 && nums[i]!=nums[i-1]){
                    if(cursor<i) {
                        nums[cursor] = nums[i];
                    }
                    cursor = cursor + 1;
                }
            }
            return cursor;
        }
    }

    public void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
    }

}
