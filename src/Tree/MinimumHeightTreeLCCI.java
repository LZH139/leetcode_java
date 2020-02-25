package Tree;

import Common.Tree.Tree;
import Common.Tree.TreeNode;

public class MinimumHeightTreeLCCI {
    public static void main(String[] argv){
        MinimumHeightTreeLCCI m = new MinimumHeightTreeLCCI();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] tree = new int[]{-10,-3,0,5,9};
        TreeNode a = s.sortedArrayToBST(tree);
        System.out.println();
    }

    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            return build(0,nums.length-1,nums);
        }

        public TreeNode build(int start,int end,int[] nums){
            if(end<start){
                return null;
            }
            int mid = start+(end-start)/2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = build(start,mid-1,nums);
            root.right = build(mid+1,end,nums);
            return root;
        }


    }


}
