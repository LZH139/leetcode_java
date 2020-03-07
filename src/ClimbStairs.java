public class ClimbStairs {
    public static void main(String[] argv){
        ClimbStairs c = new ClimbStairs();
        c.out();
    }



    public void out(){
        Solution s = new Solution();
        System.out.println(s.climbStairs(35));
    }

    class Solution {
        public int climbStairs(int n) {
            int f0 = 0;
            int f1 = 1;
            int f2 = 2;
            int result = 0;
            if(n<=0){
                return f0;
            }else if(n ==1){
                return f1;
            }else if(n == 2){
                return f2;
            }else{
                for(int i=3;i<=n;i++){
                    result = f1+f2;
                    f1 = f2;
                    f2 = result;

                }
            }
            return result;

        }

    }
}
