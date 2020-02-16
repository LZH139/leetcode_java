import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public static void main(String[] argv){
        PascalsTriangleII p = new PascalsTriangleII();
        p.out();
    }

    public void out(){
        Solution s = new Solution();
        s.getRow(4);
    }

//    class Solution {
//        public List<Integer> getRow(int rowIndex) {
//            ArrayList<Integer> result = new ArrayList<>();
//            result.add(1);
//            if(rowIndex == 0){
//                return result;
//            }
//            result.add(1);
//            if(rowIndex == 1){
//                return result;
//            }
//            for(int i=2;i<=rowIndex;i++){
//                result.add(0,1);
//                for(int j=1;j<i;j++){
//                    result.set(j,result.get(j)+result.get(j+1));
//                }
//            }
//            return result;
//        }
//
//    }
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res =new ArrayList<>(rowIndex +1);
        long cur=1;
        for(int i=0;i<=rowIndex;i++){
            res.add((int) cur);
            cur=cur*(rowIndex-i)/(i+1);
        }
        return res;
    }
}
}
