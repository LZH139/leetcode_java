package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class LowestCommonAncestorOfABinaryTree {
    public static void main(String[] argv){
        LowestCommonAncestorOfABinaryTree m = new LowestCommonAncestorOfABinaryTree();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{3,5,1,6,2,0,8,null,null,7,4};
        TreeNode treehead = Tree.createTree(tree);
        TreeNode a = s.lowestCommonAncestor(treehead,Tree.createTree(new Integer[]{5}),Tree.createTree(new Integer[]{4}));
        System.out.println();
    }

    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null){
                return null;
            }
            if(root.val == p.val||root.val == q.val){
                return root;
            }
            TreeNode a = lowestCommonAncestor(root.left,p,q);
            TreeNode b = lowestCommonAncestor(root.right,p,q);
            if(a!=null&&b!=null){
                return root;
            }
            return a==null?b:a;
        }
    }

}
