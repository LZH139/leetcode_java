import Common.List.List;
import Common.List.ListNode;

public class PartitionList {
    public static void main(String[] argv){
        PartitionList p = new PartitionList();
        p.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{1,4,3,2,5,2};
        ListNode l = List.createList(n);
        ListNode a = s.partition(l,3);
        System.out.println();

    }

    class Solution {
        public ListNode partition(ListNode head, int x) {
            if(head == null){
                return head;
            }
            ListNode smallhead = new ListNode(0);
            ListNode bighead = new ListNode(0);
            ListNode big = bighead;
            ListNode small = smallhead;
            while (head!= null){
                if(head.val <x){
                    small.next = head;
                    small = small.next;
                }else{
                    big.next = head;
                    big = big.next;
                }
                head = head.next;
            }
            big.next = null;
            small.next = bighead.next;
            return smallhead.next;
        }
    }
}
