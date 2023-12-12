import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 제일_작은_수_제거하기 {
	public static void main(String[] args) {
		int[] arr = {1, 3, 4, 2};
		print(arr);
	}

	private static void print(int[] arr) {
		int[] solution = solution(arr);
		System.out.println("solution = " + Arrays.toString(solution));
	}

	public static int[] solution(int[] arr) {
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Integer min = Collections.min(list);
		int index = IntStream.range(0, list.size())
			.filter(i -> list.get(i).equals(min))
			.findFirst()
			.orElse(-1);
		list.remove(index);
		return list.isEmpty() ? new int[]{-1} : list.stream().mapToInt(Integer::intValue).toArray();
	}
}
