public class Merge {

    public static void main(String[] argv){
        Merge m = new Merge();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] a = new int[]{-10,-10,-9,-9,-9,-8,-8,-7,-7,-7,-6,-6,-6,-6,-6,-6,-6,-5,-5,-5,-4,-4,-4,-3,-3,-2,-2,-1,-1,0,1,1,1,2,2,2,3,3,3,4,5,5,6,6,6,6,7,7,7,7,8,9,9,9,9,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[] b = new int[]{-10,-10,-9,-9,-9,-9,-8,-8,-8,-8,-8,-7,-7,-7,-7,-7,-7,-7,-7,-6,-6,-6,-6,-5,-5,-5,-5,-5,-4,-4,-4,-4,-4,-3,-3,-3,-2,-2,-2,-2,-2,-2,-2,-1,-1,-1,0,0,0,0,0,1,1,1,2,2,2,2,2,2,2,2,3,3,3,3,4,4,4,4,4,4,4,5,5,5,5,5,5,6,6,6,6,6,7,7,7,7,7,7,7,8,8,8,8,9,9,9,9};
        s.merge(a,55,b,99);
        printArray(a);
        System.out.println();
        printArray(b);

    }

    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int temp;
            if(nums2.length == 0){
                return;
            }
            for(int i=0;i<m+n;i++){
                for(int j=n-1;j>=0;j--){
                    if(nums2[j]<nums1[i]){
                        temp = nums1[i];
                        nums1[i] = nums2[j];
                        nums2[j] = temp;
                    }
                }
                if(i>m-1){
                    for(int j=0;j<n;j++){
                        nums1[i+j] = nums2[j];
                    }
                    break;
                }

            }

        }
    }

    public void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
    }
}
