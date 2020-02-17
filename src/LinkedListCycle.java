import Common.List.List;
import Common.List.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public static void main(String[] argv){
        LinkedListCycle l = new LinkedListCycle();
        l.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] nums = new int[]{3,2,0,-4};
        int pos = 0;
        System.out.println(s.hasCycle(List.createList(nums, pos)));
    }


// 哈希表
//    public class Solution {
//        public boolean hasCycle(ListNode head) {
//            if(head == null){
//                return false;
//            }
//            Set<ListNode> set = new HashSet<>();
//            while (true){
//                if(set.contains(head)){
//                    return true;
//                }else{
//                    if(head.next !=null){
//                        set.add(head);
//                        head = head.next;
//                    }else{
//                        return false;
//                    }
//                }
//            }
//        }
//    }
    public class Solution {
        public boolean hasCycle(ListNode head) {
            if(head == null){
                return false;
            }
            ListNode slowCursor = head;
            ListNode fastCursor = head.next;
            while (true){

                if(fastCursor == null || fastCursor.next == null){
                    return false;
                }
                slowCursor = slowCursor.next;
                fastCursor = fastCursor.next.next;

                if(fastCursor == slowCursor){
                    return true;
                }
            }
        }
    }
}
