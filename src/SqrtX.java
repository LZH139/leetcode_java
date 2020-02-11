public class SqrtX {
    public static void main(String[] argv){
        SqrtX s = new SqrtX();
        s.out();
    }

    public void out(){
        Solution s = new Solution();
//        int[] nums = new int[]{1,3,5,6};
        System.out.println(s.mySqrt(0));
    }
    class Solution {
        public int mySqrt(int x) {
            if(x ==0){
                return 0;
            }
            long a;
            double tempx = x;
            while (true){
                tempx = tempx/2 + x/(2*tempx);
                a = (int)tempx;
                if(a*a<=x){
                    return (int)tempx;
                }
            }
        }
    }
}
