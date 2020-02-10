public class ValidParentheses {
    public static void main(String[] argv){
        ValidParentheses v = new ValidParentheses();
        v.out();
    }

    public void out(){
        Solution s = new Solution();
        String str = "]";
        System.out.println(s.isValid(str));
    }

    class Solution {
        public boolean isValid(String s) {
            int length = s.length();
            char[] storge = new char[length];
            int cursor = 0;
            int type;
            for(int i=0;i<s.length();i++){
                type = getType(s.charAt(i));

                if(type == 0){
                    continue;
                }

                if(type <= 3){
                    storge[cursor] = s.charAt(i);
                    cursor = cursor + 1;
                }else{
                    if(cursor-1 < 0){
                        return false;
                    }
                    if(type/10 == getType(storge[cursor-1])){
                        cursor = cursor - 1;
                    }else {
                        return false;
                    }
                }
            }
            return cursor == 0;
        }

        public int getType(char c){
            switch (c){
                case '(': return 1;
                case '[': return 2;
                case '{': return 3;
                case ')': return 10;
                case ']': return 20;
                case '}': return 30;
                default: return 0;
            }
        }
    }
}
