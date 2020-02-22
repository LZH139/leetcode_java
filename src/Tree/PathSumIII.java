package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class PathSumIII {
    public static void main(String[] argv){
        PathSumIII m = new PathSumIII();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{10,5,-3,3,2,null,11,3,-2,null,1};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.pathSum(treehead,8));
    }

    class Solution {
        public int pathSum(TreeNode root, int sum) {
            return 1;
        }
    }
}
