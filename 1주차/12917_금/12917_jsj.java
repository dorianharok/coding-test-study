import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class 문자열_내림차순으로_배치하기 {
	public static void main(String[] args) {
		String s = "Zbcdefg";

		print(s);
	}

	private static void print(String s) {
		String solution = solution(s);
		System.out.println("solution = " + solution);
	}

	public static String solution(String s) {
		return Arrays.stream(s.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
	}
}
