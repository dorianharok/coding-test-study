import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 추억_점수 {
	public static void main(String[] args) {
		String[] name = {"may", "kein", "kain", "radi"};
		int[] yearning = {5, 10, 1, 3};
		String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

		print(name, yearning, photo);

	}

	private static void print(String[] name, int[] yearning, String[][] photo) {
		int[] solution = solution(name, yearning, photo);
		System.out.println("solution = " + Arrays.toString(solution));
	}

	public static int[] solution(String[] name, int[] yearning, String[][] photo) {
		Map<String, Integer> map = IntStream.range(0, name.length).boxed()
			.collect(Collectors.toMap(i -> name[i], j -> yearning[j]));

		int[] answer = new int[photo.length];
		for (int i = 0; i < photo.length; i++) {
			for (int j = 0; j < photo[i].length; j++) {
				answer[i] += map.getOrDefault(photo[i][j], 0);
			}
		}
		return answer;
	}
}
