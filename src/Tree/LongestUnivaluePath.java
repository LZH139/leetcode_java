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
        Integer[] tree = new Integer[]{5,4,5,1,1,null,5};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.longestUnivaluePath(treehead));
    }

    class Solution {
        int ans = 0;
        public int longestUnivaluePath(TreeNode root) {
            helper(root);
            return ans;
        }

        public int helper(TreeNode root){
            if(root == null){
                return 0;
            }
            int left = helper(root.left);
            int right = helper(root.right);
            int arrowLeft = 0, arrowRight = 0;
            if(root.left!=null&&root.left.val == root.val){
                arrowLeft += left+1;
            }
            if(root.right!=null&&root.right.val == root.val){
                arrowRight += right+1;
            }
            ans = Math.max(ans, arrowLeft + arrowRight);
            return Math.max(arrowLeft,arrowRight);
        }
    }

}
