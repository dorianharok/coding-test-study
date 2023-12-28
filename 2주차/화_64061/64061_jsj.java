import java.util.Stack;

public class 크레인_인형뽑기_게임 {
	public static void main(String[] args) {
		int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
		int[] moves = {1,5,3,5,1,2,1,4};

		print(board, moves);
	}

	private static void print(int[][] board, int[] moves) {
		int solution = solution(board, moves);
		System.out.println("solution = " + solution);
	}

	public static int solution(int[][] board, int[] moves) {
		int answer = 0;

		Stack<Integer> s = new Stack<>();

		for (int move : moves) {
			for (int i = 0; i < board.length; i++) {
				if (board[i][move - 1] != 0) {
					if (s.isEmpty()) {
						s.push(board[i][move - 1]);
						board[i][move-1] = 0;
						break;
					}
					if (board[i][move - 1] == s.peek()) {
						s.pop();
						answer += 2;
					} else {
						s.push(board[i][move - 1]);
					}
					board[i][move - 1] = 0;
					break;
				}
			}
		}
		return answer;
	}
}
