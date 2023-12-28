public class 이웃한_칸 {
	public static void main(String[] args) {
		String[][] board = {{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"},
			{"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}};
		int h = 1;
		int w = 1;

		print(board, h, w);
	}

	private static void print(String[][] board, int h, int w) {
		int solution = solution(board, h, w);
		System.out.println("solution = " + solution);
	}

	public static int solution(String[][] board, int h, int w) {
		int answer = 0;
		String color = board[h][w];
		int[] dw = {1, 0, 0, -1};
		int[] dh = {0, 1, -1, 0};

		for (int i = 0; i < 4; i++) {
			int nw = dw[i] + w;
			int nh = dh[i] + h;
			try {
				if (color.equals(board[nh][nw])) {
					answer++;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				continue;
			}
		}
		return answer;
	}
}
