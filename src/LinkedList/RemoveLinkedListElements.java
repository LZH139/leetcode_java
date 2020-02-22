package LinkedList;

import Common.List.ListNode;

public class RemoveLinkedListElements {
    public static void main(String[] argv){
        RemoveLinkedListElements r = new RemoveLinkedListElements();
        r.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{1,2,6,3,4,5,6};
        ListNode a = s.removeElements(null,6);
        System.out.println();
    }

    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            if(head == null){
                return head;
            }
            head.next = removeElements(head.next,val);
            if(head.val == val){
                return head.next;
            }else{
                return head;
            }
        }
    }
}
