import Common.List.List;
import Common.List.ListNode;

public class ReverseLinkedList {
    public static void main(String[] argv){
        ReverseLinkedList r = new ReverseLinkedList();
        r.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{1,2,6,3,4,5,6};
        ListNode a = s.reverseList(List.createList(n));
        System.out.println();
    }
//    class Solution {
//        public ListNode reverseList(ListNode head) {
//            if(head == null || head.next == null){
//                return head;
//            }
//            ListNode prev =null;
//            ListNode root = head;
//            ListNode next = root.next;
//            while (next!=null){
//                next = root.next;
//                root.next = prev;
//                prev = root;
//                root = next;
//            }
//            return prev;
//        }
//    }
//骚解
    class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null){
                return head;
            }
            ListNode p = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return p;
        }

    }


}
