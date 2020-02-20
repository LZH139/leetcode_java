import Common.List.List;
import Common.List.ListNode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedListII {
    public static void main(String[] argv){
        RemoveDuplicatesFromSortedListII r = new RemoveDuplicatesFromSortedListII();
        r.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{1,1,2};
        ListNode l = List.createList(n);
        ListNode a = s.deleteDuplicates(l);
        System.out.println();

    }

    class Solution {
        public ListNode deleteDuplicates(ListNode head){
            if(head == null){
                return head;
            }
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode slow = dummy;
            ListNode fast = dummy.next;
            boolean flag = false;
            while (fast.next!=null){
                if(fast.val == fast.next.val){
                    flag = true;
                }else{
                    if(flag){
                        slow.next = fast.next;
                        flag = false;
                    }else{
                        slow = slow.next;
                    }
                }
               fast = fast.next;
            }
            if(flag == true){
                slow.next = null;
            }
            return dummy.next;
        }
    }
}
