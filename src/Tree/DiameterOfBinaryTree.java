package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class DiameterOfBinaryTree {
    public static void main(String[] argv){
        DiameterOfBinaryTree m = new DiameterOfBinaryTree();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{1,2,3,4,5};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.diameterOfBinaryTree(treehead));
    }

    class Solution {
        public int sum = 0;
        public int diameterOfBinaryTree(TreeNode root) {
            if(root == null){
                return sum;
            }
            helper(root);
            return sum;
        }
        public int helper(TreeNode root){
            if(root == null){
                return 0;
            }
            int left = helper(root.left);
            int right = helper(root.right);
            if(left+right>sum){
                sum = left+right;
            }
            return Math.max(left,right)+1;
        }
    }

}
