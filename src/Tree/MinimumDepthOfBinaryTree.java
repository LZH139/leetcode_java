package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class MinimumDepthOfBinaryTree {
    public static void main(String[] argv){
        MinimumDepthOfBinaryTree m = new MinimumDepthOfBinaryTree();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{3,9,20,null,null,15,7};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.minDepth(treehead));
    }
//    class Solution {
//        public int minDepth(TreeNode root) {
//            if(root == null){
//                return 0;
//            }
//            return getMinDepth(root,1);
//        }
//
//        public int getMinDepth(TreeNode root, int depth){
//            if(root.left == null && root.right == null){
//                return depth;
//            }
//
//            if(root.left == null || root.right == null){
//               return root.left == null ? getMinDepth(root.right,depth+1): getMinDepth(root.left,depth+1);
//            }
//
//            int right = getMinDepth(root.right,depth+1);
//            int left = getMinDepth(root.left,depth+1);
//            return Math.min(left,right);
//        }
//    }
class Solution {
    public int minDepth(TreeNode root) {

        if(root == null){
            return 0;
        }
        if(root.left == null || root.right == null){
            return root.left == null? minDepth(root.right) + 1 : minDepth(root.left) + 1;
        }
        return Math.min(minDepth(root.left),minDepth(root.right))+1;
    }
}
}
