package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

import java.util.LinkedList;

public class MinimumAbsoluteDifferenceInBST {
    public static void main(String[] argv){
        MinimumAbsoluteDifferenceInBST m = new MinimumAbsoluteDifferenceInBST();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{236,104,701,null,227,null,911};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.getMinimumDifference(treehead));
    }

    class Solution {
        public LinkedList<Integer> list = new LinkedList<>();
        public int getMinimumDifference(TreeNode root) {
            helper(root);
            int min = Integer.MAX_VALUE;
            for(int i=1;i<list.size();i++){
                if(list.get(i)-list.get(i-1)<min){
                    min = list.get(i)-list.get(i-1);
                }
            }
            return min;
        }

        public void helper(TreeNode root){
            if(root.left!=null){
                helper(root.left);
            }
            list.add(root.val);
            if(root.right!=null){
                helper(root.right);
            }
        }
    }
}
