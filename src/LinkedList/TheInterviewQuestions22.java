package LinkedList;

import Common.List.List;
import Common.List.ListNode;

public class TheInterviewQuestions22 {
    public static void main(String[] argv){
        TheInterviewQuestions22 t = new TheInterviewQuestions22();
        t.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{1, 2, 3, 4, 5};
        ListNode l = List.createList(n);
        ListNode a = s.getKthFromEnd(l,2);
        System.out.println();

    }

    class Solution {
        public int count = 0;
        public ListNode getKthFromEnd(ListNode head, int k) {
            if(head == null){
                return head;
            }
            ListNode s = getKthFromEnd(head.next,k);
            if(s == null){
                count++;
                if(count == k){
                    return head;
                }else{
                    return null;
                }
            }else{
                return s;
            }
        }
    }
}
