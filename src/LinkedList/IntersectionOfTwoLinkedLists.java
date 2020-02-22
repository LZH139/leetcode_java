package LinkedList;

import Common.List.ListNode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class IntersectionOfTwoLinkedLists {
//哈希表法
//    public class Solution {
//        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//            Set<ListNode> set = new HashSet<>();
//            if(headA == null || headB == null){
//                return null;
//            }
//
//            while (headA!=null){
//                set.add(headA);
//                headA = headA.next;
//            }
//
//            while (headB!=null){
//                if(set.contains(headB)){
//                    return headB;
//                }
//                headB = headB.next;
//            }
//
//            return null;
//        }
//    }

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if(headA == null || headB == null){
                return null;
            }
            ListNode cursorA = headA;
            ListNode cursorB = headB;
            while(cursorA != cursorB){
                if(cursorA == null){
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
