import Common.Tree;
import Common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PostorderTraversal {
    public static void main(String[] argv){
        PostorderTraversal p = new PostorderTraversal();
        p.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{1,null,2,3};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.isSameTree(treehead));
    }

    class Solution {
        public List<Integer> isSameTree(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            Stack<TreeNode> s = new Stack<>();

            if (root == null) {
                return list;
            }
            s.push(root);
            while (!s.isEmpty()){
                root = s.pop();
                list.add(0,root.val);

                if(root.left!=null){
                    s.push(root.left);
                }

                if(root.right!=null){
                    s.push(root.right);
                }
            }
            return list;
        }
    }
}
