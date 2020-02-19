import Common.List.List;
import Common.List.ListNode;

public class TheInterviewQuestion18 {
    public static void main(String[] argv){
        TheInterviewQuestion18 t = new TheInterviewQuestion18();
        t.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{4,5,1,9};
        ListNode l = List.createList(n);
        ListNode a = s.deleteNode(l,1);
        System.out.println();

    }

    class Solution {
        public ListNode deleteNode(ListNode head, int val) {
            if(head == null){
                return head;
            }else if(head.val == val){
                return head.next;
            }

            ListNode root = head.next;
            ListNode prev = head;
            while (root!=null){
                if(root.val == val){
                    prev.next = root.next;
                    break;
                }else{
                    prev = prev.next;
                    root = root.next;
                }
            }
            return head;

        }
    }
}
