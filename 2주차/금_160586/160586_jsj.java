import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 대충_만든_자판 {
	public static void main(String[] args) {
		String[] keymap = {"ABACD", "BCEFD"};
		String[] targets = {"ABCD","AABB"};

		print(keymap, targets);
	}

	private static void print(String[] keymap, String[] targets) {
		int[] solution = solution(keymap, targets);
		System.out.println("solution = " + Arrays.toString(solution));
	}

	public static int[] solution(String[] keymap, String[] targets) {
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < keymap.length; i++) {
			String[] str = keymap[i].split("");
			for (int j = 0; j < keymap[i].length(); j++) {
				if (map.containsKey(str[j])) {
					if (map.get(str[j]) > j + 1) {
						map.put(str[j], j + 1);
					}
				}
				map.putIfAbsent(str[j], j + 1);
			}
		}

		ArrayList<Integer> arr = new ArrayList<>();
		for (String tar : targets) {
			int cnt = 0;
			for (String str : tar.split("")) {
				if (!map.containsKey(str)) {
					cnt = map.getOrDefault(str, -1);
					break;
				}
				cnt += map.get(str);
			}
			arr.add(cnt);
		}
		return arr.stream().mapToInt(Integer::intValue).toArray();
	}
}
