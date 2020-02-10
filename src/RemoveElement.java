public class RemoveElement {
    public static void main(String[] argv){
        RemoveElement r = new RemoveElement();
        r.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{0,1,2,2,3,0,4,2};
        System.out.println(s.removeElement(n, 2));
        printArray(n);

    }

    class Solution {
        public int removeElement(int[] nums, int val) {
            int cursor = -1;
            int num = 0;
            for(int i=0; i<nums.length; i++){
                if(nums[i] == val){
                    if(cursor ==-1){
                        cursor = i;
                    }
                }else{
                    if(cursor!= -1 && cursor<i){
                        nums[cursor] = nums[i];
                        nums[i] = val;
                        i = cursor;
                        cursor = -1;
                    }
                    num = num + 1;
                }
            }
            return num;
        }
    }

    public void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
    }
}
