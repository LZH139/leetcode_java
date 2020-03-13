package Array;

public class OneBitAndTwoBitCharacters {
    public static void main(String[] argv) {
        OneBitAndTwoBitCharacters d = new OneBitAndTwoBitCharacters();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1, 1, 1, 0};
        System.out.print(s.isOneBitCharacter(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public boolean isOneBitCharacter(int[] bits) {
            for(int i=0;i<bits.length;i++){
                if(i == bits.length-1){
                    return true;
                }
                if(bits[i] == 1){
                    i++;
                }

            }
            return false;
        }
    }

}
    