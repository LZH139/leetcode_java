import Common.List.List;
import Common.List.ListNode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNodeLCCI {
    public static void main(String[] argv){
        RemoveDuplicateNodeLCCI r = new RemoveDuplicateNodeLCCI();
        r.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{1, 1, 1, 1, 2};
        ListNode l = List.createList(n);
        System.out.println(s.removeDuplicateNodes(l));

    }
    class Solution {
        public ListNode removeDuplicateNodes(ListNode head) {
            if(head == null){
                return null;
            }
            Set<Integer> set = new  HashSet<>();
            ListNode root = head;
            set.add(root.val);
            while (root.next!=null){
                if(set.contains(root.next.val)) {
                    root.next = root.next.next;
                }else{
                    set.add(root.next.val);
                    root = root.next;
                }
            }
            return head;
        }
    }
}
