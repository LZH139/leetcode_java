package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class InorderTraversal {
    public static void main(String[] argv){
        InorderTraversal i = new InorderTraversal();
        i.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{1,null,2,3};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.inorderTraversal(treehead));
    }

//    class Solution {
//        public List<Integer> inorderTraversal(TreeNode root) {
//            List<Integer> list = new LinkedList<>();
//            Stack<TreeNode> s = new Stack<>();
//
//            while (root != null || !s.isEmpty()){
//                if(root !=null){
//                    s.push(root);
//                    root = root.left;
//
//                }else{
//                    root = s.pop();
//                    list.add(root.val);
//                    root = root.right;
//                }
//            }
//            return list;
//        }
//    }

//    递归版本
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if(root == null){
            return list;
        }
        list.addAll(inorderTraversal(root.left));
        list.add(root.val);
        list.addAll(inorderTraversal((root.right)));
        return list;
    }
}
}
