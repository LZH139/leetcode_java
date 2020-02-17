public class MajorityElement {
    public static void main(String[] argv){
        MajorityElement m = new MajorityElement();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] nums = new int[]{2,2,1,1,1,2,2};
        System.out.println(s.majorityElement(nums));
    }

    class Solution {
        public int majorityElement(int[] nums) {
            int tempMode = nums[0];
            int count = 1;
            for(int i=1;i<nums.length;i++){
                if(count == 0){
                    tempMode = nums[i];
                }
                if(nums[i] == tempMode){
                    count++;
                }else{
                    count--;
                }
            }
            return tempMode;
        }
    }
}
