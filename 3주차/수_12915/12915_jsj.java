import java.util.Arrays;
import java.util.Comparator;

public class 문자열_내_마음대로_정렬하기 {
	public static void main(String[] args) {
		String[] strings = {"sun", "bed", "car"};
		int n = 1;

		print(strings, n);
	}

	private static void print(String[] strings, int n) {
		String[] solution = solution(strings, n);
		System.out.println("solution = " + Arrays.toString(solution));
	}

	public static String[] solution(String[] strings, int n) {
		Arrays.sort(strings);
		Arrays.sort(strings, Comparator.comparing(i -> i.charAt(n)));
		return strings;
	}
}
