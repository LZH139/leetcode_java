package Common;
import java.util.Random;

public class random {
//    public int[] getrandom(int num){
//        int[] a = new int[num];
//        Random r = new Random();
//        for(int i=0;i<num;i++){
//            a[i] = (int)(r.nextDouble()*4)*10+ (int)(r.nextDouble()*10);
//        }
//        return a;
//    }
    public int[] getrandom(int num){
        int[] a = new int[num];
        Random r = new Random();
        int cur = 0;
        int temp;
        while(cur != num){
            temp = ((int)(1+r.nextDouble()*3)*10)+ (1+(int)(r.nextDouble()*9));
            a[cur] = temp;
            cur++;
        }
        return a;
    }


    public static void main(String[] argv){
        random r = new random();
        int[] b = r.getrandom(1);
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
