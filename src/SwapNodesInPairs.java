import Common.List.List;
import Common.List.ListNode;

public class SwapNodesInPairs {
    public static void main(String[] argv){
        SwapNodesInPairs s = new SwapNodesInPairs();
        s.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{1,2};
        ListNode l = List.createList(n);
        ListNode a = s.swapPairs(l);
        System.out.println();

    }

    class Solution {
        public ListNode swapPairs(ListNode head) {
            if(head == null){
                return head;
            }
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode fast = dummy.next.next;
            ListNode slow = dummy;
            ListNode temp;
            while (fast!=null){
                temp = fast.next;
                fast.next = slow.next;
                slow.next.next = temp;
                slow.next = fast;
                fast = fast.next;
                for(int i=0;i<2;i++){
                    if(fast == null){
                        return dummy.next;
                    }
                    fast = fast.next;
                    slow = slow.next;
                }
            }
            return dummy.next;
        }
    }

}
