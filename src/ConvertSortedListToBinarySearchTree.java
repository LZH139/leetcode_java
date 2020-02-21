import Common.List.List;
import Common.List.ListNode;
import Common.Tree.TreeNode;

public class ConvertSortedListToBinarySearchTree {
    public static void main(String[] argv) {
        ConvertSortedListToBinarySearchTree d = new ConvertSortedListToBinarySearchTree();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{-10, -3, 0, 5, 9};
        ListNode l = List.createList(n);
        TreeNode t = s.sortedListToBST(l);
        System.out.println();
    }

    class Solution {
        public TreeNode sortedListToBST(ListNode head) {
            if(head == null){
                return null;
            }
            ListNode middle = findMiddle(head);
            TreeNode first = new TreeNode(middle.val);
            if (head == middle) {
                return first;
            }
            first.left = sortedListToBST(head);
            first.right = sortedListToBST(middle.next);
            return first;
        }

        public ListNode findMiddle(ListNode head){
            if(head == null){
                return head;
            }
            ListNode fast = head;
            ListNode slow = head;
            ListNode slowPrev = null;
//            如果为 fast.next!=null && fast.next.next!=null ，当list剩两个元素时，会忽略掉右边一个
            while (fast!=null && fast.next!=null){

                fast = fast.next.next;
                slowPrev = slow;
                slow = slow.next;
            }
            if(slowPrev != null){
                slowPrev.next = null;
            }
            return slow;
        }
    }
//class Solution {
//
//    private ListNode findMiddleElement(ListNode head) {
//
//        // The pointer used to disconnect the left half from the mid node.
//        ListNode prevPtr = null;
//        ListNode slowPtr = head;
//        ListNode fastPtr = head;
//
//        // Iterate until fastPr doesn't reach the end of the linked list.
//        while (fastPtr != null && fastPtr.next != null) {
//            prevPtr = slowPtr;
//            slowPtr = slowPtr.next;
//            fastPtr = fastPtr.next.next;
//        }
//
//        // Handling the case when slowPtr was equal to head.
//        if (prevPtr != null) {
//            prevPtr.next = null;
//        }
//
//        return slowPtr;
//    }
//
//    public TreeNode sortedListToBST(ListNode head) {
//
//        // If the head doesn't exist, then the linked list is empty
//        if (head == null) {
//            return null;
//        }
//
//        // Find the middle element for the list.
//        ListNode mid = this.findMiddleElement(head);
//
//        // The mid becomes the root of the BST.
//        TreeNode node = new TreeNode(mid.val);
//
//        // Base case when there is just one element in the linked list
//        if (head == mid) {
//            return node;
//        }
//
//        // Recursively form balanced BSTs using the left and right halves of the original list.
//        node.left = this.sortedListToBST(head);
//        node.right = this.sortedListToBST(mid.next);
//        return node;
//    }
//}

}
