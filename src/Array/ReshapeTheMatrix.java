package Array;

public class ReshapeTheMatrix {
    public static void main(String[] argv){
        ReshapeTheMatrix d = new ReshapeTheMatrix();
        d.out();
    }

    public void out(){
        Solution s = new Solution();
        int[][] n = new int[][]{{1,2},{3,4}};
        System.out.print(s.matrixReshape(n,2,3));
    }

    public void printArray(int [] nums){
        for(int num:nums){
            System.out.print(num+" ");
        }
    }

    class Solution {
        public int[][] matrixReshape(int[][] nums, int r, int c) {
            int[][] result = new int[r][c];
            int count = 0;
            if(nums.length == 0 || nums.length*nums[0].length!=r*c){
                return nums;
            }
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums[0].length;j++){
                    result[count/c][count%c] = nums[i][j];
                    count++;
                }
            }
            return result;
        }
    }

}
