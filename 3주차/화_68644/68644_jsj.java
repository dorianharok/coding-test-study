import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 두_개_뽑아서_더하기 {
	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};

		print(numbers);
	}

	private static void print(int[] numbers) {
		int[] solution = solution(numbers);
		System.out.println("solution = " + solution);
	}

	public static int[] solution(int[] numbers) {
		List<Integer> list = IntStream.range(0, numbers.length)
			.flatMap(i -> IntStream.range(i + 1, numbers.length)
				.map(j -> numbers[i] + numbers[j]))
			.boxed()
			.collect(Collectors.toList());
		TreeSet<Integer> set = new TreeSet<>(list);
		return set.stream().mapToInt(Integer::intValue).toArray();
	}
}
