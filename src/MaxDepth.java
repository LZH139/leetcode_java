import Common.Tree;
import Common.TreeNode;

public class MaxDepth {
    public static void main(String[] argv){
        MaxDepth m = new MaxDepth();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{1,2,2,3,4,4,3};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.maxDepth(treehead));
    }

    class Solution {
        private int maxdepth;
        public int maxDepth(TreeNode root) {
            if(root == null){
                return 0;
            }
            int depth = 1;

            maxdepth(root,depth);

            return maxdepth;
        }

        public void maxdepth(TreeNode root,int depth){
            if (root.left == null && root.right == null) {
                maxdepth = Math.max(maxdepth, depth);
            }
            maxdepth(root.left,depth+1);
            maxdepth(root.right,depth+1);

        }
    }
}
