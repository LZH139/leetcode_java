import Common.Tree.Tree;
import Common.Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreePaths {
    public static void main(String[] argv) {
        BinaryTreePaths d = new BinaryTreePaths();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        Integer[] tree = new Integer[]{1,2,3,null,5,null,null};
        TreeNode treehead = Tree.createTree(tree);
        List<String> result = s.binaryTreePaths(treehead);
        System.out.println();
    }

    class Solution {
        public List<String> path = new LinkedList();;
        public List<String> binaryTreePaths(TreeNode root) {
            if(root == null){
                return path;
            }
            binaryTreePaths(root,"");
            return path;
        }

        public void binaryTreePaths(TreeNode root, String str){
            if(root != null) {
                str = str + root.val;
                if(root.left == null && root.right == null){
                    path.add(str);
                    return;
                }

                str = str + "->";
                binaryTreePaths(root.left, str);
                binaryTreePaths(root.right, str);

            }
        }

    }

}
