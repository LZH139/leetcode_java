package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class TwoSumIVInputIsABST {
    public static void main(String[] argv){
        TwoSumIVInputIsABST m = new TwoSumIVInputIsABST();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{5,3,6,2,4,null,7};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.findTarget(treehead,28));
    }

    class Solution {
        public boolean findTarget(TreeNode root, int k) {
            if(root == null){
                return false;
            }
            LinkedList<Integer> list = new LinkedList<>();
            helper(root,list);
            int lcursor = 0;
            int rcursor = list.size()-1;
            int temp;
            while (lcursor!=rcursor){
                temp = list.get(lcursor)+list.get(rcursor);
                if(temp == k){
                    return true;
                }
                if(temp>k){
                    rcursor--;
                }else{
                    lcursor++;
                }
            }
            return false;

        }

        public void helper(TreeNode root, LinkedList list){
            if(root == null){
                return;
            }
            helper(root.left,list);
            list.add(root.val);
            helper(root.right,list);
        }

    }

}
