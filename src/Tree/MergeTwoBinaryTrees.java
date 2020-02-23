package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class MergeTwoBinaryTrees {
    public static void main(String[] argv){
        MergeTwoBinaryTrees m = new MergeTwoBinaryTrees();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree1 = new Integer[]{1,3,2,5};
        TreeNode treehead1 = Tree.createTree(tree1);
        Integer[] tree2 = new Integer[]{2,1,3,null,4,null,7};
        TreeNode treehead2 = Tree.createTree(tree2);
        TreeNode a =  s.mergeTrees(treehead1,treehead2);
        System.out.println();
    }

    class Solution {
        public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
            if(t1!=null && t2!=null){
                t1.val += t2.val;
                t1.left = mergeTrees(t1.left,t2.left);
                t1.right = mergeTrees(t1.right,t2.right);
                return t1;
            }else if(t1 == null && t2 == null){
                return null;
            }else{
                return t1==null?t2:t1;
            }
        }
    }
}
