package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class IncreasingOrderSearchTree {
    public static void main(String[] argv){
        IncreasingOrderSearchTree m = new IncreasingOrderSearchTree();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{379,826};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.increasingBST(treehead));
    }

    class Solution {
        public TreeNode increasingBST(TreeNode root) {
            List<TreeNode> list = new LinkedList<>();
            helper(root,list);
            for(int i=0;i<list.size();i++){
                list.get(i).left = null;
                if(i == list.size()-1){
                    list.get(i).left = null;
                    list.get(i).right = null;
                }else{
                    list.get(i).right = list.get(i+1);
                }

            }
            return list.get(0);
        }
        public void helper(TreeNode root, List<TreeNode> list){
            if(root == null){
                return;
            }
            helper(root.left,list);
            list.add(root);
            helper(root.right,list);
        }
    }

}
