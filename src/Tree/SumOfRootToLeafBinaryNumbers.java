package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class SumOfRootToLeafBinaryNumbers {
    public static void main(String[] argv){
        SumOfRootToLeafBinaryNumbers m = new SumOfRootToLeafBinaryNumbers();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{5,2,13};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.sumRootToLeaf(treehead));
    }

    class Solution {
        public int sumRootToLeaf(TreeNode root) {

        }
    }

}
