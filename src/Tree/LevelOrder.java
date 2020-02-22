package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class LevelOrder {
    public static void main(String[] argv){
        LevelOrder l = new LevelOrder();
        l.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{};
        TreeNode treehead = Tree.createTree(tree);
        s.levelOrder(treehead);
    }

    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<TreeNode> q = new LinkedList<>();
            List<List<Integer>> list = new LinkedList<>();
            List<Integer> tempList = new LinkedList<>();
            if(root == null){
                return list;
            }
            int size = 0;
            q.add(root);
            while (!q.isEmpty()){
                size = q.size();

                for(int i=0;i<size;i++){
                    if(q.get(i).left!=null){
                        q.add(q.get(i).left);
                    }
                    if(q.get(i).right!=null){
                        q.add(q.get(i).right);
                    }
                }

                for(int i=0;i<size;i++){
                    tempList.add(q.get(0).val);
                    q.remove(0);
                }
                list.add(tempList);
                tempList = new LinkedList<>();
            }
            return list;
        }
    }

//    class Solution {
//
//        public List<List<Integer>> levelOrder(TreeNode root) {
//            List<List<Integer>> res = new ArrayList<>();
//            if (root == null) return res;
//
//            Queue<TreeNode> queue = new LinkedList<>();
//            queue.offer(root);
//            while (!queue.isEmpty()) {
//                List<Integer> sub = new ArrayList<>();
//                int size = queue.size();
//                for (int i=0; i<size; i++) {
//                    TreeNode node = queue.poll();
//                    sub.add(node.val);
//                    if (node.left != null) queue.offer(node.left);
//                    if (node.right != null) queue.offer(node.right);
//                }
//                res.add(sub);
//            }
//            return res;
//        }
//    }
}
