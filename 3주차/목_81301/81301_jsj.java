import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 숫자_문자열과_영단어 {
	public static void main(String[] args) {
		String s = "one4seveneight";

		print(s);
	}

	private static void print(String s) {
		int solution = solution(s);
		System.out.println("solution = " + solution);
	}

	public static int solution(String s) {
		String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		Map<String, Integer> map = IntStream.range(0, arr.length)
			.boxed()
			.collect(Collectors.toMap(i -> arr[i], i -> i));
		StringBuilder sb = new StringBuilder();
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			try {
				sb.append(Integer.parseInt(String.valueOf(s.charAt(i))));
			} catch (NumberFormatException e) {
				str += String.valueOf(s.charAt(i));
				if (map.containsKey(str)) {
					sb.append(map.get(str));
					str = "";
				}
			}
		}
		return Integer.parseInt(sb.toString());
	}
}
