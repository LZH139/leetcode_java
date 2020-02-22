package LinkedList;

import Common.List.List;
import Common.List.ListNode;

public class IntersectionOfTwoLinkedListsLCCI {
    public static void main(String[] argv){
        IntersectionOfTwoLinkedListsLCCI i = new IntersectionOfTwoLinkedListsLCCI();
        i.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{1, 1, 1, 1, 2};
        ListNode l = List.createList(n);
        System.out.println(s.getIntersectionNode(l,l));
    }

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode cursorA = headA;
            ListNode cursorB = headB;
            while (cursorA != cursorB){
                if (cursorA == null){
                    cursorA = headB;
                }else{
                    cursorA = cursorA.next;
                }

                if(cursorB == null){
                    cursorB = headA;
                }else{
                    cursorB = cursorB.next;
                }
            }
            return cursorA;

        }
    }
}
