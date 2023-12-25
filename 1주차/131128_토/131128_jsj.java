import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class 숫자_짝꿍 {
	public static void main(String[] args) {
		String X = "100";
		String Y = "203045";

		print(X, Y);
	}

	private static void print(String X, String Y) {
		String solution = solution(X, Y);
		System.out.println("solution = " + solution);
	}

	public static String solution(String X, String Y) {
		Map<String, Long> mapX = Arrays.stream(X.split(""))
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Map<String, Long> mapY = Arrays.stream(Y.split(""))
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		ArrayList<String> arr = new ArrayList<>();

		for (String key : mapX.keySet()) {
			int length = (int)Math.min(mapX.get(key), mapY.getOrDefault(key,0L));
			for (int i = 0; i < length; i++) {
				arr.add(key);
			}
		}

		String answer = arr.stream().sorted(Comparator.reverseOrder()).collect(Collectors.joining());
		return answer.isEmpty() ? "-1" : answer.replaceAll("0","").isEmpty() ? "0" : answer;
	}
}
