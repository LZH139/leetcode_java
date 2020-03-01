package Array;

public class ThirdMaximumNumber {
        public static void main(String[] argv) {
            ThirdMaximumNumber d = new ThirdMaximumNumber();
            d.out();
        }

        public void out() {
           Solution s = new Solution();
            int[] n = new int[]{1, 2};
            System.out.print(s.thirdMax(n));
        }

        public void printArray(int[] nums) {
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }

        class Solution {
            public int thirdMax(int[] nums) {
                Integer a=null,b=null,c=null;

                for (int num : nums) {
                    if(a==null){
                        a = num;
                        continue;
                    }
                    if(num>a) {
                        c = b;
                        b = a;
                        a = num;
                    }else if(a == num){
                    }else{
                        if(b == null){
                            b = num;
                            continue;
                        }
                        if(num>b) {
                            c = b;
                            b = num;
                        }else if(num == b){
                        }else{
                            if(c == null){
                                c = num;
                                continue;
                            }
                            if(num>c){
                                c = num;
                            }
                        }
                    }
                }
                if(c == null){
                    return a;
                }else{
                    return c;
                }

            }
        }


}
