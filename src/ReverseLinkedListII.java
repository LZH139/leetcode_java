import Common.List.List;
import Common.List.ListNode;

public class ReverseLinkedListII {
    public static void main(String[] argv){
        ReverseLinkedListII r = new ReverseLinkedListII();
        r.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{3,5};
        ListNode l = List.createList(n);
        ListNode a = s.reverseBetween(l,1,2);
        System.out.println();

    }

    class Solution {
        public ListNode reverseBetween(ListNode head, int m, int n) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode pre = dummy;
            ListNode cur;
            ListNode temp;
            for (int i = 1; i < m; i++) {
                pre = pre.next;
            }
            cur = pre.next;
            for(int i=m;i<n;i++){
                temp = pre.next;
                pre.next = cur.next;
                cur.next = pre.next.next;
                pre.next.next = temp;
            }
            return dummy.next;
        }
    }

}
