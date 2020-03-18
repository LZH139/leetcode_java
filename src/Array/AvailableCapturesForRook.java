package Array;

import java.util.HashSet;
import java.util.Set;

public class AvailableCapturesForRook {
    public static void main(String[] argv) {
        AvailableCapturesForRook d = new AvailableCapturesForRook();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        char[][] board = new char[][]{{'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'p','p','.','R','.','p','B','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','B','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'}};
        System.out.print(s.numRookCaptures(board));
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public int numRookCaptures(char[][] board) {
            int[][] list = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
            int sum = 0;
            int ylength = board.length;
            int xlength = board[0].length;
            for(int i=0;i<ylength;i++){
                for(int j=0;j<xlength;j++){
                    if(board[i][j]=='R'){
                        for(int[] s:list){
                            int nx = j;
                            int ny = i;
                            while (0<=nx && nx<xlength && 0<=ny && ny<ylength){
                                if(board[ny][nx] == 'B'){
                                    break;
                                }else if(board[ny][nx] == 'p'){
                                    sum++;
                                    break;
                                }
                                nx+=s[0];
                                ny+=s[1];
                            }
                        }
                    }
                }
            }
            return sum;
        }
    }

}
    