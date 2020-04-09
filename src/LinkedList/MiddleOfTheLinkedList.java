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

//    class Solution {
//        public ListNode middleNode(ListNode head) {
//            if(head == null || head.next == null){
//                return head;
//            }
//            ListNode fast = head;
//            ListNode slow = head;
//            while (fast.next!=null && fast.next.next!=null){
//                slow = slow.next;
//                fast = fast.next.next;
//            }
//            if(fast.next == null){
//                return slow;
//            }else{
//                return slow.next;
//            }
//        }
//    }
    class Solution {
        public int half = 0;
        public ListNode middleNode(ListNode head) {
            return helper(head,1);
        }

        public ListNode helper(ListNode head, int num) {
            if(head == null){
                half = (num-1)/2+1;
                return null;
            }
            ListNode s = helper(head.next,num+1);
            if(num == half){
                return head;
            }
            return s;
        }
    }
}
