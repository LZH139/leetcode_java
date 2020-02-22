package LinkedList;

import Common.List.List;
import Common.List.ListNode;

public class DeleteNodeInALinkedList {
    public static void main(String[] argv){
        DeleteNodeInALinkedList d = new DeleteNodeInALinkedList();
        d.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{1,1,1,2,2,2,3,3};
        s.deleteNode(List.createList(n));
    }
    class Solution {
        public void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
