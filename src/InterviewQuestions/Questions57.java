package InterviewQuestions;

import java.util.ArrayList;

public class Questions57 {

    public static void main(String[] argv){
        Questions57 c = new Questions57();
        c.out();
    }

    public void out(){
        Solution s = new Solution();
        System.out.println(s.findContinuousSequence(15));
    }

    class Solution {
        public int[][] findContinuousSequence(int target) {
            int left = 1;
            int right = 1;
            int sum = 0;
            ArrayList<int[]> result =  new ArrayList<>();
            while (left<=target/2){
                sum = (right-left+1)*(left+right)/2;
                if(sum<target){
                    right++;
                }else if(sum>target){
                    left++;
                }else{
                    int[] li = new int[right-left+1];
                    for(int i=0;i<li.length;i++){
                        li[i] = left+i;
                    }
                    result.add(li);
                    right++;
                }
            }
            return result.toArray(new int[result.size()][]);
        }
    }

}
