// Solution 1

// [0,0,0,0,0]
// [0,0,1,0,3]
// [0,2,5,0,1]
// [4,2,4,4,2]
// [3,5,1,3,1]
// 4, 3, 1, 1, 3, 2, , 4

import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int cnt = 0;
        Stack<Integer> bascket = new Stack<>();

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i]-1] != 0) {
                    if (!bascket.isEmpty() && bascket.peek() == board[j][moves[i]-1]) {
                        board[j][moves[i]-1] = 0;
                        // System.out.println("pop: " + bascket.peek());
                        bascket.pop();
                        cnt += 2;
                        break;
                    } else {
                        bascket.push(board[j][moves[i]-1]);
                        // System.out.println("push: " + board[j][moves[i]-1]);
                        board[j][moves[i]-1] = 0;
                        break;
                    }
                }
            }
        }
        return cnt;
    }
}