package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {
    public static void main(String[] argv){
        AverageOfLevelsInBinaryTree m = new AverageOfLevelsInBinaryTree();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{2147483647,2147483647,2147483647};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.averageOfLevels(treehead));
    }

//    递归版本
//    class Solution {
//        public LinkedList<Double> sumList = new LinkedList<>();
//        public LinkedList<Double> countList = new LinkedList<>();
//
//        public List<Double> averageOfLevels(TreeNode root) {
//            helper(root,0);
//            List<Double> list = new LinkedList<>();
//            for(int i=0;i<sumList.size();i++){
//                list.add((double)sumList.get(i) / countList.get(i));
//            }
//            return list;
//        }
//
//        public void helper(TreeNode root, int depth) {
//            if(root == null){
//                return;
//            }
//            if(depth>sumList.size()-1){
//                sumList.add((double)root.val);
//                countList.add(1d);
//            }else{
//                sumList.set(depth,sumList.get(depth)+root.val);
//                countList.set(depth, countList.get(depth)+1);
//            }
//            helper(root.left,depth+1);
//            helper(root.right,depth+1);
//        }
//
//    }

//    队列版本

    class Solution {
        public List<Double> averageOfLevels(TreeNode root) {
            if(root == null)
                return null;
            List<Double> res = new LinkedList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                int size = queue.size();
                double total = 0;
                for(int i=0;i<size;i++){
                    TreeNode node = queue.poll();
                    total += node.val;
                    if(node.left!=null)
                        queue.add(node.left);
                    if(node.right!=null)
                        queue.add(node.right);
                }
                res.add(total/size);
            }
            return res;

        }
    }
}
