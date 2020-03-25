package Array;

import java.util.HashSet;
import java.util.Set;

public class FindWinnerOnATicTacToeGame {
    public static void main(String[] argv) {
        FindWinnerOnATicTacToeGame d = new FindWinnerOnATicTacToeGame();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[][] n = new int[][]{{0,0},{2,0},{1,1},{2,1},{2,2}};
        System.out.print(s.tictactoe(n));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public String tictactoe(int[][] moves) {
            int[] count = new int[8];
            int i=1;
            if(moves.length%2==1){
                i=0;
            }
            for(;i<moves.length;i+=2){
                count[moves[i][0]]++;
                count[moves[i][1]+3]++;
                if(moves[i][0] == moves[i][1]){
                    count[6]++;
                }
                if(moves[i][0] + moves[i][1]==2){
                    count[7]++;
                }
            }
            for(int j=0;j<count.length;j++){
                if (count[j] == 3){
                    return i%2==1?"B":"A";
                }
            }
            return moves.length==9?"Draw":"Pending";
        }
    }

}
    