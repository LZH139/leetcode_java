public class ReverseInteger {
    public static void main(String[] argv){
        ReverseInteger r = new ReverseInteger();
        r.out();
    }

    public void out(){
        Solution s = new Solution();
        System.out.println(s.reverse(12345));
    }

    class Solution {
        public int reverse(int x) {
            long result = 0;
            int i = 1;
            int y = 0;
            int xLength = numberLength(x);
            while(true){
                y = x%10;
                x = x/10;
                result = result + y * power(10,xLength-i);
                i++;
                if(x==0){
                    break;
                }
                if(result > Integer.MAX_VALUE | result < Integer.MIN_VALUE){
                    return 0;
                }
            }
            return (int)result;
        }

        public int numberLength(int x){
            int result = 0;
            while (true){
                x = x/10;
                result++;
                if(x == 0){
                    break;
                }
            }
            return result;
        }

        public long power(int a, int b){
            long result = 1;
            for(int i=0;i<b;i++){
                result = result * a;
            }
            return result;
        }
    }

}

