import Common.List.List;
import Common.List.ListNode;

public class SwapNodesInPairs {
    public static void main(String[] argv){
        SwapNodesInPairs s = new SwapNodesInPairs();
        s.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] n = new int[]{1};
        ListNode l = List.createList(n);
        ListNode a = s.swapPairs(l);
        System.out.println();

    }

    class Solution {
        public ListNode swapPairs(ListNode head) {

        }
    }

}
