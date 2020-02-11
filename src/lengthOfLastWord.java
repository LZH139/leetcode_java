public class lengthOfLastWord {
    public static void main(String[] argv){
        lengthOfLastWord l = new lengthOfLastWord();
        l.out();
    }

    public void out(){
        Solution s = new Solution();
        String str = "a ";
        System.out.println(s.lengthOfLastWord(str));
    }

    class Solution {
        public int lengthOfLastWord(String s) {
            int count = 0;
            for(int i=s.length()-1;i>=0;i--){
                if(count == 0 && s.charAt(i) == ' '){
                    continue;
                }
                if(s.charAt(i) == ' '){
                    return count;
                }
                count++;
            }
            return count;
        }
    }
}
