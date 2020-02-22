package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class SubtreeOfAnotherTree {
    public static void main(String[] argv){
        SubtreeOfAnotherTree m = new SubtreeOfAnotherTree();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{5,2,13};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.isSubtree(treehead,treehead));
    }

    class Solution {
        public boolean isSubtree(TreeNode s, TreeNode t) {

        }
    }

}
