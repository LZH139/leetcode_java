public class PlusOne {
    public static void main(String[] argv){
        PlusOne p = new PlusOne();
        p.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] nums = new int[]{9,9,9,9};
//        System.out.println(s.plusOne(nums));
        printArray(s.plusOne(nums));
    }

    class Solution {
        public int[] plusOne(int[] digits) {
            int digitsLength = digits.length;
            for(int i=digitsLength-1;i>=0;i--){
                if(digits[i]+1>9){
                    digits[i] = 0;
                    if(i-1<0){
                        digits = addDigits(digits);
                        digits[0] = 1;
                    }
                }else{
                    digits[i] = digits[i]+1;
                    break;
                }
            }
            return digits;
        }

        public int[] addDigits(int[] digits){
            int[] result = new int[digits.length+1];
            System.arraycopy(digits,0,result,1,digits.length);
            return result;
        }
    }



    public void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
    }
}
