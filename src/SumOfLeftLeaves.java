import Common.Tree.Tree;
import Common.Tree.TreeNode;

import java.util.List;

public class SumOfLeftLeaves {
    public static void main(String[] argv) {
        SumOfLeftLeaves d = new SumOfLeftLeaves();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        Integer[] tree = new Integer[]{1,2,3,null,5,null,null};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.sumOfLeftLeaves(treehead));
    }
    class Solution {
        public int sumOfLeftLeaves(TreeNode root) {

        }
    }
}
