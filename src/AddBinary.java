public class AddBinary {
    public static void main(String[] argv){
        AddBinary c = new AddBinary();
        c.out();
    }

    public void out(){
        Solution s = new Solution();
        System.out.println(s.addBinary("1010","1011"));
    }

    class Solution {
        public String addBinary(String a, String b) {
            int aLength = a.length();
            int bLength = b.length();
            StringBuilder a1 = new StringBuilder(a).reverse();
            StringBuilder b1 = new StringBuilder(b).reverse();
            StringBuilder sb = new StringBuilder();
            if(aLength>bLength){
                for(int i=0;i<aLength-bLength;i++){
                    b1.append("0");
                }
            }else{
                for(int i=0;i<bLength-aLength;i++){
                    a1.append("0");
                }
            }
            boolean flag = false;
            for(int i=0;i<aLength;i++){

            }
            return "a";
        }
    }

}
