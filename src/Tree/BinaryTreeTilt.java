package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class BinaryTreeTilt {
    public static void main(String[] argv){
        BinaryTreeTilt m = new BinaryTreeTilt();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{1,2,3,4,null,5};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.findTilt(treehead));
    }

    class Solution {
        public int sum;
        public int findTilt(TreeNode root) {
            if(root == null) {
                return 0;
            }
            helper(root);
            return sum;
        }

        public  int helper(TreeNode root){
            if(root == null){
                return 0;
            }
            int left = helper(root.left);
            int right = helper(root.right);
            sum+=Math.abs(left-right);
            return left+right+root.val;
        }
    }

}
