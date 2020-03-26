import Common.List.List;
import Common.List.ListNode;
import Common.Tree.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {
    public static void main(String[] argv) {
        ConvertSortedArrayToBinarySearchTree d = new ConvertSortedArrayToBinarySearchTree();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{-10, -3, 0, 5, 9};
        ListNode l = List.createList(n);
        System.out.println(s.sortedArrayToBST(n));
    }
 
    class Solution {
        int[] nums;

        public TreeNode helper(int left, int right) {
            if (left > right) {
                return null;
            }

            int p = (left + right) / 2;

            TreeNode root = new TreeNode(nums[p]);
            root.left = helper(left, p - 1);
            root.right = helper(p + 1, right);
            return root;
        }

        public TreeNode sortedArrayToBST(int[] nums) {
            this.nums = nums;
            return helper(0, nums.length - 1);
        }
    }
}
