package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class RangeSumOfBST {
    public static void main(String[] argv){
        RangeSumOfBST m = new RangeSumOfBST();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{10,5,15,3,7,13,18,1,null,6};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.rangeSumBST(treehead,6,10));
    }

    class Solution {
        public int rangeSumBST(TreeNode root, int L, int R) {
            if(root == null){
                return 0;
            }
            if(root.val>R){
                return rangeSumBST(root.left,L,R);
            }else if(root.val<L){
                return rangeSumBST(root.right,L,R);
            }else{
                return rangeSumBST(root.left,L,R)+root.val+rangeSumBST(root.right,L,R);
            }
        }
    }
}
