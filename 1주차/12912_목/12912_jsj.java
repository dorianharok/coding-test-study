import java.util.stream.LongStream;

public class 두_정수_사이의_합 {
	public static void main(String[] args) {
		int a = 3;
		int b = 3;

		print(a, b);
	}

	private static void print(int a, int b) {
		long solution = solution(a, b);
		System.out.println("solution = " + solution);
	}

	public static long solution(int a, int b) {
		return a <= b ? LongStream.range(a, b + 1).sum() : LongStream.range(b, a + 1).sum();
	}
}
