package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class TrimABinarySearchTree {
    public static void main(String[] argv){
        TrimABinarySearchTree m = new TrimABinarySearchTree();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{1,0,2};
        TreeNode treehead = Tree.createTree(tree);
        TreeNode a = s.trimBST(treehead,1,2);
        System.out.println();
    }

    class Solution {
        public TreeNode trimBST(TreeNode root, int L, int R) {
            if(root == null){
                return null;
            }
            if(root.val<L){
                return trimBST(root.right,L,R);
            }
            if(root.val>R){
                return trimBST(root.left,L,R);
            }
            root.left = trimBST(root.left,L,R);
            root.right = trimBST(root.right,L,R);
            return root;
        }
    }

}
