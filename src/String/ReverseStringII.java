package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseStringII {
    public static void main(String[] argv) {
        ReverseStringII d = new ReverseStringII();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        String str = "ab";
        System.out.print(s.reverseStr(str,3));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public String reverseStr(String s, int k) {
            char[] result = s.toCharArray();
            int n = result.length;
            if(n<2 || n<k){
                reservelist(result,0,n-1);
                return String.valueOf(result);
            }
            for(int i=0;i<n+2*k;i+=2*k){
                if(n-i<=k){
                    reservelist(result,i,n-1);
                    break;
                }
                if(i<n){
                    reservelist(result,i,i+k-1);
                }else{
                    break;
                }
            }
            return String.valueOf(result);
        }

        public void reservelist(char[] list , int start, int end){
            char temp;
            while (end>start){
                temp = list[end];
                list[end] = list[start];
                list[start] = temp;
                end--;
                start++;
            }
        }
    }

//    class Solution {
//        public String reverseStr(String s, int k) {
//            char[]chars=s.toCharArray();
//            for(int i=0;i<s.length();i+=2*k){
//                reverse(chars,i,Math.min(i+k-1,s.length()-1));
//            }
//            return new String(chars);
//        }
//        private void reverse(char[]chars,int i,int j){
//            for(;i<j;++i,--j){
//                char temp=chars[i];
//                chars[i]=chars[j];
//                chars[j]=temp;
//            }
//        }
//    }

}
    