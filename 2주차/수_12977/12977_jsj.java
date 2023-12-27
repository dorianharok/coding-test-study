import java.util.Arrays;
import java.util.stream.IntStream;

public class 소수_만들기 {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};

		print(nums);
	}

	private static void print(int[] nums) {
		int solution = solution(nums);
		System.out.println("solution = " + solution);
	}

	public static int solution(int[] nums) {
		int answer = 0;
		int[] arr = IntStream.range(0, nums.length - 2)
			.boxed()
			.flatMap(i -> IntStream.range(i + 1, nums.length - 1)
				.boxed()
				.flatMap(j -> IntStream.range(j + 1, nums.length)
					.boxed()
					.map(k -> new int[] {nums[i], nums[j], nums[k]})
				)
			)
			.map(ints -> Arrays.stream(ints).sum())
			.sorted()
			.mapToInt(Integer::intValue)
			.toArray();

		for (int num : arr) {
			if (isPrime(num)) {
				answer ++;
			}
		}

		return answer;
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
