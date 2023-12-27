import java.util.Arrays;

public class 없는_숫자_더하기 {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};

		print(numbers);
	}

	private static void print(int[] numbers) {
		int solution = solution(numbers);
		System.out.println("solution = " + solution);
	}

	public static int solution(int[] numbers) {
		int sum = Arrays.stream(numbers).sum();
		return 45-sum;
	}
}
