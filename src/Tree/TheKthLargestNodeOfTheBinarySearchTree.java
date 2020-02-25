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
        Integer[] tree = new Integer[]{5,3,6,2,4,null,null,1};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.kthLargest(treehead,3));
    }

    class Solution {
        public int count = 0;
        public int kthLargest(TreeNode root, int k) {
            return helper(root,k);
        }

        public Integer helper(TreeNode root,int k){
            if(root == null){
                return null;
            }
            Integer r = helper(root.right,k);
            count++;
            if(count == k){
                return root.val;
            }
            Integer l = helper(root.left,k);
            return r==null?l:r;
        }
    }

}
