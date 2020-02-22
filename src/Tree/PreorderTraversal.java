package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class PreorderTraversal {
    public static void main(String[] argv){
        PreorderTraversal p = new PreorderTraversal();
        p.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{1,null,2,3};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.preorderTraversal(treehead));
    }

//    class Solution {
////        public List<Integer> preorderTraversal(TreeNode root) {
////            List<Integer> list = new LinkedList<>();
////            Stack<TreeNode> s = new Stack<>();
////
////            while (root != null || !s.isEmpty()){
////                if(root != null){
////                    s.push(root);
////                    list.add(root.val);
////                    root = root.left;
////                }else{
////                    root = s.pop().right;
////
////                }
////            }
////            return list;
////
////
////        }
////    }

//递归版本
    class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> list = new LinkedList<>();
            if(root == null){
                return list;
            }
            list.add(root.val);
            list.addAll(preorderTraversal(root.left));
            list.addAll(preorderTraversal((root.right)));
            return list;


        }
    }
}
