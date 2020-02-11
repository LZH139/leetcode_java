public class CountAndSay {
    public static void main(String[] argv){
        CountAndSay c = new CountAndSay();
        c.out();
    }

    public void out(){
        Solution s = new Solution();
        System.out.println(s.countAndSay(30));
    }

//直接字符串连接写法，速度极慢，相较于StringBuilder 花费多一千多倍的时间

//    class Solution {
//        public String countAndSay(int n) {
//            String result = "1";
//            for(int i=1;i<=n-1;i++){
//                result = getNext(result);
//            }
//            return result;
//        }
//
//        public String getNext(String str){
//            String result = "";
//            int cursor = 0;
//            int strLength = str.length();
//            for(int i=0;i<strLength;i++){
//                if(i != 0){
//                    if(str.charAt(i) != str.charAt(i-1)){
//                        result = result + countNumber(str.substring(cursor, i));
//                        cursor = i;
//                    }
//                }
//
//                if(i == strLength-1){
//                    result = result + countNumber(str.substring(cursor, strLength));
//                }
//            }
//
//            return result;
//        }
//
//        public String countNumber(String str){
//            return "" + str.length() + str.charAt(0);
//        }
//    }
    class Solution {
        public String countAndSay(int n) {
            String result = "1";
            for(int i=1;i<=n-1;i++){
                result = getNext(result);
            }
            return result;
        }

        public String getNext(String str){
            StringBuilder sb = new StringBuilder();
            int count = 1;
            int strLength = str.length();
            char pre = str.charAt(0);
            for(int i=1;i<strLength;i++){
                if(str.charAt(i) == pre){
                    count++;
                }else{
                    sb.append(count).append(pre);
                    count = 1;
                    pre = str.charAt(i);
                }
            }
            sb.append(count).append(pre);
            return sb.toString();
        }
    }
}
