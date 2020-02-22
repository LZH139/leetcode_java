package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class SumOfLeftLeaves {
    public static void main(String[] argv) {
        SumOfLeftLeaves d = new SumOfLeftLeaves();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        Integer[] tree = new Integer[]{3,9,10,null,null,15,7};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.sumOfLeftLeaves(treehead));
    }
    class Solution {
        public int sumOfLeftLeaves(TreeNode root) {
            return helper(root,false);
        }

        public int helper(TreeNode root,boolean isLeft){
            if(root == null) {
                return 0;
            }
            if(root.left == null && root.right==null && isLeft) {
                return root.val;
            }
            return helper(root.left,true)+helper(root.right,false);
        }
    }
}
