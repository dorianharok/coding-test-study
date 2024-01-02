import java.util.Arrays;
import java.util.stream.IntStream;

public class 실패율 {
	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

		print(N, stages);
	}

	private static void print(int N, int[] stages) {
		int[] solution = solution(N, stages);
		System.out.println("solution = " + Arrays.toString(solution));
	}

	public static int[] solution(int N, int[] stages) {
		double[] failureRate = new double[N];

		int[] challengers = new int[N + 1];
		for (int stage : stages) {
			if (stage <= N) {
				challengers[stage - 1]++;
			}
		}

		int totalChallengers = stages.length;
		for (int i = 0; i < N; i++) {
			if (totalChallengers == 0) {
				failureRate[i] = 0;
			} else {
				failureRate[i] = (double)challengers[i] / totalChallengers;
				totalChallengers -= challengers[i];
			}
		}

		return IntStream.range(1, N + 1)
			.boxed()
			.sorted((a, b) -> {
				if (failureRate[a - 1] == failureRate[b - 1]) {
					return a - b;
				}
				return Double.compare(failureRate[b - 1], failureRate[a - 1]);
			})
			.mapToInt(Integer::intValue)
			.toArray();

	}
}
