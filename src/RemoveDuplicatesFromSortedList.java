import Common.List.List;
import Common.List.ListNode;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] argv){
        RemoveDuplicatesFromSortedList r = new RemoveDuplicatesFromSortedList();
        r.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{1,1,1,2,2,2,3,3};
        System.out.println(s.deleteDuplicates(List.createList(n)));


    }

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if(head == null){
                return head;
            }
            ListNode root = head;
            while (root.next != null){
                if(root.val == root.next.val){
                    root.next = root.next.next;
                }else{
                    root = root.next;
                }

            }
            return head;
        }
    }
}
