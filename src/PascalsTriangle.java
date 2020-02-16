import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] argv){
        PascalsTriangle p = new PascalsTriangle();
        p.out();
    }

    public void out(){
        Solution s = new Solution();
        s.generate(5);
    }
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> result = new ArrayList<>();
            if(numRows == 0){
                return result;
            }
            result.add(new ArrayList<Integer>(Arrays.asList(1)));
            if(numRows == 1){
                return result;
            }
            result.add(new ArrayList<Integer>(Arrays.asList(1,1)));
            if(numRows == 2){
                return result;
            }
            for(int i=3;i<=numRows;i++){
                List<Integer> list = new ArrayList<>();
                for(int j=0;j<i;j++){

                    if(j == 0 || j == i-1){
                        list.add(1);
                    }else{
                        int a = result.size();
                        list.add(result.get(result.size()-1).get(j-1)+result.get(result.size()-1).get(j));
                    }
                }
                result.add(list);

            }
            return result;
        }
    }
}
