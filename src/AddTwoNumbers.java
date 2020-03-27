import Common.List.List;
import Common.List.ListNode;

public class AddTwoNumbers {
    public static void main(String[] argv){
        AddTwoNumbers a = new AddTwoNumbers();
        a.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n1 = new int[]{5};
        int[] n2 = new int[]{5};
        ListNode l1 = List.createList(n1);
        ListNode l2 = List.createList(n2);
        s.addTwoNumbers(l1,l2);
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            if(l1 == null && l2 == null){
                return null;
            }
            int carry = 0;
            ListNode head = null;
            ListNode root = null;
            while (l1 != null || l2 != null || carry!=0){
                if(l1 != null && l2!=null) {
                    if (head == null) {
                        head = new ListNode((l1.val + l2.val) % 10);
                        carry = (l1.val + l2.val) / 10;
                        root = head;
                    } else {
                        root.next = new ListNode((l1.val + l2.val + carry) % 10);
                        carry = (l1.val + l2.val + carry) / 10;
                        root = root.next;
                    }
                    l1 = l1.next;
                    l2 = l2.next;
                }else if(l1 == null && l2 == null){
                    if(carry!=0){
                        root.next = new ListNode(carry);
                        carry =0;
                    }
                }else if(l1 == null || l2 == null){
                    int nums = l1 == null?(l2.val+carry)%10:(l1.val+carry)%10;
                    carry = l1 == null?(l2.val+carry)/10:(l1.val+carry)/10;
                    if(head == null){
                        head = new ListNode(nums);
                        root = head;
                    }else{
                        root.next = new ListNode(nums);
                        root = root.next;
                    }
                    l1 = l1 == null?null:l1.next;
                    l2 = l2 == null?null:l2.next;
                }
            }
            return head;
        }
    }

    
    //题解
    //1.如果为null就赋值为0再相加
    //2.在最后再判断是否还有进1
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode dummyHead = new ListNode(0);
//        ListNode p = l1, q = l2, curr = dummyHead;
//        int carry = 0;
//        while (p != null || q != null) {
//            int x = (p != null) ? p.val : 0;
//            int y = (q != null) ? q.val : 0;
//            int sum = carry + x + y;
//            carry = sum / 10;
//            curr.next = new ListNode(sum % 10);
//            curr = curr.next;
//            if (p != null) p = p.next;
//            if (q != null) q = q.next;
//        }
//        if (carry > 0) {
//            curr.next = new ListNode(carry);
//        }
//        return dummyHead.next;
//    }

}
