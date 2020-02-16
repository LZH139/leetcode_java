import Common.Tree;
import Common.TreeNode;

import java.util.*;

public class LevelOrderBottom {
    public static void main(String[] argv){
        LevelOrderBottom l = new LevelOrderBottom();
        l.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{3,9,20,null,null,15,7};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.levelOrderBottom(treehead));
    }

//    class Solution {
//        public List<List<Integer>> levelOrderBottom(TreeNode root) {
//            Queue<TreeNode> q  = new LinkedList<TreeNode>();
//            List<List<Integer>> result = new ArrayList<>();
//            if(root == null){
//                return result;
//            }
//
//            q.offer(root);
//            while (!q.isEmpty()){
//                ArrayList<TreeNode> a = new ArrayList<TreeNode>();
//                List<Integer> tempList = new ArrayList<>();
//                a.addAll(q);
//                q.clear();
//                for(TreeNode t:a){
//                    if(t.left!=null){
//                        q.offer(t.left);
//                    }
//                    if(t.right!=null){
//                        q.offer(t.right);
//                    }
//                    tempList.add(t.val);
//                }
//                result.add(tempList);
//
//            }
//            Collections.reverse(result);
//            return result;
//        }
//    }
    class Solution {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        //List<List<Integer>> list2=new ArrayList<List<Integer>>();
        public List<List<Integer>> levelOrderBottom(TreeNode root)
        {
            helper(root,0);
            Collections.reverse(list);
            return list;
        }
        public void helper(TreeNode node,int level)
        {
            if(node==null){
                return ;
            }

            if(list.size()==level)
            {
                list.add(new ArrayList<Integer>());
            }

            list.get(level).add(node.val);
            if(node.left!=null)
            {
                helper(node.left,level+1);
            }
            if(node.right!=null)
            {
                helper(node.right,level+1);
            }
        }
    }
}
