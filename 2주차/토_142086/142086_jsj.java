import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 가장_가까운_같은_글자 {
	public static void main(String[] args) {
		String s = "banana";

		int[] solution = solution(s);
		System.out.println("solution = " + Arrays.toString(solution));
	}

	public static int[] solution(String s) {
		char[] chars = s.toCharArray();
		List<Integer> arr = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {
			String substring = s.substring(0, i + 1);
			if (substring.contains(String.valueOf(chars[i]))) {
				arr.add(-1);
			}
			for (int j = substring.length() - 2; j >= 0; j--) {
				if (substring.charAt(j) == chars[i]) {
					arr.remove(i);
					arr.add(substring.length() - j - 1);
					break;
				}
			}
		}
		return arr.stream().mapToInt(Integer::intValue).toArray();
	}
}
