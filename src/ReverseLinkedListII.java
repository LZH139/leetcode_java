import Common.List.List;
import Common.List.ListNode;

public class ReverseLinkedListII {
    public static void main(String[] argv){
        ReverseLinkedListII r = new ReverseLinkedListII();
        r.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{1,2,3,4,5};
        ListNode l = List.createList(n);
        ListNode a = s.reverseBetween(l,2,4);
        System.out.println();

    }

    class Solution {
        public ListNode reverseBetween(ListNode head, int m, int n) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode first = dummy;
            ListNode tail = dummy.next;
            ListNode pre = dummy;
            ListNode cur = dummy.next;
            int count = 0;
            while (count!=n){

            }
            return head;
        }
    }

}
