import java.util.Arrays;
import java.util.stream.IntStream;

public class 삼총사 {
	public static void main(String[] args) {
		int[] number = {-2, 3, 0, 2, -5};

		print(number);
	}

	private static void print(int[] number) {
		int solution = solution(number);
		System.out.println("solution = " + solution);
	}

	public static int solution(int[] number) {
		return (int)IntStream.range(0, number.length - 2)
			.boxed()
			.flatMap(i -> IntStream.range(i + 1, number.length - 1)
				.boxed()
				.flatMap(j -> IntStream.range(j + 1, number.length)
					.filter(k -> i != j && i != k && j != k)
					.mapToObj(k -> new int[] {number[i], number[j], number[k]})))
			.filter(ints -> Arrays.stream(ints).sum() == 0)
			.count();
	}

}
