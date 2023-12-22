import java.util.ArrayList;
import java.util.List;

public class 햄버거_만들기 {
	public static void main(String[] args) {
		int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};

		print(ingredient);
	}

	private static void print(int[] ingredient) {
		int answer = solution(ingredient);
		System.out.println("answer = " + answer);
	}

	public static int solution(int[] ingredient) {
		int answer = 0;
		List<Integer> arr = new ArrayList<>();
		for (int ind : ingredient) {
			arr.add(ind);
			if (arr.size() >= 4 && (arr.get(arr.size() - 4) == 1
				&& arr.get(arr.size() - 3) == 2
				&& arr.get(arr.size() - 2) == 3
				&& arr.get(arr.size() - 1) == 1)) {
				answer++;
				for (int i = 0; i < 4; i++) {
					arr.remove(arr.size() - 1);
				}
			}
		}

		return answer;
	}
}
