import java.util.Arrays;
import java.util.stream.LongStream;

public class x만큼_간격이_있는_n개의_숫자 {
	public static void main(String[] args) {
		int x = 2;
		int n = 5;

		print(x, n);
	}

	private static void print(int x, int n) {
		long[] solution = solution(x, n);
		System.out.println("solution = " + Arrays.toString(solution));
	}

	public static long[] solution(int x, int n) {
		return LongStream.range(0, n)
			.map(i -> x * (i + 1))
			.toArray();
	}
}
