import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 달리기_경주 {
	public static void main(String[] args) {
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};

		print(players, callings);
	}

	private static void print(String[] players, String[] callings) {
		String[] solution = solution(players, callings);
		System.out.println("solution = " + Arrays.toString(solution));
	}

	public static String[] solution(String[] players, String[] callings) {
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < players.length; i++) {
			map.put(players[i], i);
		}
		for (int i = 0; i < callings.length; i++) {
			Integer index = map.get(callings[i]);
			String player = players[index - 1];
			map.put(callings[i], index - 1);
			players[index - 1] = callings[i];
			map.put(player, index);
			players[index] = player;
		}
		return players;
	}
}
