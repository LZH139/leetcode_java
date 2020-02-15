import Common.Tree;
import Common.TreeNode;

public class HasPathSum {
        public static void main(String[] argv){
            HasPathSum m = new HasPathSum();
            m.out();
        }

        public void out(){
            Solution s = new Solution();
            Integer[] tree = new Integer[]{1,2};
            TreeNode treehead = Tree.createTree(tree);
            System.out.println(s.hasPathSum(treehead,2));
        }

//    class Solution {
//        public boolean hasPathSum(TreeNode root, int sum) {
//            if(root == null){
//                return false;
//            }
//            return pathSum(root, root.val,sum);
//        }
//
//        public boolean pathSum(TreeNode root, int sum, int totalsum){
//            if(root.left == null && root.right == null){
//                return sum == totalsum;
//            }
//            if(root.left == null){
//                return pathSum(root.right, sum+root.val, totalsum);
//            }
//
//            if(root.right == null){
//                return pathSum(root.left, sum+root.val, totalsum);
//            }
//
//            return pathSum(root.left,sum+root.val, totalsum) || pathSum(root.right,sum+root.val, totalsum);
//
//
//        }
//    }
    class Solution {
        public boolean hasPathSum(TreeNode root, int sum) {
            if (root == null){
                return false;
            }

            if (root.left == null && root.right == null){
                return sum - root.val == 0;
            }
            return hasPathSum(root.left,sum - root.val) || hasPathSum(root.right,sum - root.val);
        }
    }

}
