package LinkedList;

import Common.List.List;
import Common.List.ListNode;

public class MiddleOfTheLinkedList {
    public static void main(String[] argv){
        MiddleOfTheLinkedList m = new MiddleOfTheLinkedList();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{1,2,3,4,5,6};
        ListNode l = s.middleNode(List.createList(n));
        System.out.println();
    }

    class Solution {
        public ListNode middleNode(ListNode head) {
            if(head == null || head.next == null){
                return head;
            }
            ListNode fast = head;
            ListNode slow = head;
            while (fast.next!=null && fast.next.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            if(fast.next == null){
                return slow;
            }else{
                return slow.next;
            }
        }
    }
}
