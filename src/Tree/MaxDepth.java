package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

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

//    class Solution {
//        private int maxdepth;
//        public int maxDepth(TreeNode root) {
//            int depth = 1;
//            maximum_depth(root,depth);
//            return maxdepth;
//        }
//
//        public void maximum_depth(TreeNode root,int depth){
//            if (root == null) {
//                return;
//            }
//            if (root.left == null && root.right == null) {
//                maxdepth = Math.max(maxdepth, depth);
//            }
//            maximum_depth(root.left,depth+1);
//            maximum_depth(root.right,depth+1);
//
//        }
//    }

    class Solution {
        public int maxDepth(TreeNode root) {
            if(root==null){
                return 0;
            }
            int leftHeight=maxDepth(root.left);
            int rightHeight=maxDepth(root.right);
            return Math.max(leftHeight,rightHeight)+1;
        }
    }
}
