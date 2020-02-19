import Common.List.List;
import Common.List.ListNode;

import java.util.ArrayList;

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] argv){
        RemoveNthNodeFromEndOfList r = new RemoveNthNodeFromEndOfList();
        r.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{1};
        ListNode l = List.createList(n);
        ListNode a = s.removeNthFromEnd(l,1);
        System.out.println();

    }

    class Solution {

//        public int count = 0;
//        public ListNode removeNthFromEnd(ListNode head, int n) {
//            if(head == null){
//                return head;
//            }
//            ListNode root = removeNthFromEnd(head.next,n);
//            if(count == n){
//                head.next = root.next;
//            }
//            count++;
//            return head;
//        }
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode fast = dummy;
            ListNode slow = dummy;
            for(int i=0;i<n+1;i++){
                fast = fast.next;
            }
            while (fast != null){
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;
            return dummy.next;
        }
    }
}
