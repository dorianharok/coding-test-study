public class 덧칠하기 {
	public static void main(String[] args) {
		int n = 8;
		int m = 4;
		int[] section = {2, 3, 6};

		print(n, m, section);
	}

	private static void print(int n, int m, int[] section) {
		int solution = solution(n, m, section);
		System.out.println("solution = " + solution);
	}

	public static int solution(int n, int m, int[] section) {
		int answer = 0;
		int color = section[0]-1;
		for (int sec : section) {
			if (color < sec) {
				color = sec + m - 1;
				answer++;
			}
		}
		return answer;
	}
}
