public class MaxSubArray {
    public static void main(String[] argv){
        MaxSubArray m = new MaxSubArray();
        m.out();
    }

    public void out(){
        Solution s = new Solution();
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(s.maxSubArray(nums));


    }


//    class Solution {
//        public int maxSubArray(int[] nums){
//            int temp= nums[0];
//            int result = nums[0];
//            if(nums.length == 1){
//                return temp;
//            }
//            for(int i=1;i<nums.length;i++){
//                if(temp<0){
//                    temp = 0;
//                }
//                temp = temp + nums[i];
//                if(temp>result){
//                    result = temp;
//                }
//            }
//            return result;
//        }
//    }


    /***
     * 分治法
     */
    class Solution {
        public int maxSubArray(int[] nums){

            int numsLength = nums.length;
            int middle = numsLength/2;
            int leftMax,rightMax,crossMax;

            if(numsLength == 1){
                return nums[0];
            }

            leftMax = maxSubArray(subArray(nums, 0, middle));
            rightMax = maxSubArray(subArray(nums,middle,numsLength));

            int leftTemp = 0;
            int crossLeftMax = nums[middle-1];
            for(int i=middle-1;i>=0;i--){
                leftTemp = leftTemp + nums[i];
                if(leftTemp>crossLeftMax){
                    crossLeftMax = leftTemp;
                }
            }

            int rightTemp = 0;
            int crossRightMax = nums[middle];
            for(int i=middle;i<numsLength;i++){
                rightTemp = rightTemp + nums[i];
                if(rightTemp>crossRightMax){
                    crossRightMax = rightTemp;
                }
            }

            crossMax = crossLeftMax + crossRightMax;


        return max(leftMax,crossMax,rightMax);

        }

        public int[] subArray(int[] arrays,int start,int end){
            int subarrayLength = end-start;
            int[] subarray = new int[subarrayLength];
            System.arraycopy(arrays,start, subarray,0,subarrayLength);
            return subarray;
        }

        public int max(int... nums){
            int max = nums[0];
            for(int num : nums){
                if(num > max){
                    max = num;
                }
            }
            return max;
        }
    }

    public void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
    }
}
