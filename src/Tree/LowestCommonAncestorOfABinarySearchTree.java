package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class LowestCommonAncestorOfABinarySearchTree {
    public static void main(String[] argv) {
        LowestCommonAncestorOfABinarySearchTree d = new LowestCommonAncestorOfABinarySearchTree();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        Integer[] tree = new Integer[]{6,2,8,0,4,7,9,null,null,3,5};
        TreeNode treehead = Tree.createTree(tree);
        TreeNode result = s.lowestCommonAncestor(treehead,new TreeNode(2),new TreeNode(8));
        System.out.println();
    }

    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null){
                return root;
            }
            if(root.val>p.val && root.val>q.val){
                return lowestCommonAncestor(root.left,p,q);
            }else if(root.val<p.val && root.val<q.val){
                return lowestCommonAncestor(root.right,p,q);
            }else{
                return root;
            }
        }
    }
}
