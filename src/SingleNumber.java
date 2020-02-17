public class SingleNumber {
    public static void main(String[] argv){
        SingleNumber s = new SingleNumber();
        s.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] num = new int[]{4,1,2,1,2};
        System.out.println(s.singleNumber(num));
    }

    class Solution {
        public int singleNumber(int[] nums) {
            int a =0;
            for(int i=0;i<nums.length;i++){
                a = a ^ nums[i];
            }
            return a;
        }
    }
}
