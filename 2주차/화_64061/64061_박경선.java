import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int cnt = 0;

        for(int i=0; i<moves.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[j][moves[i]-1] != 0){
                    if(stack.isEmpty()){
                        stack.push(board[j][moves[i]-1]);
                        board[j][moves[i]-1] = 0;
                        break;
                    }

                    if(stack.peek().equals(board[j][moves[i]-1])){
                        board[j][moves[i]-1] = 0;
                        stack.pop();
                        cnt++;
                        break;
                    }
                    stack.push(board[j][moves[i]-1]);
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }
        return cnt*2;
    }
}