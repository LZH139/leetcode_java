package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class UnivaluedBinaryTree {
    public static void main(String[] argv){
        UnivaluedBinaryTree m = new UnivaluedBinaryTree();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{2,2,2,5,2};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.isUnivalTree(treehead));
    }
    class Solution {
        Integer num = null;
        public boolean isUnivalTree(TreeNode root) {
            if(root == null){
                return true;
            }
            if(num == null){
                num = root.val;
            }
            if(root.val!=num){
                return false;
            }
            return isUnivalTree(root.left)&&isUnivalTree(root.right);
        }
    }

}
