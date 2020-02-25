package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class TheKthLargestNodeOfTheBinarySearchTree {
    public static void main(String[] argv){
        TheKthLargestNodeOfTheBinarySearchTree m = new TheKthLargestNodeOfTheBinarySearchTree();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{5,2,13};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.convertBST(treehead));
    }

    class Solution {
        public int kthLargest(TreeNode root, int k) {

        }
    }

}
