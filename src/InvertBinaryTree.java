import Common.List.List;
import Common.List.ListNode;
import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class InvertBinaryTree {

    public static void main(String[] argv) {
        InvertBinaryTree d = new InvertBinaryTree();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        Integer[] tree = new Integer[]{1,2};
        TreeNode treehead = Tree.createTree(tree);
        TreeNode result = s.invertTree(treehead);
        System.out.println();
    }

    class Solution {
        public TreeNode invertTree(TreeNode root) {
            if(root == null){
                return root;
            }
            TreeNode left = invertTree(root.left);
            TreeNode right = invertTree(root.right);
            if(left!=null || right!=null){
                root.left = right;
                root.right = left;
            }
            return root;
        }
    }

}
