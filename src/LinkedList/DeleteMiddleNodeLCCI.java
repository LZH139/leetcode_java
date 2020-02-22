package LinkedList;

import Common.List.List;
import Common.List.ListNode;

public class DeleteMiddleNodeLCCI {
    public static void main(String[] argv){
        DeleteMiddleNodeLCCI d = new DeleteMiddleNodeLCCI();
        d.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{1, 1, 1, 1, 2};
        ListNode l = List.createList(n);
        s.deleteNode(l);
    }
    class Solution {
        public void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }

}
