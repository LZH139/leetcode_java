import Common.List.List;
import Common.List.ListNode;

public class PalindromeLinkedList {
    public static void main(String[] argv){
        PalindromeLinkedList p = new PalindromeLinkedList();
        p.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{1};
        System.out.println(s.isPalindrome(List.createList(n)));
    }

    class Solution {
        public ListNode first;
        public boolean isPalindrome(ListNode head) {
            if(head == null){
                return true;
            }
            first = head;
            return Palindrome(head);
        }

        public boolean Palindrome(ListNode head){
            if(head == null || head.next == null){
                return true;
            }
            boolean flag = Palindrome(head.next);
            if(head.next.val == first.val){
                first = first.next;
                return (true && flag);
            }else{
                return false;
            }
        }

    }
}
