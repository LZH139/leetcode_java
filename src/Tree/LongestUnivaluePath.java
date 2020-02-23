package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class LongestUnivaluePath {
    public static void main(String[] argv){
        LongestUnivaluePath m = new LongestUnivaluePath();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{5,2,13};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.longestUnivaluePath(treehead));
    }

    class Solution {
        public int longestUnivaluePath(TreeNode root) {
            return 0;
        }
    }

}
