package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class CousinsInBinaryTree {
    public static void main(String[] argv){
        CousinsInBinaryTree m = new CousinsInBinaryTree();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{1,null,2,3,null,null,4,null,5};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.isCousins(treehead,1,3));
    }

    class Solution {
        Integer dep = null;
        TreeNode pre;
        public boolean isCousins(TreeNode root, int x, int y) {
            return helper(root, x, y,0);
        }

        public boolean helper(TreeNode root, int x, int y, int depth){
            if(root == null) return false;
            if(root.val == x || root.val == y){
                if(dep == null){
                    dep = depth;
                    return false;
                }else{
                    return (pre.left!=root && pre.right!=root) && depth == dep;
                }
            }
            if (dep==null) pre = root;
            return helper(root.left,x,y,depth+1) || helper(root.right,x,y,depth+1);
        }
    }

}
