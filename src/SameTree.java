import Common.Tree.Tree;
import Common.Tree.TreeNode;

import java.util.Stack;

public class SameTree {
    public static void main(String[] argv){
        SameTree s = new SameTree();
        s.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree1 = new Integer[]{2,null,4};
        Integer[] tree2 = new Integer[]{2,3,4};
        TreeNode treehead1 = Tree.createTree(tree1);
        TreeNode treehead2 = Tree.createTree(tree2);
        System.out.println(s.isSameTree(null,treehead2));
    }

    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            Stack<TreeNode> pstack = new Stack<>();
            Stack<TreeNode> qstack = new Stack<>();

            while (p != null || !pstack.isEmpty() || q != null || !qstack.isEmpty()){
                if(p!=null && q!=null){
                    pstack.push(p);
                    qstack.push(q);
                    if(p.val == q.val){
                        p = p.left;
                        q = q.left;
                    }else{
                        return false;
                    }
                }else if(p == null && q==null){
                    p = pstack.pop().right;
                    q = qstack.pop().right;
                    if(q!=null && p!=null){
                        if(q.val !=p.val){
                            return false;
                        }
                    }
                }else{
                    return false;
                }
            }
            return true;
        }
    }
}
