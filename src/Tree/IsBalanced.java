package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class IsBalanced {
    public static void main(String[] argv){
        IsBalanced i = new IsBalanced();
        i.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{3,9,20,null,null,15,7};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.isBalanced(treehead));
    }

    class Solution {
        public boolean isBalanced(TreeNode root) {
            if(root == null){
                return true;
            }
            return getDepth(root) != -1;

        }

        public int getDepth(TreeNode root){
            if(root == null){
                return 0;
            }
            int left = getDepth(root.left);
            int right = getDepth(root.right);
            if(Math.abs(right-left)>1){
                return -1;
            }
            if(left == -1 || right == -1){
                return -1;
            }else{
                return Math.max(left,right)+1;
            }
        }

    }
}
