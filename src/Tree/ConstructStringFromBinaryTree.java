package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class ConstructStringFromBinaryTree {
    public static void main(String[] argv){
        ConstructStringFromBinaryTree m = new ConstructStringFromBinaryTree();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{5,2,13};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.tree2str(treehead));
    }
    class Solution {
        public String tree2str(TreeNode t) {
            if(t == null){
                return "";
            }
            if (t.left == null && t.right == null) {
                return t.val+"";
            }
            if(t.right==null) {
                return t.val + "(" + tree2str(t.left) + ")";
            }
            return t.val+"("+tree2str(t.left)+")"+"("+tree2str(t.right)+")";
        }


    }

}
