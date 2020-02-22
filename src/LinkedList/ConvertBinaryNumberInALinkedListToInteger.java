package LinkedList;

import Common.List.List;
import Common.List.ListNode;

public class ConvertBinaryNumberInALinkedListToInteger {
    public static void main(String[] argv){
        ConvertBinaryNumberInALinkedListToInteger d = new ConvertBinaryNumberInALinkedListToInteger();
        d.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{1,0,1};
        ListNode l = List.createList(n);
        System.out.println(s.getDecimalValue(l));
    }

    class Solution {
        public int count = 0;
        public int getDecimalValue(ListNode head) {
            if(head.next == null){
                return head.val*(int)Math.pow(2,count++);
            }
            return  getDecimalValue(head.next) + head.val*(int)Math.pow(2,count++);
        }
    }
}
