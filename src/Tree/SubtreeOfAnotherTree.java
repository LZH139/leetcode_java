package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class SubtreeOfAnotherTree {
    public static void main(String[] argv) {
        SubtreeOfAnotherTree m = new SubtreeOfAnotherTree();
        m.out();
    }

    public void out() {
        Solution s = new Solution();
//        Integer[] tree1 = new Integer[]{3,4,5,1,2};
//        Integer[] tree2 = new Integer[]{4,1,2};
        Integer[] tree1 = new Integer[]{3,4,5,1,2,null,null,null,null,0};
        Integer[] tree2 = new Integer[]{4,1,2};
        TreeNode treehead1 = Tree.createTree(tree1);
        TreeNode treehead2 = Tree.createTree(tree2);
        System.out.println(s.isSubtree(treehead1, treehead2));
    }

    class Solution {
        public boolean isSubtree(TreeNode s, TreeNode t) {
            if(s==null && t == null){
                return true;
            }else if(s!=null&&t!=null){
                if (equal(s, t)) {
                    return true;
                } else {
                    return isSubtree(s.left, t) || isSubtree(s.right, t);
                }
            }else{
                return false;
            }
        }


        public boolean equal(TreeNode s, TreeNode t) {
            if (s == null && t == null) {
                return true;
            }else if(s!=null && t!=null){
                if (s.val == t.val) {
                    return equal(s.left, t.left) && equal(s.right, t.right);
                } else {
                    return false;
                }
            }else{
                return false;
            }

        }


    }
}


