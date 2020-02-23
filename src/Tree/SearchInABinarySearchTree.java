package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class SearchInABinarySearchTree {
    public static void main(String[] argv){
        SearchInABinarySearchTree m = new SearchInABinarySearchTree();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{4,2,7,1,3};
        TreeNode treehead = Tree.createTree(tree);
        TreeNode a = s.searchBST(treehead,2);
        System.out.println();
    }

//    class Solution {
//        public TreeNode searchBST(TreeNode root, int val) {
//            if(root == null || root.val == val){
//                return root;
//            }
//            TreeNode t = searchBST(root.left,val);
//            return t==null?searchBST(root.right,val):t;
//        }
//    }

    class Solution {
        public TreeNode searchBST(TreeNode root, int val) {
            if (root == null || val == root.val) {
                return root;
            }
            return val < root.val ? searchBST(root.left, val) : searchBST(root.right, val);
    }
}



}
