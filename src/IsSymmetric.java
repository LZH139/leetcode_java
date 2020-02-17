import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class IsSymmetric {
    public static void main(String[] argv){
        IsSymmetric i = new IsSymmetric();
        i.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{1,2,2,3,4,4,3};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.isSymmetric(treehead));
    }

    class Solution {
        public boolean isSymmetric(TreeNode root) {
            if(root == null){
                return true;
            }
            return Symmetric(root.left,root.right);

            }

        public boolean Symmetric(TreeNode left, TreeNode right){
            if(left == null && right == null){
                return true;
            }
            if(left == null || right == null){
                return false;
            }
            return left.val == right.val && Symmetric(left.left,right.right) && Symmetric(left.right,right.left);

        }

    }
}
