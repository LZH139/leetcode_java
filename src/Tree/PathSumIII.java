package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class PathSumIII {
    public static void main(String[] argv){
        PathSumIII m = new PathSumIII();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        Integer[] tree = new Integer[]{10,5,-3,3,2,null,11,3,-2,null,1};
        TreeNode treehead = Tree.createTree(tree);
        System.out.println(s.pathSum(treehead,8));
    }

    class Solution {
        int count=0;
        public int pathSum(TreeNode root, int sum) {
            if(root == null){
                return 0;
            }
            int[] sumlist = new int [1001];
            helper(root,sum,sumlist,1);
            return count;
        }

        public void helper(TreeNode root, int sum, int[] sumlist, int cursor){
            if(root == null){
                return;
            }
            int su = root.val+sumlist[cursor-1];
            sumlist[cursor] = su;
            if(su == sum){
                count++;
            }
            for(int i=1;i<cursor;i++){
                if(sumlist[i] == su-sum){
                    count++;
                }
            }
            helper(root.left,sum,sumlist,cursor+1);
            helper(root.right,sum,sumlist,cursor+1);
        }
    }
}
