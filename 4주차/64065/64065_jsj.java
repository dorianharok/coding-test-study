import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 튜플 {
	public static void main(String[] args) {
		String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";

		print(s);
	}

	private static void print(String s) {
		int[] solution = solution(s);
		System.out.println("solution = " + Arrays.toString(solution));
	}

	public static int[] solution(String s) {
		int[] ints = Arrays.stream(s.split("[{},]+"))
			.filter(str->!str.isEmpty())
			.mapToInt(Integer::parseInt)
			.toArray();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : ints) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		int size = map.size();
		int[] answer = new int[size];
		for (Integer key : map.keySet()) {
			answer[size-map.get(key)] = key;
		}
		return answer;
	}
}
