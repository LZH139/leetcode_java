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
                if(i>m-1){
                    for(int j=0;j<n;j++){
                        nums1[i+j] = nums2[j];
                    }
                    break;

                }
                for(int j=n-1;j>=0;j--){
                    if(nums2[j]<nums1[i]){
                        temp = nums1[i];
                        nums1[i] = nums2[j];
                        nums2[j] = temp;

                    }
                }


            }

        }
    }

    /**
     * 双指针
     */

//    class Solution {
//        public void merge(int[] nums1, int m, int[] nums2, int n) {
//            // two get pointers for nums1 and nums2
//            int p1 = m - 1;
//            int p2 = n - 1;
//            // set pointer for nums1
//            int p = m + n - 1;
//
//            // while there are still elements to compare
//            while ((p1 >= 0) && (p2 >= 0))
//                // compare two elements from nums1 and nums2
//                // and add the largest one in nums1
//                nums1[p--] = (nums1[p1] < nums2[p2]) ? nums2[p2--] : nums1[p1--];
//
//            // add missing elements from nums2
//            System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
//        }
//    }
//
//    作者：LeetCode
//    链接：https://leetcode-cn.com/problems/merge-sorted-array/solution/he-bing-liang-ge-you-xu-shu-zu-by-leetcode/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

    public void printArray(int[] nums){
        System.out.println(nums.length);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
    }
}
