package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class MinimumDistanceBetweenBSTNodes {
    public static void main(String[] argv){
        MinimumDistanceBetweenBSTNodes m = new MinimumDistanceBetweenBSTNodes();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{27,null,34,null,58,50,null,44,null,null,null};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.minDiffInBST(treehead));
    }

    class Solution {
        Integer prev = null;
        Integer min = Integer.MAX_VALUE;
        public int minDiffInBST(TreeNode root) {
            helper(root);
            return min;
        }

        public void helper(TreeNode root){
            if(root == null){
                return;
            }
            helper(root.left);
            if(prev != null && root.val-prev<min){
                min = root.val-prev;
            }
            prev = root.val;
            helper(root.right);
        }
    }

}
