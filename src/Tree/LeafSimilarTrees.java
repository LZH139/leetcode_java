package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    public static void main(String[] argv){
        LeafSimilarTrees m = new LeafSimilarTrees();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{5,2,13};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.leafSimilar(treehead,treehead));
    }

    class Solution {
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            ArrayList<Integer> leaves1 = new ArrayList<>();
            ArrayList<Integer> leaves2 = new ArrayList<>();
            helper(root1,leaves1);
            helper(root2,leaves2);
            return leaves1.equals(leaves2);
        }

        public void helper(TreeNode root , List<Integer> list){
            if(root == null){
                return;
            }
            helper(root.left,list);
            if(root.left == null && root.right == null){
                list.add(root.val);
            }
            helper(root.right,list);
        }
    }
}
