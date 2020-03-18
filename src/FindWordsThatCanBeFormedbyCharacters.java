import java.util.Arrays;

public class FindWordsThatCanBeFormedbyCharacters {
    public static void main(String[] argv){
        FindWordsThatCanBeFormedbyCharacters i = new FindWordsThatCanBeFormedbyCharacters();
        i.out();
    }

    public void out(){
        Solution s = new Solution();
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";
//        System.out.print('a'+0);
        System.out.println(s.countCharacters(words, chars));
    }

    class Solution {
        public int countCharacters(String[] words, String chars) {
            int [] countlist = new int[26];
            char now;
            int sum = 0;
            for(int i=0;i<chars.length();i++){
                countlist[chars.charAt(i)-97]++;
            }
            for(String s:words){
                int[] wordlist = new int[26];
                for(int i=0;i<s.length();i++){
                    now = s.charAt(i);
                    wordlist[now-'a']++;
                    if(wordlist[now-'a']>countlist[now-'a']){
                        break;
                    }
                    if(i == s.length()-1){
                        sum+=s.length();
                    }
                }
            }
            return sum;
        }
    }
}
