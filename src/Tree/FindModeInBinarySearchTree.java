package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class FindModeInBinarySearchTree {
    public static void main(String[] argv){
        FindModeInBinarySearchTree m = new FindModeInBinarySearchTree();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{1,1,2,null,null,2,3};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.findMode(treehead));
    }

    class Solution {
        public int[] findMode(TreeNode root) {
            List<Integer> list = InorderTraversa(root);
            int temp =list.get(0);
            int count=1;
            int max = Integer.MIN_VALUE;
            int cursor = 1;
            for(int i=1;i<list.size();i++){

            }
            return new int[5];
        }

        public List<Integer> InorderTraversa(TreeNode root){
            List<Integer> list = new LinkedList<>();
            if(root == null){
                return list;
            }

            list.addAll(InorderTraversa(root.left));
            list.add(root.val);
            list.addAll(InorderTraversa((root.right)));
            return list;


        }
    }
}
