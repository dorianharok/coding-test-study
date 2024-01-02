import java.util.Arrays;

public class 예산 {
	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;

		print(d, budget);
	}

	private static void print(int[] d, int budget) {
		int solution = solution(d, budget);
		System.out.println("solution = " + solution);
	}

	public static int solution(int[] d, int budget) {
		int answer = 0;
		Arrays.sort(d);
		for (int i = 0; i < d.length; i++) {
			budget -= d[i];
			if (budget < 0) {
				break;
			}
			answer++;
		}
		return answer;
	}
}
