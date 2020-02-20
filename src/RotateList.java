import Common.List.List;
import Common.List.ListNode;

public class RotateList {
    public static void main(String[] argv){
        RotateList r = new RotateList();
        r.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{1,2};
        ListNode l = List.createList(n);
        ListNode a = s.rotateRight(l,1);
        System.out.println();

    }

    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            if(head == null){
                return null;
            }
            ListNode root = head;
            int length = 1;
            while(root.next!=null){
                root = root.next;
                length++;
            }
            root.next = head;
//            root = root.next;
            if(k>length){
                k = length-(k%length);
            }else{
                k = length-k;
            }
            while (k!=0){
                root = root.next;
                k--;
            }

            head = root.next;
            root.next = null;
            return head;

        }
    }
}
