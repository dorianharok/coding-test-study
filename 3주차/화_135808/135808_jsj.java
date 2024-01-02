import java.util.Arrays;

public class 과일_장수 {
	public static void main(String[] args) {
		int k = 3;
		int m = 4;
		int[] score = {1, 2, 3, 1, 2, 3, 1};

		print(k, m, score);
	}

	private static void print(int k, int m, int[] score) {
		int solution = solution(k, m, score);
		System.out.println("solution = " + solution);
	}

	public static int solution(int k, int m, int[] score) {
		int answer = 0;
		Arrays.sort(score);
		for (int i = score.length; i >= m; i -= m) {
			answer += score[i - m] * m;
		}
		return answer;
	}
}
