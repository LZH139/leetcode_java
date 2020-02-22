package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class ConvertBSTToGreaterTree {
    public static void main(String[] argv){
        ConvertBSTToGreaterTree m = new ConvertBSTToGreaterTree();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{5,2,13};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.convertBST(treehead));
    }

    class Solution {
        public int sum = 0;
        public TreeNode convertBST(TreeNode root) {
            if(root == null){
                return root;
            }
            helper(root);
            return root;
        }

        public void helper(TreeNode root){
            if(root == null){
                return;
            }
            helper(root.right);
            sum =  sum+root.val;
            root.val = sum;
            helper(root.left);
        }
    }
}
