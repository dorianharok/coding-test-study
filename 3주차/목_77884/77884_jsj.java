import java.util.stream.IntStream;

public class 약수의_개수와_덧셈 {
	public static void main(String[] args) {
		int left = 13;
		int right = 17;

		print(left, right);
	}

	private static void print(int left, int right) {
		int solution = solution(left, right);
		System.out.println("solution = " + solution);
	}

	public static int solution(int left, int right) {
		return IntStream.range(left, right + 1)
			.map(i -> i % Math.sqrt(i) > 0 ? i : -i)
			.sum();
	}
}
