package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class SecondMinimumNodeInABinaryTree {
    public static void main(String[] argv){
        SecondMinimumNodeInABinaryTree m = new SecondMinimumNodeInABinaryTree();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{2,2,2};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.findSecondMinimumValue(treehead));
    }

    class Solution {
        public int findSecondMinimumValue(TreeNode root) {
            return helper(root,root.val);
        }
        public int helper(TreeNode root,int min){
            if(root == null){
                return -1;
            }
            if(root.val>min){
                return root.val;
            }
            int left = helper(root.left,min);
            int right = helper(root.right,min);
            if(left == -1){
                return right;
            }
            if(right == -1){
                return left;
            }
            return Math.min(left,right);

        }

    }

}
