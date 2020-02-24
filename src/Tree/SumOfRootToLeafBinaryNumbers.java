package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class SumOfRootToLeafBinaryNumbers {
    public static void main(String[] argv){
        SumOfRootToLeafBinaryNumbers m = new SumOfRootToLeafBinaryNumbers();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{1,0,1,0,1,0,1};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.sumRootToLeaf(treehead));
    }

    class Solution {
        public int sum = 0;
        public int sumRootToLeaf(TreeNode root) {
            helper(root,0);
            return sum;
        }
        public void helper(TreeNode root, int su){
            if(root==null){
                return;
            }
            int s = root.val+su*2;
            if(root.left == null && root.right == null) {
                sum = sum+s;
                return;
            }
            helper(root.left,s);
            helper(root.right,s);
        }
    }

}
